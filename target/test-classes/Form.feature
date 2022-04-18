Feature: Form and User Registration

  @ValidCredentials
  Scenario: Check Form

    Given User is on Form page
    When User fill In The Field
    And User click switch
    And User select dropdown
    And User select value
    And User click active button
    Then User check error text "This button is"

  Scenario: User Registration test
    Given User is on Registration page
    When User click SignUp button
    And User Fill Input Email
    And User Fill Input Password
    And User Fill Input Repeat Password
    And User click SingUp Button
    Then User checkErrorText "Signed Up!"

