package edu.harvard.cscie56

import org.springframework.dao.DataIntegrityViolationException

import grails.plugin.springsecurity.annotation.Secured
@Secured('ROLE_ADMIN')
class TitheController {

    def titheService
    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        [titheInstanceList: Tithe.list(params), titheInstanceTotal: Tithe.count()]
    }

    def create() {
       render view: 'create'
    }

    def save(TitheCommand cmd) {
        def titheInstance = titheService.saveTithe(cmd)
		if(titheInstance.hasErrors()){
			flash.message ='These errors occured while saving Tithe Information. Correct them and try again'
			redirect(action: "create", model: [titheInstance: titheInstance])
			return
		}
        
        if (!titheInstance) {
            flash.message =='These errors occured while saving Tithe Information. Correct them and try again'
            redirect(action: "create", model: [titheInstance: titheInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'tithe.label', default: 'Tithe'), titheInstance.id])
        redirect(action: "show", id: titheInstance.id)
    }

    def show(Long id) {
        def titheInstance = Tithe.get(id)
        if (!titheInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'tithe.label', default: 'Tithe'), id])
            redirect(action: "list")
            return
        }

        [titheInstance: titheInstance]
    }

   

    def searchTithe(Long id){
        def titheInstance = titheService.searchTithe(id)
    }
}
class TitheCommand{
        Long id
        Long version
	Long titheID
	Member member
    static constraints = {
		member unique: true
    }
}