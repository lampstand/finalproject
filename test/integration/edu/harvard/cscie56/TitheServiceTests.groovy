package edu.harvard.cscie56;
 
import edu.harvard.cscie56.Member
import edu.harvard.cscie56.Tithe
import edu.harvard.cscie56.MemberService
import edu.harvard.cscie56.TitheService

import org.junit.*;
 
/**
* @author A17852
*
*/
class TitheServiceTests extends GroovyTestCase {
                static transactional = true
                /**
                * @throws java.lang.Exception
                */
                def cmd
                def titheService = new TitheService()
				def controller = new TitheController()
				
                @Before
                public void setUp() throws Exception {
                                cmd = new TitheCommand()
								def members = new Member(fullname: 'Hubert Boateng',email:'hkboateng@gmail.com',phone: '234-423-7321',address: '23 Oaks Dr',address1: '#5',gender: 'female',
															agegroup: '18-24',city:'Pawtucket',state:'RI',zip: 01524).save()
								cmd.member = members
							   
                                cmd.titheID = 1
                }
 
                /**
                * Test method for {@link edu.harvard.cscie56.TitheService#saveTithe(edu.harvard.cscie56.TitheCommand)}.
                */
                @Test
                public void testSaveTithe() {
                                controller.titheService.saveTithe(cmd)
                                assert Tithe.count() == 4
                }
               
                @Test
                public void testUpdateTithe(){
                                def titheInstance = controller.titheService.saveTithe(cmd)
 
                                cmd.titheID = 2
                                def updateInstance =controller.titheService.updateTithe(titheInstance,cmd)
                               
                                assert updateInstance != null
                                updateInstance.titheID == 2
                               
                }
				
				@Test
				public void testSearchTithe(){
					 controller.titheService.saveTithe(cmd)
					 def titheInstance = controller.titheService.searchTithe(1)
					 
					 assert titheInstance.member.fullname == 'Hubert Boateng'
				}
 
}