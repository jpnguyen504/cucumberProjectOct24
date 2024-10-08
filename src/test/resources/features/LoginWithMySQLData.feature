@DatabaseLoginFeature @Regression
Feature: SecretSauce login page functionality validation	#feature is the test suite

@DbLoginScenario1
Scenario: User should be able to login with valid credentials	#scenario is the test case
Given User is on the techfios billing login page
When User enters "username" from mysql database
When User enters "password" from mysql database
When User clicks on sign in button
Then User should land on dashboard page