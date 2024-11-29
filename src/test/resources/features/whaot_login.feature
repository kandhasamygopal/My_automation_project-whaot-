@validuserlogin
Feature: This to test login whaot

  Scenario Outline: Verify the valid user scucessful login
    Given user is whaot home page
    And user click the signin button
    When enter the signin mobile number <phonenumber>
    And click the proceed to button
    When enter the signin OTP1 number <OTP1>
    When enter the signin OTP2 number <OTP2>
    When enter the signin OTP3 number <OTP3>
    When enter the signin OTP4 number <OTP4>
    When user click to contiune button
    Then user successfully login the to be show the homepage

    Examples: 
      | phonenumber | OTP1 | OTP2 | OTP3 | OTP4 |
      |  2056300259	 |    1 |    2 |    3 |    4 |
