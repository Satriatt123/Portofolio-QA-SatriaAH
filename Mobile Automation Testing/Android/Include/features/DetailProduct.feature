@DetailProduct
Feature: Homepage-Detail Product

	Scenario: [Buyer] want to view detail product list
		Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3buyer1@gmail.com"
    And User input Password "123456"
    And User click cta view password
    And User click cta Login
    Then Redirect to profile page sign in success
    And User click cta Beranda
    And User click one product on product card
    Then Show product detail page
   