package com.applicant.profile

import grails.test.mixin.Mock
import grails.test.mixin.TestFor
import spock.lang.Specification

import com.profile.service.ProfileService

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestFor(ProfileController)
@Mock([Profile,Experience])
class ProfileControllerSpec extends Specification {

    def setup() {
		ProfileService profileServiceMock
		profileServiceMock = Mock(ProfileService)
		controller.profileService = profileServiceMock
		
    }

    def cleanup() {
    }

    void "getProfileByPhone Valid Phone"() {
		
		def profile  = new Profile(phone:"6121111111",name:"Rob Sam",totExp:10,email:"test1@gmail.com")
		.addToExperiences(new Experience(tech:'Java',client:'Target',exp:7))
		.addToExperiences(new Experience(tech:'Grails',client:'Nationwide',exp:2.5))
		.save(validate:false)
		
		when:
		def output = controller.getProfileByPhone("6121111111")
		
		then:
		
		1 * profileServiceMock.getProfileBO(*_) >> profile
			
    }
}
