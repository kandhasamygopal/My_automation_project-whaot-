@teacheruserlogin
Feature: This to test login whaot

  Scenario Outline: Verify the teacher scucessful login
    Given teacher is whaot home page
    And  teacher click the signin button
    When teacher the signin mobile number <phonenumber>
    And  teacher the proceed to button
    When teacher enter the signin OTP1 number <OTP1>
    When teacher enter the signin OTP2 number <OTP2>
    When teacher enter the signin OTP3 number <OTP3>
    When teacher enter the signin OTP4 number <OTP4>
    When teacher user click to contiune button
    Then teacher successfully login the to be show the homepage

    Examples: 
      | phonenumber | OTP1 | OTP2 | OTP3 | OTP4 |
      |  1845416562 |    1 |    2 |    3 |    4 |