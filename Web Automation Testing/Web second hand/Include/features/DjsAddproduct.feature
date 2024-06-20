@Djsaddproduct @smoke
Feature: Daftar Jual Saya - Add Product

  @Daftarjualsayaaddproduct @Addproduct
  Scenario: [Seller] As a user, i want to add new product
    Given User go to the secondhand website
    When user click cta Masuk on navbar
    And user input Email "kel3seller@gmail.com"
    And user input Password "123456"
    And user click cta Masuk
    Then user will redirect to website with login account, success to login website
    And user clicks the dotted line icon at the top right
    When user click cta Tambah Produk
    And user input Nama produk
    And user input harga produk
    And user choose kategori produk
    And user input deskripsi produk
    And user upload image product
    And User click cta Terbitkan
    Then user will Redirect to product detail page, seller will get notification after published new product

  @Daftarjualsayaaddproduct @Previewproduct
  Scenario: [Seller] As a user, i want to view product when add new product
    Given User go to the secondhand website
    When user click cta Masuk on navbar
    And user input Email "kel3seller@gmail.com"
    And user input Password "123456"
    And user click cta Masuk
    Then user will redirect to website with login account, success to login website
    And user clicks the dotted line icon at the top right
    When user click cta Tambah Produk
    And user input Nama produk
    And user input harga produk
    And user choose kategori produk
    And user input deskripsi produk
    And user upload image product
    And User click cta Preview
    Then user will Redirect to product detail page and cta Terbitkan will show

  @Daftarjualsayaaddproduct @Negativecase
  Scenario: [Seller] As a user, i want to add new product but not input Nama produk
    Given User go to the secondhand website
    When user click cta Masuk on navbar
    And user input Email "kel3seller@gmail.com"
    And user input Password "123456"
    And user click cta Masuk
    Then user will redirect to website with login account, success to login website
    And user clicks the dotted line icon at the top right
    When user click cta Tambah Produk
    And user not input Nama produk
    And user input harga produk
    And user choose kategori produk
    And user input deskripsi produk
    And user upload image product
    And User click cta Terbitkan
    Then Show an error message on column Nama produk, "Name can't be blank"

  @Daftarjualsayaaddproduct @Negativecase
  Scenario: [Seller] As a user, i want to add new product but not input harga produk
    Given User go to the secondhand website
    When user click cta Masuk on navbar
    And user input Email "kel3seller@gmail.com"
    And user input Password "123456"
    And user click cta Masuk
    Then user will redirect to website with login account, success to login website
    And user clicks the dotted line icon at the top right
    When user click cta Tambah Produk
    And user input Nama produk
    And user not input harga produk
    And user choose kategori produk
    And user input deskripsi produk
    And user upload image product
    And User click cta Terbitkan
    Then Show an error message on column harga produk, "Price can't be blank"

  @Daftarjualsayaaddproduct @Negativecase
  Scenario: [Seller] As a user, i want to add new product but not pilih kategori produk
    Given User go to the secondhand website
    When user click cta Masuk on navbar
    And user input Email "kel3seller@gmail.com"
    And user input Password "123456"
    And user click cta Masuk
    Then user will redirect to website with login account, success to login website
    And user clicks the dotted line icon at the top right
    When user click cta Tambah Produk
    And user input Nama produk
    And user input harga produk
    And user not choose kategori produk
    And user input deskripsi produk
    And user upload image product
    And User click cta Terbitkan
    Then Show an error message on column kategori produk, "Category must exist"

  @Daftarjualsayaaddproduct @Negativecase
  Scenario: [Seller] As a user, i want to add new product but not input deskripsi produk
    Given User go to the secondhand website
    When user click cta Masuk on navbar
    And user input Email "kel3seller@gmail.com"
    And user input Password "123456"
    And user click cta Masuk
    Then user will redirect to website with login account, success to login website
    And user clicks the dotted line icon at the top right
    When user click cta Tambah Produk
    And user input Nama produk
    And user input harga produk
    And user choose kategori produk
    And user not input deskripsi produk
    And user upload image product
    And User click cta Terbitkan
    Then Show an error message on column deskripsi produk, "Description can't be blank"

  @Daftarjualsayaaddproduct @Negativecase
  Scenario: [Seller] As a user, i want to add new product but not upload image produk
    Given User go to the secondhand website
    When user click cta Masuk on navbar
    And user input Email "kel3seller@gmail.com"
    And user input Password "123456"
    And user click cta Masuk
    Then user will redirect to website with login account, success to login website
    And user clicks the dotted line icon at the top right
    When user click cta Tambah Produk
    And user input Nama produk
    And user input harga produk
    And user choose kategori produk
    And user input deskripsi produk
    And user not upload image produk
    And User click cta Terbitkan
    Then user will Redirect to product detail page