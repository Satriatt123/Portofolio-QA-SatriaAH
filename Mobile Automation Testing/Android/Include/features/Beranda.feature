@Beranda
Feature: Beranda
	
	@ctaBeranda
  Scenario: As a user, i want to click the home button
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller1@gmail.com"
    And User input Password "123456"
    And User click cta view password
    And User click icon eye to show Password
    And User click cta Login
    Then Redirect to profile page sign in success
    And User click cta Beranda
    Then User successfully enters the home page
