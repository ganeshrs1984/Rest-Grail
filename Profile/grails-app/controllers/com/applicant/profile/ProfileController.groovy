package com.applicant.profile


import grails.converters.deep.XML
import grails.web.RequestParameter
import com.profile.exception.*

class ProfileController {
	
	def profileService

	def beforeInterceptor = [action:this.&loadData]
	
	private loadData(){
		 
	}
	
	
    def getProfileByPhone(@RequestParameter('phone') String phoneNumber) {	
		try {
			render profileService.getProfileBO(phoneNumber) as XML	
		}catch(ProfileException e){
		  render e.profileError as XML   
		}	 
	}
	
}
