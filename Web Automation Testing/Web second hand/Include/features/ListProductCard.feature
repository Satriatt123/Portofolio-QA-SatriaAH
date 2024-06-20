@ListProductCard
Feature: List Product Card

	@ListProductCardSemua
  Scenario: Users can view product details in the category Semua
    Given User launch the secondhand website
    When User click cta Masuk on navbar
    And User input Email "kel3seller@gmail.com"
    And User input Password "123456"
    And User click cta Masuk
    Then Redirect to website with login account, success to login website
    And User scroll the website down to the cta Semua
    And User scroll to the category section
    And User click cta Semua
    And User scroll the website down to the product card
    And User clicks on the first product card in the category Semua
    Then Users can view product details in the category Semua
    
	@ListProductCardHobi
  Scenario: Users can view product details in the category Hobi
    Given User launch the secondhand website
    When User click cta Masuk on navbar
    And User input Email "kel3seller@gmail.com"
    And User input Password "123456"
    And User click cta Masuk
    Then Redirect to website with login account, success to login website
    And User scroll the website down to the cta Hobi
    And User scroll to the category section
    And User click cta Hobi
    And User scroll the website down to the product card
    And User clicks on the first product card in the category Hobi
    Then Users can view product details in the category Hobi
	
	@ListProductCardKendaraan
  Scenario: Users can view product details in the category Kendaraan
    Given User launch the secondhand website
    When User click cta Masuk on navbar
    And User input Email "kel3seller@gmail.com"
    And User input Password "123456"
    And User click cta Masuk
    Then Redirect to website with login account, success to login website
    And User scroll the website down to the cta Kendaraan
    And User scroll to the category section
    And User click cta Kendaraan
    And User scroll the website down to the product card
    And User clicks on the first product card in the category Kendaraan
    Then Users can view product details in category Kendaraan

	@ListProductCardBaju
  Scenario: Users can see product details in the category Baju
    Given User launch the secondhand website
    When User click cta Masuk on navbar
    And User input Email "kel3seller@gmail.com"
    And User input Password "123456"
    And User click cta Masuk
    Then Redirect to website with login account, success to login website
    And User scroll the website down to the cta Baju
    And User scroll to the category section
    And User click cta Baju
    And User scroll the website down to the product card
    And User clicks on the first product card in the category Baju
    Then Users can see product details in the category Baju

	@ListProductCardElektronik
  Scenario: Users can view product details in the category Elektronik
    Given User launch the secondhand website
    When User click cta Masuk on navbar
    And User input Email "kel3seller@gmail.com"
    And User input Password "123456"
    And User click cta Masuk
    Then Redirect to website with login account, success to login website
    And User scroll the website down to the cta Elektronik
    And User scroll to the category section
    And User click cta Elektronik
    And User scroll the website down to the product card
    And User clicks on the first product card in the category Elektronik
    Then Users can view product details in the category Elektronik

	@ListProductCardKesehatan
  Scenario: Users can view product details in the category Kesehatan
    Given User launch the secondhand website
    When User click cta Masuk on navbar
    And User input Email "kel3seller@gmail.com"
    And User input Password "123456"
    And User click cta Masuk
    Then Redirect to website with login account, success to login website
    And User scroll the website down to the cta Kesehatan
    And User scroll to the category section
    And User click cta Kesehatan
    And User scroll the website down to the product card
    And User clicks on the first product card in the category Kesehatan
    Then Users can view product details in the category Kesehatan
