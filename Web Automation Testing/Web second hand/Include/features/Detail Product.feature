@DetailProduct
Feature: Homepage-Detail Product

	@SellerAccount
	Scenario: [Seller] Users want to be able check detail product on website
		Given User launch the secondhand website
		When User click cta Masuk on navbar
		And User input Email "kel3seller@gmail.com"
		And User input Password "123456"
		And User click cta Masuk
		Then Redirect to website with login account, success to login website
		And User click Icon detail product on navbar
		Then Redirect to product page
		And User click one product of list product daftar jual saya
		Then The system display product detail page

	@BuyerAccount
	Scenario: [Buyer] Users want to be able check detail product on website
		Given User launch the secondhand website
		When User click cta Masuk on navbar
		And User input Email "kel3buyer@gmail.com"
		And User input Password "123456"
		And User click cta Masuk
		Then Redirect to website with login account, success to login website
		And User click form input search
		And User input keyword "Bungaku"
		And User click tombol Enter on keyboard
		And User scroll down website until section product list
		And User click product
		Then The system display keyword product detail page