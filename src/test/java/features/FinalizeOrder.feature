Feature: Finilize Order

Background: 
    Given I enter the login url
    Given I enter the username and password
    Then I click on the login button
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
     When I click on the Basket Container
  Then I verify the basket page 
  Then I click on checkout 
  When I enter my first name
  When I enter my last name
  When I enter my postal code
  Then I click on continue  

  Scenario: finilize order
  When I click on finish 
  Then I verify finalpage
  Then I verify "Thank you for your order!" text
 