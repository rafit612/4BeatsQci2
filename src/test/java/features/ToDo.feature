Feature: To-Do App Login
  As a user, I want to log into the Microsoft To-Do app so that I can manage my tasks.

  Scenario: Login with a valid email
    Given the user logs in with email "rafittodotest2025@outlook.com"
    Then the application should display the task list
