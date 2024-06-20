@Logout
Feature: Logout

  Scenario: As a user, i want to sign out from application
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller2@gmail.com"
    And User input Password "123456"
    And User click cta view password
    And User click cta Login
    Then Redirect to profile page sign in success
    And User click menu Keluar
    Then Redirect to homepage apps secondhand
