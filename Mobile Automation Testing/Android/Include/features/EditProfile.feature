@EditProfile
Feature: EditProfile

  @EditProfileNama
  Scenario: As a user, i want to change nama profile
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller1@gmail.com"
    And User input Password "123456"
    And User click icon eye to show Password
    And User click cta Login
    Then Redirect to profile page sign in success
    And User click icon edit Profile
    And User click icon edit name
    And User input blank name ""
    And User input name "Seller"
    And User click cta Simpan
    Then Users can edit profiles name

	@EditProfileNomorHP
  Scenario: As a user, i want to change nomor hp profile
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller1@gmail.com"
    And User input Password "123456"
    And User click icon eye to show Password
    And User click cta Login
    Then Redirect to profile page sign in success
    And User click icon edit Profile
    And User click icon edit phone number
    And User input blank phone number ""
    And User input phone number "081234567890"
    And User click cta Simpan
    Then Users can edit profiles phone number

	@EditProfileKota
  Scenario: As a user, i want to change kota profile
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller1@gmail.com"
    And User input Password "123456"
    And User click icon eye to show Password
    And User click cta Login
    Then Redirect to profile page sign in success
    And User click icon edit Profile
    And User click icon edit city
    And User input blank city ""
    And User input city "Bandung"
    And User click cta Simpan
    Then Users can edit profiles city

	@EditProfileAlamat
  Scenario: As a user, i want to change alamat profile
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller1@gmail.com"
    And User input Password "123456"
    And User click icon eye to show Password
    And User click cta Login
    Then Redirect to profile page sign in success
    And User click icon edit Profile
    And User click icon edit address
    And User input blank address ""
    And User input address "Jalan duren baru"
    And User click cta Simpan
    Then Users can edit profiles address

	@EditProfileEmail
  Scenario: As a user, i want to change Email profile
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller1@gmail.com"
    And User input Password "123456"
    And User click icon eye to show Password
    And User click cta Login
    Then Redirect to profile page sign in success
    And User click icon edit Profile
    And User click icon edit email
    And User input blank email ""
    And User input new Email "kel3seller1@gmail.com"
    And User click cta Simpan
    Then Users can edit profiles Email

	@EditProfilePassword
  Scenario: As a user, i want to change Password profile
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller1@gmail.com"
    And User input Password "123456"
    And User click icon eye to show Password
    And User click cta Login
    Then Redirect to profile page sign in success
    And User click icon edit Profile
    And User click icon edit password
    And User input Kata Sandi Lama "123456"
    And User click icon eye to show Kata Sandi Lama
    And User input Kata Sandi Baru "123456"
    And User click icon eye to show Kata Baru
    And User input Konfirmasi Kata Sandi "123456"
    And User click icon eye to show Konfirmasi Kata Sandi
    And User click cta Simpan Password
    Then Users can edit profiles Password
