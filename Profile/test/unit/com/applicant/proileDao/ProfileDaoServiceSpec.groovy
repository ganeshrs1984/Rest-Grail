package com.applicant.proileDao

import grails.test.mixin.*
import spock.lang.Specification

import com.applicant.profile.Experience
import com.applicant.profile.Profile
import com.profile.exception.ProfileException

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(ProfileDaoService)
@Mock([Profile,Experience])
class ProfileDaoServiceSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "getProfileByPhoneNumber valid data"() {
		def profile  = new Profile(phone:"6121111111",name:"Rob Sam",totExp:10,email:"test1@gmail.com")
		.addToExperiences(new Experience(tech:'Java',client:'Target',exp:7))
		.addToExperiences(new Experience(tech:'Grails',client:'Nationwide',exp:2.5))
		.save(validate:false)
		
		when:
		def output = service.getProfileByPhoneNumber("6121111111")
		
		then:
		output.phone == "6121111111"
		notThrown ProfileException
		
    }
}
