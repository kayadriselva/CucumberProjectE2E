Feature: Login functionality
  As a user, want to login into Amazon successfully

  Scenario: To check the login screen
    Given user already in login screen
    When user navigates to signin dropdownfield
    Then signin button is displayed
    When user navigates to language dropdownfield
    Then default english language is selected

  Scenario: To check the login functionality
    Given user clicks on signin button
    When user enter email "kayadri_aselva@rediffmail.com"
    Then click on continue button

  Scenario Outline: To check the data
    Given user already in login screen
    When user fills the form from "<sheetname>" and "<testcasenumber>"
    Then print the value

    Examples: 
      | sheetname  | testcasenumber |
      | regression | TC01           |
      | regression | TC02           |
      | regression | TC03           |
