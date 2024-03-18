Feature: To Validate the FaceBook Application

@smoke
  Scenario:
    To Validate the Login Funtionality Using Valid email and Invalid Password
    
    Given User have to Launch the FaceBook Application through Chrome Browser 
    When User have to Enter the InValid Email and Invalid Password
    And User have to Click the Login button
    Then User have to reach Invalid Credential Page

 @sanity @Regression
  Scenario:
     To Validate the Login Funtionality Using Valid email and Invalid Password
    
    Given User have to Launch the FaceBook Application through Chrome Browser 
    When User have to Enter the InValid Email and Invalid Password
    And User have to Click the Login button
    Then User have to reach Invalid Credential Page