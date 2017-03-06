package com.profile.service

import grails.transaction.Transactional

import com.profile.exception.ProfileError
import com.profile.exception.ProfileException
import com.request.validation.CommonUtil
import org.springframework.context.i18n.LocaleContextHolder as LCH
import grails.util.Holders;

@Transactional
class ProfileService {

	def  ProfileDaoService
	
    def getProfileBO(phoneNumber) {
		if(CommonUtil.isPhoneNumberValid(phoneNumber)){
			ProfileDaoService.getProfileByPhoneNumber(phoneNumber)
		}else{
			throw (new ProfileException(profileError: (new ProfileError(httpCode:'400',errorDetails:"Given Phone number is not valid"))))
		}
		
    }
	
	
}
