package com.profile.service

import grails.test.mixin.*
import spock.lang.Specification
import spock.lang.Unroll

import com.applicant.profile.Experience
import com.applicant.profile.Profile
import com.applicant.proileDao.ProfileDaoService
import com.profile.exception.ProfileException
import com.request.validation.CommonUtil

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(ProfileService)
@Mock([Profile,Experience])
class ProfileServiceSpec extends Specification {
	ProfileDaoService profileDaoServiceMock
	
    def setup() {
		GroovySpy(CommonUtil,global:true)
		profileDaoServiceMock = Mock(ProfileDaoService)
		service.profileDaoService = profileDaoServiceMock
    }

    def cleanup() {
    }

	@Unroll
    void "test getProfileBO with Valid Phone Number"() {
		
		def profile  = new Profile(phone:"6121111111",name:"Rob Sam",totExp:10,email:"test1@gmail.com")
		.addToExperiences(new Experience(tech:'Java',client:'Target',exp:7))
		.addToExperiences(new Experience(tech:'Grails',client:'Nationwide',exp:2.5))
		.save(validate:false)
	
		
		when:
			def output = service.getProfileBO("6121111111")
			
		then:
		1*CommonUtil.isPhoneNumberValid(*_) >> true 
		1*profileDaoServiceMock.getProfileByPhoneNumber(_) >> profile
		output.phone == "6121111111"
		      
        
    }
	
	void "test getProfileBO with inValid Phone Number"() {
		
		def profile  = new Profile(phone:"6121111111",name:"Rob Sam",totExp:10,email:"test1@gmail.com")
		.addToExperiences(new Experience(tech:'Java',client:'Target',exp:7))
		.addToExperiences(new Experience(tech:'Grails',client:'Nationwide',exp:2.5))
		.save(validate:false)
	
		
		when:
			def output = service.getProfileBO("6121111111")
			
		then:
		println output
		1*CommonUtil.isPhoneNumberValid(*_) >> false
//		[0..1]*profileDaoServiceMock.getProfileByPhoneNumber(_) >> profile
		thrown ProfileException
	}
}
