package edu.harvard.cscie56;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

class OfferingServiceTests {

	def controller = new OfferingController()
	def offeringService = new OfferingService()
	def cmd
	@Before
	public void setUp() throws Exception {
		cmd = new OfferingCommand()
		cmd.service = 'Sunday Worship'
		cmd.amountCheck = 200
		cmd.amountCash = 340
		cmd.offeringDate = new Date('12/22/2013')
		cmd.approvedBy = 'Hubert Boateng'
	}

	@Test
	public void testSaveOffering() {
		def offeringInstance = controller.offeringService.saveOffering(cmd)
		
		assert offeringInstance !=null
		assert Offering.count() == 1
	}
	@Test
	public void testUpdateOffering(){
		def offering = controller.offeringService.saveOffering(cmd)
		assert offering.id == 1
		cmd.amountCheck = 500
		cmd.amountCash = 324
		def offeringInstance = controller.offeringService.updateOffering(cmd,offering)
		
		assert offeringInstance.amountCheck == 500
		assert offeringInstance.amountCash == 324
		
	}
	
	@Test
	public void testSearchOffering(){
		controller.offeringService.saveOffering(cmd)
		def offeringDate = new Date('12/22/2013')
		def offeringInstance = offeringService.searchOffering(offeringDate)
	}

}
