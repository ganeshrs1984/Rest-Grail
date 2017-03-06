package com.applicant.profile


import grails.rest.Resource

import javax.persistence.Column
import javax.persistence.Id

@Resource(uri='/profile/all')
class Profile {
	static hasMany = [experiences : Experience]
	String phone
	String name
	int totExp
	String email
	
	
    /*static constraints = {
    }
	static mapping = {
  		version false
	    id name : 'phone'
		phone column : 'PHONE'
	}
	*/
	
}
