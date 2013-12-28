/**
 *
 */
package edu.harvard.cscie56;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

/**
 * @author A17852
 *
 */

class TithePaymentServiceTests extends GroovyTestCase{
	def cmd
	def tithePaymentService = new TithePaymentService()
	def controller = new TithePaymentController()
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		cmd = new TithePaymentCommand()
		def members = new Member(fullname: 'Hubert Boateng',email:'hkboateng@gmail.com',phone: '234-423-7321',address: '23 Oaks Dr',address1: '#5',gender: 'female',
															agegroup: '18-24',city:'Pawtucket',state:'RI',zip: 01524).save()
		def tithe = new Tithe(titheID: 1, member: members).save()
		cmd.tithe = tithe
		cmd.amount = 200
		cmd.datePaid = new Date('12/23/2013')
		cmd.titheMonth = 'June'
		cmd.titheYear = '2013'
		cmd.acceptedBy = 'Gina'
	}

	/**
	 * Test method for {@link edu.harvard.cscie56.TithePaymentService#tithePayment(java.lang.Long, java.lang.String)}.
	 */
	@Test
	public void testTithePayment() {
		def tithePaymentInstance = controller.tithePaymentService.savePayment(cmd)

		def resultInstance = controller.tithePaymentService.tithePayment(1,'2013')
		assert resultInstance != null

		resultInstance.titheYear == '2013'
		resultInstance.acceptedBy == 'Gina'
	}

	/**
	 * Test method for {@link edu.harvard.cscie56.TithePaymentService#savePayment(edu.harvard.cscie56.TithePaymentCommand)}.
	 */
	@Test
	public void testSavePayment() {
		controller.tithePaymentService.savePayment(cmd)

		assert TithePayment.count() == 1
		assert TithePayment.list() != null
	}
	
	@Test
	public void testUpdatePayment(){
		def tithepayment = controller.tithePaymentService.savePayment(cmd)
		cmd.amount = 356
		cmd.titheMonth = 'July'
		
		def tithePaymentInstance = controller.tithePaymentService.updatePayment(cmd,tithepayment)
		
		tithePaymentInstance.amount != 200
		tithePaymentInstance.titheMonth == 'July'
		tithePaymentInstance.amount == 356
	}

}