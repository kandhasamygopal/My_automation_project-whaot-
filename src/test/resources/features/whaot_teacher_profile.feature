@Teacher_Profile
Feature: Teacher create the profile

  Scenario Outline: Teacher create the profile
    Given Enter the whaot application teacher URL
    And Choose the Become a guru option
    When Enter the Teacher Full name <teachername>
    When Enter the Teacher email id <teacheremail>
    When Enter the teacher phonenumber <phonenumber>
    When enter the teacher password <teacherpassword>
    And click the teacher Register button
    When enter the signin OTP1 number <OTP1>
    When enter the signin OTP2 number <OTP2>
    When enter the signin OTP3 number <OTP3>
    When enter the signin OTP4 number <OTP4>
    Then user successfully login the to be show the profile verification page
    #Given teacher is whaot home page
    #And  teacher click the signin button
    #When teacher the signin mobile number <phonenumber>
    #And  teacher the proceed to button
    #When teacher enter the signin OTP1 number <OTP1>
    #When teacher enter the signin OTP2 number <OTP2>
    #When teacher enter the signin OTP3 number <OTP3>
    #When teacher enter the signin OTP4 number <OTP4>
    #When teacher user click to contiune button
    #Then teacher successfully login the to be show the homepage
    And Teacher select the one to one class toggle button
    And Teacher select the class type Single or Group <Class_Type>
    When Teacher select the class Subject <subjectname>
    When Teacher select the Subject related teach Topics <Topics>
    When Teacher select the teaching languages <Languages>
    When Teacher select the class level <levels>
    And Teacher select the class duration <Duration>
    And Teacher Enter work Experience "1"
    And Teacher Enter Teach Experience "2"
    And Teacher upload the class intro video <Intro_video>
    And Teacher select the class cover image <Cover_Image>
    And Teacher Enter the fee amount "100"
    And Teacher Give the Discount "10"
    And Teacher click the pan submit button
    And Teacher upload the pan image front photo <pan_picture>
    And Teacher enter the pan number <pan_number>
    And Teacher publish the pan card information
    When Teacher select the submit relevant proof dropdown
    And Teacher select the others selection <Others_Proof>
    And Teacher add the profile url <URL>
    And Teacher upload the Others document <Other_Document>
    And Finally fill add the proof of documents
    And Finally click the Next button
    And choose the teacher availability business days
    When Teacher Select the timings time slots <Time_slot1> and <Time_slot2> and <Time_am> and <Time_slot3> and <Time_slot4> and <Time_pm>
    And Teacher select the Holiday cleandar <year>
    And Teacher upload the profile picture <Profile_Picture>
    And Teacher verify the video verification
    And Teacher enter the address line <Address>
    #And Teacher enter the pincode <Pincode>
    And Teacher click the Preview button
    Then Teacher click the final submit button and class should be for admin verification.
    
    Examples: 
      | phonenumber | teachername | teacheremail          | teacherpassword | OTP1 | OTP2 | OTP3 | OTP4 |Class_Type| subjectname | Topics | Languages | levels | Duration |  Intro_video                                                   | Cover_Image                                                                |pan_picture| pan_number |Others_Proof |URL |Other_Document|Time_slot1|Time_slot2|Time_am|Time_slot3|Time_slot4|Time_pm|year|Profile_Picture|   Address|Pincode|                           
      |  1895745042	| ASGgokul2030    | ASGokul2032@tofeat.com |          123456 |    1 |    2 |    3 |    4 |Single| Music  | Singing|  Tamil | Beginner | 30 Mins | "C:\\Users\\user\\Desktop\\Testing image & Videos\\Teacher_Intro_video.mp4" | "C:\\Users\\user\\Desktop\\Testing image & Videos\\Proffessor.jpg" | "C:\\Users\\user\\Desktop\\Testing image & Videos\\images.jpg"|"CLKMGN"|"Others"|"www.google.com"|"C:\\Users\\user\\Desktop\\Testing image & Videos\\certificate sample.jpg" |"10"|"45"|"am"|"10"|"45"|"pm"|"2024"|"C:\\Users\\user\\Desktop\\Testing image & Videos\\Proffessor.jpg" |"Gigipo Esprit private limited virukambakkam"|"600092"|                        