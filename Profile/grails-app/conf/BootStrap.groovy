import com.applicant.profile.Experience
import com.applicant.profile.Profile
import com.test.Author
import com.test.Book

class BootStrap {

    def init = { servletContext ->

/*		new Profile(phone:"6121111111")
		.addToExperiences(new Experience(client:'Target'))
		.addToExperiences(new Experience(client:'Best Buy'))
		.save()
		
		new Profile(phone:"6121111112")
		.addToExperiences(new Experience(client:'Target'))
		.addToExperiences(new Experience(client:'Chase'))
		.save()*/
		
 		new Profile(phone:"6121111111",name:"Rob Sam",totExp:10,email:"test1@gmail.com")
		.addToExperiences(new Experience(tech:'Java',client:'Target',exp:7))
		.addToExperiences(new Experience(tech:'Grails',client:'Nationwide',exp:2.5))
		.save()
		
		new Profile(phone:"6121111112",name:"Test Last",totExp:8,email:"test2@gmail.com")
		.addToExperiences(new Experience(tech:'Camel',client:'Chase',exp:3))
		.addToExperiences(new Experience(tech:'RUBY',client:'Nationwide',exp:5))
		.save()
		
		new Author(name:"Stephen King")
		.addToBooks(new Book(title:"The Stand"))
		.addToBooks(new Book(title:"The Shining"))
		.save()
    }
    def destroy = {
		
    }
}
