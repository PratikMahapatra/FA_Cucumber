@tag
Feature: Airport 

  @tag1
  Scenario Outline: Airport cab services
    Given User lands on homepage and logs with valid emailid and password
    And click on Airport
    Then User fills the form by entering Cityname <City> 
    Then User selects Trip from dropdown <Trip>
    Then User enters Drop address or pickup address <Address>
    Then User selects pickup date <pickupdate> <monthyear>
    Then User selects pickup time <time>
    Then user clicks on Select car button
    Then Select the first car 
    Then  validate car in car details


    Examples: 
      | City                           |  Trip                    | Address                  | pickupdate |monthyear     | time      |
      | "Bangalore Airport, Bangalore" |  "Cab from the Airport"  |   "Rajajinagar,Bangalore"| "22"       | "January2022"|"3:00 PM "  |
      | "Bangalore Airport, Bangalore" |  "Cab to the Airport"    |   "Rajajinagar,Bangalore"| "22"       | "January2022"|"3:00 PM "  |
