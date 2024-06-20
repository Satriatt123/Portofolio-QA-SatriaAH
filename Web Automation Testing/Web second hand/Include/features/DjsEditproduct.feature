@Editproduct  @Smoke
Feature: Daftar Jual Saya - Edit Product

  @Daftarjualsayaeditproduct @Editnama
  Scenario: [Seller] As a user, i want to edit my product name
    Given User launch the secondhand website
    When user click cta Masuk on navbar
    And user input Email "kel3seller@gmail.com"
    And user input Password "123456"
    And user click cta Masuk
    Then user will redirect to website with login account, success to login website
    And user click the dotted line icon at the top right
    And user click card produk
    When user click Edit
    And user change Nama produk
    And user click Terbitkan
    Then user will Redirect to product detail page with new Nama produk, edit product success

  @Daftarjualsayaeditproduct @Editharga
  Scenario: [Seller] As a user, i want to edit my product price
    Given User launch the secondhand website
    When user click cta Masuk on navbar
    And user input Email "kel3seller@gmail.com"
    And user input Password "123456"
    And user click cta Masuk
    Then user will redirect to website with login account, success to login website
    And user click the dotted line icon at the top right
    And user click card produk
    When user click Edit
    And user change harga produk
    And user click Terbitkan
    Then user will Redirect to product detail page with new harga produk, edit product success

  @Daftarjualsayaeditproduct @Editkategori
  Scenario: [Seller] As a user, i want to edit my product category
    Given User launch the secondhand website
    When user click cta Masuk on navbar
    And user input Email "kel3seller@gmail.com"
    And user input Password "123456"
    And user click cta Masuk
    Then user will redirect to website with login account, success to login website
    And user click the dotted line icon at the top right
    And user click card produk
    When user click Edit
    And user change kategori produk
    And user click Terbitkan
    Then user will Redirect to product detail page with new kategori produk, edit product success

  @Daftarjualsayaeditproduct @Editdeskripsi
  Scenario: [Seller] As a user, i want to edit my product description
    Given User launch the secondhand website
    When user click cta Masuk on navbar
    And user input Email "kel3seller@gmail.com"
    And user input Password "123456"
    And user click cta Masuk
    Then user will redirect to website with login account, success to login website
    And user click the dotted line icon at the top right
    And user click card produk
    When user click Edit
    And user change deskripsi produk
    And user click Terbitkan
    Then user will Redirect to product detail page with new deskripsi produk, edit product success

  @Daftarjualsayaeditproduct @Editimage
  Scenario: [Seller] As a user, i want to edit my product image
    Given User launch the secondhand website
    When user click cta Masuk on navbar
    And user input Email "kel3seller@gmail.com"
    And user input Password "123456"
    And user click cta Masuk
    Then user will redirect to website with login account, success to login website
    And user click the dotted line icon at the top right
    And user click card produk
    When user click Edit
    And user change produk image
    And user click Terbitkan
    Then user will Redirect to product detail page with new image product, edit product success

  @Daftarjualsayaeditproduct @Addimage
  Scenario: [Seller] As a user, i want to add my product image more than one
    Given User launch the secondhand website
    When user click cta Masuk on navbar
    And user input Email "kel3seller@gmail.com"
    And user input Password "123456"
    And user click cta Masuk
    Then user will redirect to website with login account, success to login website
    And user click the dotted line icon at the top right
    And user click card produk
    When user click Edit
    And user add image produk more than one
    And user click Terbitkan
    Then user will Redirect to product detail page with new image product, edit product success

  @Daftarjualsayaeditproduct @Canceleditproduct
  Scenario: [Seller] As a user, i want to cancel when edit product
    Given User launch the secondhand website
    When user click cta Masuk on navbar
    And user input Email "kel3seller@gmail.com"
    And user input Password "123456"
    And user click cta Masuk
    Then user will redirect to website with login account, success to login website
    And user click the dotted line icon at the top right
    And user click card produk
    When user click Edit
    And user edit any data at edit produk
    And user click icon back
    Then user will Redirect to Product Page
