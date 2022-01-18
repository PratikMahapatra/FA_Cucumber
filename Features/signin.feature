#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login Validation

  @tag1
    Scenario Outline: Checking Login
    Given load the website and click signin
    Then User enters valid name <name>
    Then User enters valid phonenumber <phone>
    Then enter valid email-id <emailid>
    Then enter valid password <password>
    Then Reenter password <password>
    And user Click on login button

    Examples: 
      |name  |phone        | emailid         | password     |
      |"text1"| "1111111111"|"New@gmail.com"  | "Text111"   |


 

 
