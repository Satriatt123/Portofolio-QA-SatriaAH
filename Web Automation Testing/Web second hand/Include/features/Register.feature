@Register
Feature: Register

@LoginPositive
  Scenario: As a User, i want to register a new account
    Given User launch the secondhand website
    When User click cta Masuk on navbar
    And User click cta Daftar di sini
    And User input Nama Lengkap "Natania"
    And User input Email "natania@mail.co"
    And User input Password "Natan1234"
    And User click cta Daftar
    Then Redirect to Lengkapi Info Akun page

@LoginNegative
  Scenario: As a User, i want to register but not input Nama Lengkap
    Given User launch the secondhand website
    When User click cta Masuk on navbar
    And User click cta Daftar di sini
    And User input Email "natania@mail.co"
    And User input Password "Natan1234"
    And User click cta Daftar
    Then User not redirect to Lengkapi Info Akun Page

@LoginNegative
  Scenario: As a User, i want to register but not input email
    Given User launch the secondhand website
    When User click cta Masuk on navbar
    And User click cta Daftar di sini
    And User input Nama Lengkap "Natania"
    And User input Password "Natan1234"
    And User click cta Daftar
    Then User not redirect to Lengkapi Info Akun Page

@LoginNegative
  Scenario: As a User, i want to register but not input password
    Given User launch the secondhand website
    When User click cta Masuk on navbar
    And User click cta Daftar di sini
    And User input Nama Lengkap "Natania"
    And User input Email "natania@mail.co"
    And User click cta Daftar
    Then User not redirect to Lengkapi Info Akun Page

@LoginNegative
  Scenario: As a User, i want to register but input an invalid email
    Given User launch the secondhand website
    When User click cta Masuk on navbar
    And User click cta Daftar di sini
    And User input Nama Lengkap "Natan"
    And User input Email "natan"
    And User input Password "123456"
    And User click cta Daftar
    Then User not redirect to Lengkapi Info Akun Page

@LoginNegative
  Scenario: As a User, i want to register but input Nama Lengkap using space only
    Given User launch the secondhand website
    When User click cta Masuk on navbar
    And User click cta Daftar di sini
    And User input Nama Lengkap " "
    And User input Email "User@mail.co"
    And User input Password "123456"
    And User click cta Daftar
    Then User not redirect to Lengkapi Info Akun Page
