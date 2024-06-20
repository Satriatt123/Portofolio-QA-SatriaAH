@Login @Smoke
Feature: Login

  @LoginWithRegisteredAccount @LoginPositive
  Scenario: As a User, i want to login on website
    Given User launch the secondhand website
    When User click cta Masuk on navbar
    And User input Email "kel3seller@gmail.com"
    And User input Password "123456"
    And User click cta Masuk
    Then Redirect to website with login account, success to login website

  @LoginWithUnRegisteredAccount @LoginPositive
  Scenario: As a User, i want to login on website
    Given User launch the secondhand website
    When User click cta Masuk on navbar
    And User input Email "kelompok3seller@gmail.com"
    And User input Password "123456"
    And User click cta Masuk
    Then User not redirect to homepage

  @LoginNegative
  Scenario: As a User, i want to login but not input email
    Given User launch the secondhand website
    When User click cta Masuk on navbar
    And User input Password "123456"
    And User click cta Masuk
    Then User not redirect to homepage

  @LoginNegative
  Scenario: As a User, i want to login but not input password
    Given User launch the secondhand website
    When User click cta Masuk on navbar
    And User input Email "kel3seller@gmail.com"
    And User click cta Masuk
    Then User not redirect to homepage

  @LoginNegative
  Scenario: As a User, i want to login using invalid email
    Given User launch the secondhand website
    When User click cta Masuk on navbar
    And User input Email "nanana"
    And User input Password "123456"
    And User click cta Masuk
    Then User not redirect to homepage

  @LoginNegative
  Scenario: As a User, i want to login using invalid password
    Given User launch the secondhand website
    When User click cta Masuk on navbar
    And User input Email "kel3seller@gmail.com"
    And User input Password "1234"
    And User click cta Masuk
    Then User not redirect to homepage

   @LoginWithRegisteredAccount @LoginPositive
  Scenario: As a User, i want to login on website
    Given User launch the secondhand website
    When User click cta Masuk on navbar
    And User input Email "kel3buyer@gmail.com"
    And User input Password "123456"
    And User click cta Masuk
    Then Redirect to website with login account, success to login website
    