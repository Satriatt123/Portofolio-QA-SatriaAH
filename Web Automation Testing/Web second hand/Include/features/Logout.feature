@Logout
Feature: Logout

  Scenario: As a User, i want to logout from secondhand website
    Given User launch the secondhand website
    When User click cta Masuk on navbar
    And User input Email "kel3seller@gmail.com"
    And User input Password "123456"
    And User click cta Masuk
    Then Redirect to website with login account, success to login website
    And User click icon people on navbar
    And User click cta Keluar
    Then Redirect to homepage, logout success
