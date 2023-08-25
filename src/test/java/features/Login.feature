Feature: Login #geakinLangauge

  Scenario: Login with correct creditional
    Given I enter the login url
    Given I enter the username and password
    Then I click on the login button
    Then I verify the homepage
