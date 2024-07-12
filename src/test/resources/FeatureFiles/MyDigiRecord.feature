Feature: Login Feature

  Scenario: Login with valid credentials
    Given I select a country
    And I click on India
    And I click continue
    When I enter username "your_username"
    And I enter password "your_password"
    And I click login
    Then I should be logged in successfully