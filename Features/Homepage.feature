
@tag
Feature: Homepage

  @tag1
  Scenario Outline: Title of homepage validation
    Given load the website and get the title
    Then  validate title <title>
    
  Examples: 
  |title                                                                             |
  |"Book Outstation Cabs, Local & Airport Taxi Service - India's Leading Car Rentals"|
    
  @tag2
  Scenario Outline: CEO Validation
   Given load the website and click on about us
    Then  validate CEO <CEO>
   
   Examples: 
  |CEO              |
  |"Gaurav Aggarwal"|
  
  @tag3
  Scenario Outline: ContactUs
   Given load the website and click on Contact us
    Then  validate phonenumber <number>
   
   Examples: 
  |number              |
  |"9045450000"        |
    


