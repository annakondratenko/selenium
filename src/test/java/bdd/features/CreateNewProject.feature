Feature:
  As a entrepreneur
  I want to be able to register my new project
  So that i can see my project in projects catalogue

  Scenario: Register a new project as entrepreneur
    Given I am on new project registration page "https://dev.equerest.com/register#/entrepreneur"
    When I fill my First Name "Sergii" and Last Name "Oliinyk" into Full Name field
    And I fill my City "Kyiv" into City field
    And I fill my phone number "+380935401221" into Phone field
    And I fill my email address "my.email+1@address.com" into Email field
    And I fill my desired password "eQ8querest" into Password field
    And I set checkbox to show my password
    And I go next to second project registration page
    Then I should see form field with "Название проекта" title