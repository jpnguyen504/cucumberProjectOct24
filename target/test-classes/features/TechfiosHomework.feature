Feature: Codefios Other Add New Account validation


Background: 
	Given User is on the codefios login page

@Homework1
	Scenario Outline: User should  be able to login with valid credentials and open a new account
		When User enters the "<username>" in the "username" field
		When User enters the "<password>" in the "password" field
		And User clicks on "login"
		Then User should land on Dashboard page 
		And User clicks on "listAccounts"
		And User clicks on "addAccount"
		And User enters "<accountName>" in the "accountName" field in accounts page 
		And User enters "<description>" in the "description" field in accounts page 
		And User enters "<initialBalance>" in the "initialBalance" field in accounts page  
		And User enters "<accountNumber>" in the "accountNumber" field in accounts page 
		And User enters "<contactPerson>" in the "contactPerson" field in accounts page 
		And User clicks on "Save"
		Then User should be able to validate account created successfully
		
		Examples:
	|username						|password	|accountName	|description				|initialBalance	|accountNumber	|contactPerson	|
	|demo1@codefios.com	|abc123		|JP Test			|This is JP's Test	|880088					|810						|JEEP						|