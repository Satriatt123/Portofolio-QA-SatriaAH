@Register
Feature: Register

  @RegisterPositive
  Scenario: As a user, i want to register as a new account
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User click cta Daftar
    And User input Nama lengkap "Natania Tani"
    And User input email "Natania010696@mail.co"
    And User input password "Tani1234"
    And User click icon view password
    And User input nomor hp "0898000111"
    And User input kota "Jakarta"
    And User input alamat "Jakarta Raya"
    And User click cta Register
    Then Redirect to profile page, registration new account success

  @RegisterNegative
  Scenario: As a user, i want to register but user not input Nama lengkap
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User click cta Daftar
    And User input email "Natania0106@mail.co"
    And User input password "Tani1234"
    And User click icon view password
    And User input nomor hp "0898000111"
    And User input kota "Jakarta"
    And User input alamat "Jakarta Raya"
    And User click cta Register
    Then Show an error message on coloumn nama 'Nama tidak boleh kosong'

  @RegisterNegative
  Scenario: As a user, i want to register but User not input email
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User click cta Daftar
    And User input Nama lengkap "Natania"
    And User input password "Tani1234"
    And User click icon view password
    And User input nomor hp "0898000111"
    And User input kota "Jakarta"
    And User input alamat "Jakarta Raya"
    And User click cta Register
    Then Show an error message on coloumn email 'Email tidak boleh kosong'

  @RegisterNegative
  Scenario: As a user, i want to register but User not input password
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User click cta Daftar
    And User input Nama lengkap "Natania"
    And User input email "Natania0106@mail.co"
    And User input nomor hp "0898000111"
    And User input kota "Jakarta"
    And User input alamat "Jakarta Raya"
    And User click cta Register
    Then Show an error message on coloumn password 'Password tidak boleh kosong'

  @RegisterNegative
  Scenario: As a user, i want to register but User not input phone number
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User click cta Daftar
    And User input Nama lengkap "Natania"
    And User input email "Natania0106@mail.co"
    And User input password "Tani1234"
    And User click icon view password
    And User input kota "Jakarta"
    And User input alamat "Jakarta Raya"
    And User click cta Register
    Then Show an error message on coloumn nomor hp 'Nomor telepon tidak boleh kosong'

  @RegisterNegative
  Scenario: As a user, i want to register but User not input kota
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User click cta Daftar
    And User input Nama lengkap "Natania"
    And User input email "Natania0106@mail.co"
    And User input password "Tani1234"
    And User click icon view password
    And User input nomor hp "0898000111"
    And User input alamat "Jakarta Raya"
    And User click cta Register
    Then Show an error message on coloumn kota 'Kota tidak boleh kosong'

  @RegisterNegative
  Scenario: As a user, i want to register but User not input alamat
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User click cta Daftar
    And User input Nama lengkap "Natania"
    And User input email "Natania0106@mail.co"
    And User input password "Tani1234"
    And User click icon view password
    And User input nomor hp "0898000111"
    And User input kota "Jakarta"
    And User click cta Register
    Then Show an error message on coloumn alamat 'Alamat tidak boleh kosong'

  @RegisterNegative
  Scenario: As a user, i want to register but input an invalid email
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User click cta Daftar
    And User input Nama lengkap "Natania"
    And User input email "Natania0106"
    And User input password "Tani1234"
    And User click icon view password
    And User input nomor hp "0898000111"
    And User input kota "Jakarta"
    And User input alamat "Jakarta Raya"
    And User click cta Register
    Then Show an error message on coloumn email 'Email tidak valid'

  @RegisterNegative
  Scenario: As a user, i want to register but input  password less than 6 karakter
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User click cta Daftar
    And User input Nama lengkap "Natania"
    And User input email "Natania0106@mail.co"
    And User input password "Tani"
    And User click icon view password
    And User input nomor hp "0898000111"
    And User input kota "Jakarta"
    And User input alamat "Jakarta Raya"
    And User click cta Register
    Then Show an error message on coloumn password 'Password harus lebih dari 6 karakter'

  @RegisterNegative
  Scenario: As a user, i want to cancel register a new account
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User click cta Register
    And User click icon back on header tab
    Then Show form sign in
