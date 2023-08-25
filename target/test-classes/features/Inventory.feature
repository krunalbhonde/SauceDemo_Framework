Feature: Inventory #geakinLangauge

  Background: 
    Given I enter the login url
    Given I enter the username and password
    Then I click on the login button

  Scenario: Add to cart
    When I click on add to cartbutton for backpack
    When I click on add to cartbutton for bike light
    When I click on add to cartbutton for bolt t-shirt
    When I click on add to cartbutton for flees jacket
    When I click on add to cartbutton for onesie
    When I click on add to cartbutton for red t-shirt
    Then I verify button appears on backpack  with "Remove" tag
    Then I verify button appears on bike light  with "Remove" tag 
    Then I verify button appears on bolt t-shirt  with "Remove" tag
    Then I verify button appears on flees jacket  with "Remove" tag
    Then I verify button appears on onesie  with "Remove" tag
    Then I verify button appears on red t-shirt  with "Remove" tag
   
