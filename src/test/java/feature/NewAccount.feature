@New_Acc
Feature: Techfios bank and cash New Account Funtionality

Background:
  Given User is on  Techfios  the login  page     

@NewAccount
Scenario Outline:User should be able to login with valid credentials and add  new account
	When User enters the "<username>" and "<password>"  
	And  User clicks on login buttons	
	Then User should be able to see the dashboard 
	Then User clicks on bank and cash 
	Then User clicks on new account 
	Then User fill up the form entering "<accountTitle>" and "<description>"and "<initialBalance>" and "<accontNumber>" and "<contactperson>"and "<phone>"and "<internetBankingurl>"and clicks on submit button
	Then User should be able to see validate
	
	Examples:
		|username         | password| accountTitle| description| initialBalance| accountNumber| contactPerson| phone| internetBankingurl|
		|demo@techfios.com|abc123|checkingAccount|NewAccount|20000|434343434|jenny willis|3434343434|https://www.chasebank.com|