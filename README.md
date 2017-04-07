Grails RestService API
-----------------------------

Developed a Profile Restservice 

GET Method -  fetch profile details by phone number and render JSON reponse


Technology Used
----------------

 1, Grails <br>
 2, Groovy <br>
 3, Test Framework - Spock <br>
 4, H2 Inbuit memory DB <br>
 5, Maven <br>
 6, Hibernate/GORM - One to Many Relationship <br>
 

Code Walkthrough
-----------------

The Rest Service fetches the Profile Details from the database by PhoneNumber <br>
Controller => Service => DAO (Uses Dynamic Finders) <br>
CommonUtil is a static class which helps to validate the input Phone Number<br>
DAO - Uses GORM dynamic finders to fetch details from H2 Inbuild memory Database<br>
messages.properties INTERNATIONALIZATION feature, configured the Client response messages <br>
URL Mapping -> Mapped the URL with the action<br>

Validation  - Using Command Objects
-----------------------------------

1 - Phone should be numeric <br>
2 - Name should not be empty <br>
3 - Exp should be > 0 <br>
4 - Email : email format <br>
5 - Tech should not be empty <br>

GET   - Get Profile details <br>

	Valid Phone number    - Goor Response 
	--------------------------------------

	eg: 
	URL - http://localhost:8080/profile/profile?phone=6121111111  
	URL - http://localhost:8080/profile/profile?phone=6121111112


	Phone Number Not Found - 
	-------------------------

	URL - http://localhost:8080/profile/profile?phone=6121111117


 	2) Invalid PhoneNumber 
	-----------------------

	URL - http://localhost:8080/profile/profile?phone=6121111A
	URL - http://localhost:8080/profile/profile?phone=6121111111111111


POST - Under work 
