$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/TechfiosHomework.feature");
formatter.feature({
  "name": "Codefios Other Add New Account validation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User should  be able to login with valid credentials and open a new account",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Homework1"
    }
  ]
});
formatter.step({
  "name": "User enters the \"\u003cusername\u003e\" in the \"username\" field",
  "keyword": "When "
});
formatter.step({
  "name": "User enters the \"\u003cpassword\u003e\" in the \"password\" field",
  "keyword": "When "
});
formatter.step({
  "name": "User clicks on \"login\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should land on Dashboard page",
  "keyword": "Then "
});
formatter.step({
  "name": "User clicks on \"listAccounts\"",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on \"addAccount\"",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003caccountName\u003e\" in the \"accountName\" field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003cdescription\u003e\" in the \"description\" field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003cinitialBalance\u003e\" in the \"initialBalance\" field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003caccountNumber\u003e\" in the \"accountNumber\" field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003ccontactPerson\u003e\" in the \"contactPerson\" field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on \"Save\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should be able to validate account created successfully",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "accountName",
        "description",
        "initialBalance",
        "accountNumber",
        "contactPerson"
      ]
    },
    {
      "cells": [
        "demo1@codefios.com",
        "abc123",
        "JP Test",
        "This is JP\u0027s Test",
        "880088",
        "810",
        "JEEP"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the codefios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.HomeworkStepDefinitions.user_is_on_the_codefios_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should  be able to login with valid credentials and open a new account",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Homework1"
    }
  ]
});
formatter.step({
  "name": "User enters the \"demo1@codefios.com\" in the \"username\" field",
  "keyword": "When "
});
formatter.match({
  "location": "steps.HomeworkStepDefinitions.user_enters_the_in_the_field(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the \"abc123\" in the \"password\" field",
  "keyword": "When "
});
formatter.match({
  "location": "steps.HomeworkStepDefinitions.user_enters_the_in_the_field(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on \"login\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.HomeworkStepDefinitions.user_clicks_on(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should land on Dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.HomeworkStepDefinitions.user_should_land_on_Dashboard_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on \"listAccounts\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.HomeworkStepDefinitions.user_clicks_on(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on \"addAccount\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.HomeworkStepDefinitions.user_clicks_on(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"JP Test\" in the \"accountName\" field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "steps.HomeworkStepDefinitions.user_enters_in_the_field_in_accounts_page(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"This is JP\u0027s Test\" in the \"description\" field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "steps.HomeworkStepDefinitions.user_enters_in_the_field_in_accounts_page(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"880088\" in the \"initialBalance\" field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "steps.HomeworkStepDefinitions.user_enters_in_the_field_in_accounts_page(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"810\" in the \"accountNumber\" field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "steps.HomeworkStepDefinitions.user_enters_in_the_field_in_accounts_page(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"JEEP\" in the \"contactPerson\" field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "steps.HomeworkStepDefinitions.user_enters_in_the_field_in_accounts_page(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on \"Save\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.HomeworkStepDefinitions.user_clicks_on(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to validate account created successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.HomeworkStepDefinitions.user_should_be_able_to_validate_account_created_successfully()"
});
formatter.result({
  "status": "passed"
});
});