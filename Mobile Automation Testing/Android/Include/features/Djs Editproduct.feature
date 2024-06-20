@Daftarjualsayaeditproduct @smoke
Feature: Daftar Jual Saya - Edit Product

  @Daftarjualsayaeditproduct @gantinama
  Scenario: [Seller] As a user, i want to change Nama produk
    Given user launched the second hand apps
    And user click menu Profile on tab
    When User click cta Masuk in profile page
    And User input the Email "kel3seller5@gmail.com"
    And User input the Password "123456"
    And User click eye icon to show Password
    And user click cta Masuk
    Then user will be Redirect to profile page, sign in success
    And User click menu Daftar Jual Saya
    When User click product card
    And User input new Nama produk
    And User click cta Perbarui Produk
    Then Show popup success message Produk berhasil diperbarui

  @Daftarjualsayaeditproduct @gantiharga
  Scenario: [Seller] As a user, i want to change harga produk
    Given user launched the second hand apps
    And user click menu Profile on tab
    When User click cta Masuk in profile page
    And User input the Email "kel3seller5@gmail.com"
    And User input the Password "123456"
    And User click eye icon to show Password
    And user click cta Masuk
    Then user will be Redirect to profile page, sign in success
    And User click menu Daftar Jual Saya
    When User click product card
    And User input new harga produk
    And User click cta Perbarui Produk
    Then Show popup success message Produk berhasil diperbarui

  @Daftarjualsayaeditproduct @gantilokasi
  Scenario: [Seller] As a user, i want to change lokasi produk
    Given user launched the second hand apps
    And user click menu Profile on tab
    When User click cta Masuk in profile page
    And User input the Email "kel3seller5@gmail.com"
    And User input the Password "123456"
    And User click eye icon to show Password
    And user click cta Masuk
    Then user will be Redirect to profile page, sign in success
    And User click menu Daftar Jual Saya
    When User click product card
    And User input new lokasi produk
    And User click cta Perbarui Produk
    Then Show popup success message Produk berhasil diperbarui

  @Daftarjualsayaeditproduct @gantideskripsi
  Scenario: [Seller] As a user, i want to change deksripsi produk
    Given user launched the second hand apps
    And user click menu Profile on tab
    When User click cta Masuk in profile page
    And User input the Email "kel3seller5@gmail.com"
    And User input the Password "123456"
    And User click eye icon to show Password
    And user click cta Masuk
    Then user will be Redirect to profile page, sign in success
    And User click menu Daftar Jual Saya
    When User click product card
    And User input new deksripsi produk
    And User click cta Perbarui Produk
    Then Show popup success message Produk berhasil diperbarui

  @Daftarjualsayaeditproduct @gantifoto
  Scenario: [Seller] As a user, i want to change foto produk
    Given user launched the second hand apps
    And user click menu Profile on tab
    When User click cta Masuk in profile page
    And User input the Email "kel3seller5@gmail.com"
    And User input the Password "123456"
    And User click eye icon to show Password
    And user click cta Masuk
    Then user will be Redirect to profile page, sign in success
    And User click menu Daftar Jual Saya
    When User click product card
    And User upload new foto produk
    And User click cta Perbarui Produk
    Then Show popup success message Produk berhasil diperbarui
