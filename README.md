Grails RestService API
-----------------------------

Developed a Profile Restservice 

GET Method -  fetch profile details by phone number and render JSON reponse


Technology Used
----------------

 Grails
 Groovy
 Spock Test case
 H2 Inbuit memory DB
 Maven
 Spoc for Unit test cases
 

Code Walkthrough
-----------------

The Rest Service fetches the Profile Details from the database by PhoneNumber
Controller => Service => DAO (Uses Dynamic Finders) 
CommonUtil is a static class which helps to validate the input Phone Number
DAO - Uses GORM dynamic finders to fetch details from H2 Inbuild memory Database
messages.properties INTERNATIONALIZATION feature, configured the Client response messages 
URL Mapping -> Mapped the URL with the action

Validation
------------------------------------

phone should be numeric 
name should not be empty
exp should be > 0
email : email format
tech should not be empty

<p style="color:green;">GET   - Get Profile details by phone number    - Goor Response <p>
