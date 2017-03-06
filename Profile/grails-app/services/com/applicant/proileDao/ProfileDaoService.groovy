package com.applicant.proileDao

import grails.transaction.Transactional

import org.codehaus.groovy.control.messages.Message

import com.applicant.profile.Profile
import com.profile.exception.ProfileError
import com.profile.exception.ProfileException
import com.sun.xml.internal.ws.server.provider.SOAPProviderArgumentBuilder.MessageSource;


@Transactional
class ProfileDaoService {


    def getProfileByPhoneNumber(phoneNumber) {
		Profile out =  Profile.findByPhone(phoneNumber)
        if(!out){
		  throw (new ProfileException(profileError: (new ProfileError(httpCode:'400',errorDetails:"Given Phone number not found in the system"))))
 
		}
		return out
    }
}
