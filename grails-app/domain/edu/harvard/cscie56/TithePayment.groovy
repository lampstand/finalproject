package edu.harvard.cscie56

class TithePayment {
	Tithe tithe
	Number amount
	Date datePaid
	String titheMonth
	String titheYear
	String acceptedBy
    static constraints = {
    }
	
	static mapping = {
		cache true
	}
}
