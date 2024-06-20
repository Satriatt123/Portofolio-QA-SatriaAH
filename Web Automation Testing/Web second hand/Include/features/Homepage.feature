@Homepage
Feature: Homepage

  @ctaHomepage
  Scenario: As a user, I want to click the home button
    Given User launch the secondhand website
    When User click cta Masuk on navbar
    And User input Email "kel3seller@gmail.com"
    And User input Password "123456"
    And User click cta Masuk
    Then Redirect to website with login account, success to login website
    And User click cta Homepage
    Then User successfully redirected to the homepage
