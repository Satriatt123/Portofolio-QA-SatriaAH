@EditProfile
Feature: Edit Profile

  @EditFotoProfile @Positive
  Scenario: As a user, i want to edit foto profile
    Given User launch the secondhand website
    When User click cta Masuk on navbar
    And User input Email "kel3seller@gmail.com"
    And User input Password "123456"
    And User click cta Masuk
    Then Redirect to website with login account, success to login website
    And User click icon people on navbar
    And User click avatar profile
    And User upload foto profile1
    And User upload foto profile2
    And User click cta Simpan
    Then Users can edit profiles foto

  @EditNamaProfile @Positive
  Scenario: As a user, i want to edit nama profile
    Given User launch the secondhand website
    When User click cta Masuk on navbar
    And User input Email "kel3seller@gmail.com"
    And User input Password "123456"
    And User click cta Masuk
    Then Redirect to website with login account, success to login website
    And User click icon people on navbar
    And User click avatar profile
    And User input blank nama ""
    And User input nama "Seller"
    And User click cta Simpan
    Then Users can edit profiles nama

  @EditKotaProfile @Positive
  Scenario: As a user, i want to edit kota profile
    Given User launch the secondhand website
    When User click cta Masuk on navbar
    And User input Email "kel3seller@gmail.com"
    And User input Password "123456"
    And User click cta Masuk
    Then Redirect to website with login account, success to login website
    And User click icon people on navbar
    And User click avatar profile
    And User select kota pilih kota ""
    And User select kota "Bandung"
    And User click cta Simpan
    Then Users can edit profiles kota

  @EditAlamatProfile @Positive
  Scenario: As a user, i want to edit alamat profile
    Given User launch the secondhand website
    When User click cta Masuk on navbar
    And User input Email "kel3seller@gmail.com"
    And User input Password "123456"
    And User click cta Masuk
    Then Redirect to website with login account, success to login website
    And User click icon people on navbar
    And User click avatar profile
    And User input blank alamat ""
    And User input alamat "Jalan duren"
    And User click cta Simpan
    Then Users can edit profiles alamat

  @EditNoHandphoneProfile @Positive
  Scenario: As a user, i want to edit no handphone profile
    Given User launch the secondhand website
    When User click cta Masuk on navbar
    And User input Email "kel3seller@gmail.com"
    And User input Password "123456"
    And User click cta Masuk
    Then Redirect to website with login account, success to login website
    And User click icon people on navbar
    And User click avatar profile
    And User input blank no handphone ""
    And User input no handphone "081234567890"
    And User click cta Simpan
    Then Users can edit profiles no handphone

	@FotoProfile @Negative
  Scenario: As a user, i want to edit foto profile using size more than 1 mb
    Given User launch the secondhand website
    When User click cta Masuk on navbar
    And User input Email "kel3seller@gmail.com"
    And User input Password "123456"
    And User click cta Masuk
    Then Redirect to website with login account, success to login website
    And User click icon people on navbar
    And User click avatar profile
    And User upload foto profile3
    And User upload foto profile4
    And User click cta Simpan
    Then Users cannot edit foto profile

	@NamaProfile @Negative
  Scenario: As a user, i want to edit name profile using space only
    Given User launch the secondhand website
    When User click cta Masuk on navbar
    And User input Email "kel3seller@gmail.com"
    And User input Password "123456"
    And User click cta Masuk
    Then Redirect to website with login account, success to login website
    And User click icon people on navbar
    And User click avatar profile
    And User input nama space ""
    And User input nama space2 " "
    And User click cta Simpan
    Then Users cannot edit nama profile
	
	@KotaProfile @Negative
  Scenario: As a user, i want to edit kota profile to be Pilih Kota
    Given User launch the secondhand website
    When User click cta Masuk on navbar
    And User input Email "kel3seller@gmail.com"
    And User input Password "123456"
    And User click cta Masuk
    Then Redirect to website with login account, success to login website
    And User click icon people on navbar
    And User click avatar profile
    And User select kota pilih kota "Bandung"
    And User select kota pilih kota ""
    And User click cta Simpan
    Then Users cannot edit kota profile

	@AlamatProfile @Negative
  Scenario: As a user, i want to edit alamat profile using space only
    Given User launch the secondhand website
    When User click cta Masuk on navbar
    And User input Email "kel3seller@gmail.com"
    And User input Password "123456"
    And User click cta Masuk
    Then Redirect to website with login account, success to login website
    And User click icon people on navbar
    And User click avatar profile
    And User input alamat space ""
    And User input alamat space2 " "    
    And User click cta Simpan
    Then Users cannot edit alamat profile

	@NoHandphoneProfile @Negative
  Scenario: As a user, i want to edit no handphone profile using space only
    Given User launch the secondhand website
    When User click cta Masuk on navbar
    And User input Email "kel3seller@gmail.com"
    And User input Password "123456"
    And User click cta Masuk
    Then Redirect to website with login account, success to login website
    And User click icon people on navbar
    And User click avatar profile
    And User input no handphone space ""
    And User input no handphone space2 " "
    And User click cta Simpan
    Then Users cannot edit no handphone profile
    
   