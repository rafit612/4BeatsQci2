Feature: To-Do App Login
  As a user, I want to log into the Microsoft To-Do app so that I can manage my tasks.

#  Scenario: Login with a valid email
#    Given the user logs in with email "rafittodotest20252@outlook.com"
#    When the user clicks continue
#    And the user enters password "!Iamgood612@"
#    And the user clicks sign in
#    And the user give permission for notification
#    And user skip tutorial
#    Then the displayed email should match in home page "rafittodotest20252@outlook.com"
#
#  Scenario: Log out from the apps
#    Given the user logs in with email "rafittodotest20252@outlook.com"
#    When the user clicks continue
#    And the user enters password "!Iamgood612@"
#    And the user clicks sign in
#    And the user give permission for notification
#    And user skip tutorial
#    And user click on navigation
#    And user click on manage accounts
#    And click on sign out
#    And confirm sign out
#    Then home page displayed

  Scenario: Create Account
    Given user click on microsoft account
    When the user click get new email
    And the user click on email domain option
    And the user select on email domain
    And the user create email
    And the user clicks next
    And the user create password
    And the user clicks next
    And the user enter random first name
    And the user enter random last name
    And the user click next after enter first and last name
    And the user select month
    And the user select date
    And the user enter year
    And the user click next after enter date month
    Then text displayed in robot "Help us beat the robots"