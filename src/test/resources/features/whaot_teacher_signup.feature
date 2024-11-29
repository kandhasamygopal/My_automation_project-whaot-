@teachersignup
Feature: Teacher register in new account whaot
  Scenario Outline: Teacher Register as new account in whaot
    Given Enter the whaot application teacher URL
    And Choose the Become a guru option
    When Enter the Teacher Full name <teachername>
    When Enter the Teacher email id <teacheremail>
    When Enter the teacher phonenumber <phonenumber>
    When enter the teacher password <teacherpassword>
    When enter the teacher confirm password <confirm_Password>
    And click the teacher Register button
    When enter the signin OTP1 number <OTP1>
    When enter the signin OTP2 number <OTP2>
    When enter the signin OTP3 number <OTP3>
    When enter the signin OTP4 number <OTP4>
    Then user successfully login the to be show the profile verification page

    Examples: 
      | phonenumber | teachername    | teacheremail | teacherpassword | confirm_Password | OTP1 | OTP2 | OTP3 | OTP4 |
      |  2650126471 | Gokulteacher07 | Gokulteacher781@fexbox.org.com |123456 | 123456 |    1 |    2 |    3 |    4 |
