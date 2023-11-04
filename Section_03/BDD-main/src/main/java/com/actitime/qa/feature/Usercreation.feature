Feature: As an admin I should be able to create a new user

  @TC_002
  Scenario Outline: Successfully create a new user
    Given User is logged in to Actitime as an admin user using username as "socialstat1104@gmail.com" and password as "jgAE65BB"
    When User clicks on Users and selects New User
    And User fills in the mandatory fields with FirstName as "<FirstName>" LastName as "<LastName>" Email as "<Email>"
    Then User clicks the Save & Send Invitation button
    Then User validates that the new user "<FirstName>" "<LastName>" is created successfully
    Examples:
      | FirstName | LastName | Email            |
      | Lionel    | Messi    | leomessi@psg.com |
      | Cristiano    | Ronaldo    | Cristiano@rm.com |