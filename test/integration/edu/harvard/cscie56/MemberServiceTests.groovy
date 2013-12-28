package edu.harvard.cscie56;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

class MemberServiceTests {

	def cmd
	def memberService = new MemberService()
	def controller = new MemberController()
	
	@Before
	public void setUp()  throws Exception{
		cmd = new MemberCommand()
		cmd.fullname = 'Hubert Boateng'
		cmd.email = 'hkboateng@gmail.com'
		cmd.phone = '346-234-1234'
		cmd.gender= 'male'
		cmd.address = '800 Timber Oaks Drive'
		cmd.address1 = ''
		cmd.city = 'Pawtucket'
		cmd.state = 'RI'
		cmd.zip = 02145
		cmd.agegroup = '18-25'
	}
	@Test
	public void testSaveMember() {

		controller.memberService.saveMember(cmd)

		assert Member.count() == 2

	}

	@Test
	void testUpdateMember(){
		def member = controller.memberService.saveMember(cmd)
		cmd.fullname = 'Gina Yeboah'
		def update = controller.memberService.updateMember(member,cmd)

		assert update.fullname != 'Hubert Boateng'
		update.fullname == 'Gina Yeboah'
	}

	@Test
	public void testSearchPhone(){
		def member = controller.memberService.saveMember(cmd)

		def search = controller.memberService.searchPhone(cmd)
		assert search != null
	}

	@Test
	public void testSearchEmail(){
		def member = controller.memberService.saveMember(cmd)

		def search = controller.memberService.searchEmail(cmd)

		assert search != null
	}

	@Test
	public void testSearchName(){
		def member = controller.memberService.saveMember(cmd)

		def search = controller.memberService.searchEmail(cmd)
		assert search != null
	}
}
