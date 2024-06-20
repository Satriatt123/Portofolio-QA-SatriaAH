@Login
Feature: Login

  @LoginPositive
  Scenario: As a user, i want to sign in to application with my registered account
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller2@gmail.com"
    And User input Password "123456"
    And User click cta view password
    And User click cta Login
    Then Redirect to profile page sign in success

  @LoginNegative
  Scenario: As a user, i want to sign in to application with my unregistered account
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "Nana1234@mail.com"
    And User input Password "123456"
    And User click cta view password
    And User click cta Login
    Then Show an error message, sign in failed

  @LoginNegative
  Scenario: As a user, i want to sign in to application but User not input Email
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Password "123456"
    And User click cta view password
    And User click cta Login
    Then Show an error message on coloumn Email 'Email tidak boleh kosong' 

  @LoginNegative
  Scenario: As a user, i want to sign in to application but User not input Password
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller@gmail.com"
    And User click cta view password
    And User click cta Login
    Then Show an error message on coloumn Password 'Password tidak boleh kosong' 

  @LoginNegative
  Scenario: As a user, i want to sign in to application but input invalid Email
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller"
    And User input Password "123456"
    And User click cta view password
    And User click cta Login
    Then Show an error message on coloumn Email 'Email tidak valid' 

  @LoginNegative
  Scenario: As a user, i want to sign in to application but input Password less than 6 character
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller@gmail.com"
    And User input Password "1234"
    And User click cta view password
    And User click cta Login
    Then Show an error message on coloumn Password 'Password harus lebih dari 6 karakter' 
