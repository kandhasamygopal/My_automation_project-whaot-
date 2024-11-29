@Student_Accept_The_Reschedule_Request
Feature: The Student accept the teacher Reschedule request 

 Scenario Outline: The Student accept the teacher Reschedule request to proceed
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
    Given Student click the notications pell icon 
    When Student click the teacher reschedule request notification
    And Student accept the teacher reschedule class request
    Then finally the teacher reschedule class approved successfully and class time to be changed.

    Examples: 
      | phonenumber | OTP1 | OTP2 | OTP3 | OTP4 |
      |  	9485958721	 |    1 |    2 |    3 |    4|
     
     
    
     
     
     
