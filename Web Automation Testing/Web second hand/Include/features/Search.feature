@Search
Feature: Homepage - Search

	@SellerAccount
	Scenario: [Seller] Users want to be able search product
		Given User launch the secondhand website
		When User click cta Masuk on navbar
		And User input Email "kel3seller@gmail.com"
		And User input Password "123456"
		And User click cta Masuk
		Then Redirect to website with login account, success to login website
		And User click form input search
		And User input keyword "Gamis"
		And User click tombol Enter on keyboard
		Then Show result search keyword on product list
		
	@BuyerAccount
	Scenario: [Buyer] Users want to be able search product
		Given User launch the secondhand website
		When User click cta Masuk on navbar
		And User input Email "kel3buyer@gmail.com"
		And User input Password "123456"
		And User click cta Masuk
		Then Redirect to website with login account, success to login website
		And User click form input search
		And User input keyword "Gamis"
		And User click tombol Enter on keyboard
		Then Show result search keyword on product list
		