Feature: Validate OrangeHRM Login Functionality 



Scenario: validate login with valid login credentials
Given User is on the login page
When User enters valid username
And User enters valid password
Then User should be logged in successfully
	
	
	
#Scenario: Validate Login with Invalid credentials 
#Given User is on Login Page 
#When User enters incorrect username 
#And User enters incorrect password 
#Then User should not be allowed to logged in
	
#Scenario outline: Validate Login with multiple users
#Given User is on Login Page 
#When User enters <username> 
#And User enters <password >
#Then User should not be allowed to logged in
