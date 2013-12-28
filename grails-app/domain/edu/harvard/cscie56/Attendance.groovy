package edu.harvard.cscie56

import grails.validation.Validateable

@Validateable
class Attendance {

	String service
	Date serviceDate
	Long memberNumber
	Long guestNumber
	Long childrenNumber
	Long adultsNumber
    static constraints = {
		
    }
	
	static mapping = {
		cache true
		serviceDate column: 'serviceDate', index: 'servicedate_Idx'
	}
	
}
