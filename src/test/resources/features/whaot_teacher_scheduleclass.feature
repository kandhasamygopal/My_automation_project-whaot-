@Teacher_create_Scheduleclass
Feature: Teacher create the schedule class

  
  Scenario Outline: Teacher create the schedule class
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
    When My classes page class create view Teacher click the create a class button
    And  My classes page class create view Teacher select the class type Single or Group course
    When My classes page class create view Teacher select the class Subject <subjectname>
    When My classes page class create view Teacher select the Subject related teach Topics <Topics>
    When My classes page class create view Teacher select the teaching languages <Languages>
    When My classes page class create view Teacher select the class level <levels>
    And  My classes page class create view Teacher select the class duration <Duration>
    And  My classes page class create view Teacher Enter work Experience "1"
    And  My classes page class create view Teacher Enter Teach Experience "2"
    And  My classes page class create view Teacher upload the class intro video <Intro_video>
    And  My classes page class create view Teacher select the class cover image <Cover_Image>
    And  My classes page class create view Teacher Enter the fee amount "100"
    And  My classes page class create view Teacher Give the Discount "10"
    And  My classes page course class create choose on from date <From_Date>
    And  My classes page course class create choose on To date <To_Date>
    And  My classes page class create view Teacher choose the teacher availability business days
    And Teacher finally the inactive class button click the active the class
    Then Teacher finally class will be successfully
      
    Examples: 
      | phonenumber | OTP1 | OTP2 | OTP3 | OTP4 | subjectname   |Topics              |Languages| levels  |Duration | Intro_video                                                                 | Cover_Image                                                          | From_Date  | To_Date |
      | 4655498456  | 1    | 2    | 3    | 4    | IT & Software | Network & Security |Tamil    | Beginner |30 min   | "C:\\Users\\user\\Desktop\\Testing image & Videos\\Teacher_Intro_video.mp4" | "C:\\Users\\user\\Desktop\\Testing image & Videos\\Proffessor.jpg"   |"10-09-2023" | "30-09-2023" | 
