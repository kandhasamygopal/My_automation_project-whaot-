
@Teacher_Reschedule_Accept
Feature: teacher accept the student Reschedule request
    Scenario Outline: The teacher accept the student Reschedule request
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
    Given Teacher click the notications pell icon 
    When Teacher click the student reschedule request notification
    And Teacher accept the student reschedule class request
    Then finally the student reschedule class approved successfully and class time to be changed.

    Examples: 
      | phonenumber | OTP1 | OTP2 | OTP3 | OTP4 |
      |  6623662366	|    1 |    2 |    3 |    4|