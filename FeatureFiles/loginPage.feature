Feature: User Login

  Scenario: Successful Login
    Given User is on the Login page
    When User enters the valid emailId and password (email:"jyothi@yopmail.com" and password:"Jyothi123")
    And click on Login button
    Then User must be redirected to My Account page
    And user should be able to view Welcome message
