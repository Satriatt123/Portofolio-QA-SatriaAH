@Pagination
Feature: List Product Card

  @PaginationSemua
  Scenario: Users can go to the next page and previous page in the category Semua
    Given User launch the secondhand website
    When User click cta Masuk on navbar
    And User input Email "kel3seller@gmail.com"
    And User input Password "123456"
    And User click cta Masuk
    Then Redirect to website with login account, success to login website
    And User scroll the website down to the cta Semua
    And User scroll to the category section
    And User click cta Semua
    And User scroll the website down to the Pagination
    And User click cta Next Semua
    And User scroll the website down to the Pagination
    And User click cta Previous Semua
    Then Users can go to the next page and previous page in the category Semua
	
	@PaginationHobi
  Scenario: Users can go to the next page and previous page in the category Hobi
    Given User launch the secondhand website
    When User click cta Masuk on navbar
    And User input Email "kel3seller@gmail.com"
    And User input Password "123456"
    And User click cta Masuk
    Then Redirect to website with login account, success to login website
    And User scroll the website down to the cta Hobi
    And User scroll to the category section
    And User click cta Hobi
    And User scroll the website down to the Pagination
    And User click cta Next Hobi
    And User scroll the website down to the Pagination
    And User click cta Previous Hobi
    Then Users can go to the next page and previous page in the category Hobi

	@PaginationKendaraan
  Scenario: Users can go to the next page and previous page in the category Kendaraan
    Given User launch the secondhand website
    When User click cta Masuk on navbar
    And User input Email "kel3seller@gmail.com"
    And User input Password "123456"
    And User click cta Masuk
    Then Redirect to website with login account, success to login website
    And User scroll the website down to the cta Kendaraan
    And User scroll to the category section
    And User click cta Kendaraan
    And User scroll the website down to the Pagination
    And User click cta Next Kendaraan
    And User scroll the website down to the Pagination
    And User click cta Previous Kendaraan
    Then Users can go to the next page and previous page in the category Kendaraan

	@PaginationBaju
  Scenario: Users can go to the next page and previous page in the category Baju
    Given User launch the secondhand website
    When User click cta Masuk on navbar
    And User input Email "kel3seller@gmail.com"
    And User input Password "123456"
    And User click cta Masuk
    Then Redirect to website with login account, success to login website
    And User scroll the website down to the cta Baju
    And User scroll to the category section
    And User click cta Baju
    And User scroll the website down to the Pagination
    And User click cta Next Baju
    And User scroll the website down to the Pagination
    And User click cta Previous Baju
    Then Users can go to the next page and previous page in the category Baju

	@PaginationElektronik
  Scenario: Users can go to the next page and previous page in the category Elektronik
    Given User launch the secondhand website
    When User click cta Masuk on navbar
    And User input Email "kel3seller@gmail.com"
    And User input Password "123456"
    And User click cta Masuk
    Then Redirect to website with login account, success to login website
    And User scroll the website down to the cta Elektronik
    And User scroll to the category section
    And User click cta Elektronik
    And User scroll the website down to the Pagination
    And User click cta Next Elektronik
    And User scroll the website down to the Pagination
    And User click cta Previous Elektronik
    Then Users can go to the next page and previous page in the category Elektronik
	
	@PaginationKesehatan
  Scenario: Users can go to the next page and previous page in the category Kesehatan
    Given User launch the secondhand website
    When User click cta Masuk on navbar
    And User input Email "kel3seller@gmail.com"
    And User input Password "123456"
    And User click cta Masuk
    Then Redirect to website with login account, success to login website
    And User scroll the website down to the cta Kesehatan
    And User scroll to the category section
    And User click cta Kesehatan
    And User scroll the website down to the Pagination
    And User click cta Next Kesehatan
    And User scroll the website down to the Pagination
    And User click cta Previous Kesehatan
    Then Users can go to the next page and previous page in the category Kesehatan
