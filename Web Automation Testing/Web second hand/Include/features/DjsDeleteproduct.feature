@Deleteproduct @Smoke
Feature: Daftar Jual Saya - Delete Product

  @Daftarjualsayadeleteproduct
  Scenario: [Seller] As a user, i want to delete product
    Given User open the secondhand website
    When user click cta Masuk on navbar
    And user input Email "kel3seller@gmail.com"
    And user input Password "123456"
    And user click cta Masuk
    Then user will redirect to website with login account, success to login website
    And user click the dotted line icon at the top right
    And user click card produk
    And user click cta Delete
    Then user will Redirect to Product Page
