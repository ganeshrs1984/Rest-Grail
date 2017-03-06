package com.request.validation

import grails.validation.Validateable
import org.grails.databinding.BindingFormat

@Validateable
class PhoneRequestCommand {

	String controller
	String action
	String phone
	
	static constraints = {
		phone blank : false , nullabale:false , validator: { val,obj ->
			if(phone.length() < 10){
				return 'profile.phone.validation'
			}
			
		}
	}
}
