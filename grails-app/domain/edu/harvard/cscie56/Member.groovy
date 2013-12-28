package edu.harvard.cscie56

import java.util.Date;

import edu.harvard.cscie56.User

class Member {

	String fullname
	String email
	String phone
	String gender
        String agegroup
        String address
        String address1
        String city
        String state
        String zip
        
    static constraints= {
		email email: true
		phone phoneUS: true
		address1 nullable: true
    }
	
	static mapping = {
		table 'members'
		cache true
	}
}
