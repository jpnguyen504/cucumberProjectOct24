Feature: SecretSauce login page functionality validation	#feature is the test suite

Background:
Given User is on the techfios billing login page

@PositiveScenarioCombined
Scenario Outline: User should be able to login with valid credentials	#scenario is the test case
When User enters username as "<username>"
When User enters password as "<password>"
When User clicks on sign in button
Then User should land on dashboard page
When User clicks on list accounts
#Then User should land on 
Examples: 
|username				|password			|
|demo1@codefios.com	|abc123	|
#|problem_user		|secret_sauce	|
#each step under the scenario is the test steps
#techfios billing wasnt working for cucumber so I used saucedemo. will not change given b/c I don't wanna change methodName

Scenario: User should not be able to login with invalid credentials	#scenario is the test case
When User enters username as "standard_user2"
When User enters password as "secret_sauce"
When User clicks on sign in button
Then User should land on dashboard page