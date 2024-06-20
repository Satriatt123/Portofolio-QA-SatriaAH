@Category
Feature: Homepage-Filter by Category

	@FilterByCategorySemua @SellerAccount
	Scenario: Users want to be able filter product by category semua
		Given User launch the secondhand website
		When User click cta Masuk on navbar
		And User input Email "kel3seller@gmail.com"
		And User input Password "123456"
		And User click cta Masuk
		Then Redirect to website with login account, success to login website
		And User scroll down website until section Telusuri Kategori
		And User click cta Semua
		Then Show list product by category product Semua
		
		@BuyerAccount
		Scenario: Users want to be able filter product by category semua
		Given User launch the secondhand website
		When User click cta Masuk on navbar
		And User input Email "kel3buyer@gmail.com"
		And User input Password "123456"
		And User click cta Masuk
		Then Redirect to website with login account, success to login website
		And User scroll down website until section Telusuri Kategori
		And User click cta Semua
		Then Show list product by category product Semua
		
	@FilterByCategoryHobi @SellerAccount
	Scenario: Users want to be able filter product by category hobi
		Given User launch the secondhand website
		When User click cta Masuk on navbar
		And User input Email "kel3seller@gmail.com"
		And User input Password "123456"
		And User click cta Masuk
		Then Redirect to website with login account, success to login website
		And User scroll down website until section Telusuri Kategori
		And User click cta Hobi
		Then Show list product by category product Hobi
		
		@BuyerAccount
		Scenario: Users want to be able filter product by category hobi
		Given User launch the secondhand website
		When User click cta Masuk on navbar
		And User input Email "kel3buyer@gmail.com"
		And User input Password "123456"
		And User click cta Masuk
		Then Redirect to website with login account, success to login website
		And User scroll down website until section Telusuri Kategori
		And User click cta Hobi
		Then Show list product by category product Hobi
		
	@FilterByCategoryKendaraan @SellerAccount
	Scenario: Users want to be able filter product by category kendaraan
		Given User launch the secondhand website
		When User click cta Masuk on navbar
		And User input Email "kel3seller@gmail.com"
		And User input Password "123456"
		And User click cta Masuk
		Then Redirect to website with login account, success to login website
		And User scroll down website until section Telusuri Kategori
		And User click cta Kendaraan
		Then Show list product by category product Kendaraan
		
		@BuyerAccount
		Scenario: Users want to be able filter product by category kendaraan
		Given User launch the secondhand website
		When User click cta Masuk on navbar
		And User input Email "kel3buyer@gmail.com"
		And User input Password "123456"
		And User click cta Masuk
		Then Redirect to website with login account, success to login website
		And User scroll down website until section Telusuri Kategori
		And User click cta Kendaraan
		Then Show list product by category product Kendaraan
		
	@FilterByCategoryBaju @SellerAccount
	Scenario: Users want to be able filter product by category baju
		Given User launch the secondhand website
		When User click cta Masuk on navbar
		And User input Email "kel3seller@gmail.com"
		And User input Password "123456"
		And User click cta Masuk
		Then Redirect to website with login account, success to login website
		And User scroll down website until section Telusuri Kategori
		And User click cta Baju
		Then Show list product by category product Baju
		
		@BuyerAccount
		Scenario: Users want to be able filter product by category baju
		Given User launch the secondhand website
		When User click cta Masuk on navbar
		And User input Email "kel3buyer@gmail.com"
		And User input Password "123456"
		And User click cta Masuk
		Then Redirect to website with login account, success to login website
		And User scroll down website until section Telusuri Kategori
		And User click cta Baju
		Then Show list product by category product Baju
		
	@FilterByCategoryElektronik @SellerAccount
	Scenario: Users want to be able filter product by category elektronik
		Given User launch the secondhand website
		When User click cta Masuk on navbar
		And User input Email "kel3seller@gmail.com"
		And User input Password "123456"
		And User click cta Masuk
		Then Redirect to website with login account, success to login website
		And User scroll down website until section Telusuri Kategori
		And User click cta Elektronik
		Then Show list product by category product Elektronik
		
		@BuyerAccount
		Scenario: Users want to be able filter product by category elektronik
		Given User launch the secondhand website
		When User click cta Masuk on navbar
		And User input Email "kel3buyer@gmail.com"
		And User input Password "123456"
		And User click cta Masuk
		Then Redirect to website with login account, success to login website
		And User scroll down website until section Telusuri Kategori
		And User click cta Elektronik
		Then Show list product by category product Elektronik
		
@FilterByCategoryKesehatan @SellerAccount
	Scenario: Users want to be able filter product by category kesehatan
		Given User launch the secondhand website
		When User click cta Masuk on navbar
		And User input Email "kel3seller@gmail.com"
		And User input Password "123456"
		And User click cta Masuk
		Then Redirect to website with login account, success to login website
		And User scroll down website until section Telusuri Kategori
		And User click cta Kesehatan
		Then Show list product by category product Elektronik
		
		@BuyerAccount
		Scenario: Users want to be able filter product by category kesehatan
		Given User launch the secondhand website
		When User click cta Masuk on navbar
		And User input Email "kel3buyer@gmail.com"
		And User input Password "123456"
		And User click cta Masuk
		Then Redirect to website with login account, success to login website
		And User scroll down website until section Telusuri Kategori
		And User click cta Kesehatan
		Then Show list product by category product Kesehatan
	