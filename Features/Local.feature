@tag
Feature: Local path 

  @tag1
  Scenario Outline: Local cab services
    Given User lands on homepage log in and click on Local path
    When select city <City> 
    And select pickup date <pickupdate> <monthyear>
    And select pickup time <time>
    And clicks on Select car button
    And first car select
    Then  validate car type in booking details


    Examples: 
      | City                    | pickupdate  |monthyear      | time      |
      | "Bangalore, Karnataka"  |  "22"       | "January2022" | "3:00 PM" |
