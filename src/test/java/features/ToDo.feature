Feature: To-Do App Login
  As a user, I want to log into the Microsoft To-Do app so that I can manage my tasks.

  Scenario: Login with a valid email
    Given the user logs in with email "rafittodotest20251@outlook.com"
    When the user clicks continue
    And the user enters password "!Iamgood612@"
    And the user clicks sign in
    And the user give permission for notification
    And user skip tutorial
    Then the displayed email should match in home page "rafittodotest20251@outlook.com"

  Scenario: Log out from the apps
    Given the user logs in with email "rafittodotest20251@outlook.com"
    When the user clicks continue
    And the user enters password "!Iamgood612@"
    And the user clicks sign in
    And the user give permission for notification
    And user skip tutorial
    And user click on navigation
    And user click on manage accounts
    And click on sign out
    And confirm sign out
    Then home page displayed

  Scenario: Create Account
    Given user click on microsoft account
    When the user logs in with email "rafittodotest2025@outlook.com"
    And the user clicks next
    And the user clicks sign in
    And the user give permission for notification
    And user skip tutorial
    And user click on navigation
    And user click on manage accounts
    And click on sign out
    And confirm sign out
    Then home page displayed