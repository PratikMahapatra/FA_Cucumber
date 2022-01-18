@tag
Feature: Corporate car Rental under services

@tag1
 Scenario Outline: Validating Text is displayed after filling the fields
 Given User logs in to homepage and clicks on corporate car rental in services
    Then User enters Name <Name>
    Then User enters Company <Company>
    Then User enters  EmailId <EmailId>
    Then User enters  Contact number <Contactnum>
    Then User selects Business volume <volume>
    Then user clicks on Submit button
    And Verify if the text is displayed <text>
   

    Examples: 
      | Name   | Company      | EmailId         | Contactnum   |volume                    |text                              |
      | "kir"  | "Mindtree"   | "xyz@gmail.com" | "1234567899" |"Greater than ₹ 500,000"  |"THANK YOU FOR ENQUIRING WITH US!"|