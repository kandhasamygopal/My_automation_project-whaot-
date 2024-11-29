@StudentClasscancel
Feature: The student cancel the schedule class


  Scenario Outline: The student book and cancel the schedule class
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
    Given student choose the one schedule class
    And click the schedule class link its redirect to booking class page
    And Student scroll down the page and click the booking class button
    And The schedule class page student student click the add new class slots link
    And click the pick slot button
    Given student choose the dates <date> & time  the class slots
    And Finally click the save the date & time
    Then page navigate to Review your booking page
    And Click the procedd to pay 
    Then payment should be naviagated
    When choose the card payment and enter the "4111 1111 1111 1111" and Expiry "0225" and CVV "123"
    Then page naviagate payment page success or failure page
    And Click the success button & finally class will be booked message show
    And click the booking class success message OkayButton
    Then Finally user will be see the booking class details
    Given student click the my bookings page
    And click the class to view the class details
    And click the reschedule/cancellation button to view
    When check the class is cancalltion button disabled before calss started time reached
    And Finally the class cancel by the student and got refund the class paid amount

    Examples: 
     | phonenumber | OTP1 | OTP2 | OTP3 | OTP4 | date |
     |  6500065008 |    1 |    2 |    3 |    4 |  "7" |
     
     

    

