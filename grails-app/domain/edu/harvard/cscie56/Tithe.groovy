package edu.harvard.cscie56

class Tithe {

	Long titheID
	Member member
    static constraints = {
		member unique: true
    }
}
