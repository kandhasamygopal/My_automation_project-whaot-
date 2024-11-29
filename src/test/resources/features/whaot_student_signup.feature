@Student_Signup
Feature: student register in new account whaot

  Scenario Outline: Student Register as new account in whaot
    Given Enter the whaot application URL
    And Click the Login signup button
    #And Choose the startlearning option
    When Enter the student phonenumber <phonenumber>
    When Enter the student Full name <username>
    When Enter the student email id <useremail>
    #When IF user have a coupon enter the coupon code<couponcode>
    #When Enter the student address area pincode <Pincode>
    When Enter student address details <Address>
    When enter the password <password>
    When enter the confirm password <Student_confirm_password>
    And click the Register button
    When enter the Student signin OTP1 number <OTP1>
    When enter the Student signin OTP2 number <OTP2>
    When enter the Student signin OTP3 number <OTP3>
    When enter the Student signin OTP4 number <OTP4>
    When student click to contiune button
    And student choose the interest one
    And student choose the interest two
    And student choose the interest three
    And student save the interest topics and proceed to home page
    Then student successfully login the to be show the homepage

    Examples: 
      | username | useremail          |      phonenumber | Address   |password |Student_confirm_password | OTP1 | OTP2 | OTP3 | OTP4 |
      | GokulAI1 | GokulAI1@tofeat.com |  1994119941     | "Chennai" |123456 | 123456                  |   1 |    2 |    3 |    4 |
