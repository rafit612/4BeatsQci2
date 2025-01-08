Feature: User Login


  Background:
    Given I navigate to the Home Page


  Scenario: User click on start your bussiness
    When I click on solutions
    And I click on start your bussiness
    Then I should see start your bussiness page

  Scenario: User click on sell your product
    When I click on solutions
    And I click on sell your product
    Then I should see sell your product page

  Scenario: User click on market your bussiness
    When I click on solutions
    And I click on Market Your Business
    Then I should see market your bussiness page

  Scenario: User click on manage your bussiness
    When I click on solutions
    And I click on sell manage your bussiness
    Then I should see manage your bussiness page

  Scenario: User click on pricing
    When I click on pricing
    Then I should see pricing page

  Scenario: User click on help and support
    When I click on resources
    And I click on start your help and support
    Then I should see help and support page

  Scenario: User click on what is Shopify
    When I click on resources
    And I click on start your what is Shopify
    Then I should see what is Shopify page

  Scenario: User click on marketing
    When I click on resources
    And I click on marketing
    Then I should see marketing page

  Scenario: User click on enterprise
    When I click on enterprise
    Then I should see enterprise page
#
  Scenario: User click on free trials
    When I click on free trials
    Then I should see free trials page

  Scenario: Scroll Down and Click about
    When Scroll down to about
    Then I should see about page


  Scenario: Scroll Down and Click trials
    When Scroll down to merchant support
    Then I should see merchant support page


  Scenario: Scroll Down and Click trials
    When Scroll down to shopify dev
    Then I should see shopify dev page


  Scenario: Scroll Down and Click trials
    When Scroll down to sustainability
    Then I should see sustainability page


  Scenario: Scroll Down and Click trials
    When Scroll down to online store builder
    Then I should see online store builder page
