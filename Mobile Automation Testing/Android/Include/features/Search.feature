@Search
Feature: Homepage-Search

  Scenario: Users want to be able search product
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller1@gmail.com"
    And User input Password "123456"
    And User click cta view password
    And User click cta Login
    Then Redirect to profile page sign in success
    And User click cta Beranda
    And User click column input search
    And User input keyword "sepatu"
    Then Show result list product with keyword sepatu
