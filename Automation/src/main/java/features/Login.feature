Feature: Application Login

	Scenario: Home page default login

	Given user is on Netbanking page
	When user login into application with "janet" and "123pass"
	Then home page is populated 
	And cards are displayed are "true" 
	
	Scenario: Home page default login
	Given user is on Netbanking page
	When user login into application with username and password
	Then home page is populated 
	And cards are displayed are "false"
	
	Scenario: Home page default login
	Given user is on Netbanking page
	When user sign up with following details 
	|jenny | abcd | jenny@aol.com | Australia | 2315647897 |
	Then home page is populated 
	And cards are displayed are "true"
	
	Scenario Outline: Home page default login

	Given user is on Netbanking page
	When user login in to application with <Username> and <Password>
	Then home page is populated 
	And cards are displayed are "true" 
	
	Examples:
	|Username|Password|
	|user1|pass1|
	|user2|pass2|
	|user3|pass3|
	|user4|pass4|
	|user5|pass5|