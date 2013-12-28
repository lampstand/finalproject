package edu.harvard.cscie56
import edu.harvard.cscie56.TitheCommand
import grails.transaction.Transactional

@Transactional
class TitheService {

    def saveTithe(TitheCommand cmd) {
        def titheInstance = new Tithe(member: cmd.member, titheID: cmd.titheID)
        titheInstance.save(flush: true)
        return titheInstance
    }
    
    def updateTithe(Tithe titheInstance,TitheCommand cmd){
         titheInstance.properties['member','titheID'] = cmd.properties
		titheInstance.save(flush:true)
		return titheInstance        
    }
    
    def searchTithe(Long titheID){
        def titheInstance = Tithe.findByTitheID(titheID)
        return titheInstance
    }
}
