@Category
Feature: Homepage-Category

	@CategorySemua  
	Scenario: As a user, i want to filter product by category Semua
		Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller1@gmail.com"
    And User input Password "123456"
    And User click cta view password
    And User click cta Login
    Then Redirect to profile page sign in success
    And User click cta Beranda
    And User click cta category semua
    Then Show product list by category semua on beranda page
    
   @CategoryElektronik 
   Scenario: As a user, i want to filter product by category Elektronik
		Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller1@gmail.com"
    And User input Password "123456"
    And User click cta view password
    And User click cta Login
    Then Redirect to profile page sign in success
    And User click cta Beranda
    And User click cta category elektronik
    Then Show product list by category elektronik on beranda page
    
   @CategoryKomputerdanAksesoris
   Scenario: As a user, i want to filter product by category Komputer dan Aksesoris
		Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller1@gmail.com"
    And User input Password "123456"
    And User click cta view password
    And User click cta Login
    Then Redirect to profile page sign in success
    And User click cta Beranda
    And User click cta category komputer dan aksesoris
    Then Show product list by category komputer dan aksesoris on beranda page
   
   @CategoryHandphonedanAksesoris 
   Scenario: As a user, i want to filter product by category Handphone dan Aksesoris
		Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller1@gmail.com"
    And User input Password "123456"
    And User click cta view password
    And User click cta Login
    Then Redirect to profile page sign in success
    And User click cta Beranda
    And User click cta category handphone dan aksesoris
    Then Show product list by category handphone dan aksesoris on beranda page
    
   @CategoryPakaianPria 
   Scenario: As a user, i want to filter product by category Pakaian Pria
		Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller1@gmail.com"
    And User input Password "123456"
    And User click cta view password
    And User click cta Login
    Then Redirect to profile page sign in success
    And User click cta Beranda
    And User swipe left on categori cta section until see cta category pakaian pria
    And User click cta category pakaian pria
    Then Show product list by category pakaian pria on beranda page
    
  @CategorySepatuPria 
  Scenario: As a user, i want to filter product by category Sepatu Pria
		Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller1@gmail.com"
    And User input Password "123456"
    And User click cta view password
    And User click cta Login
    Then Redirect to profile page sign in success
    And User click cta Beranda  
    And User swipe left on categori cta section until see cta category sepatu pria
    And User click cta category sepatu pria
    Then Show product list by category sepatu pria on beranda page
    
  @CategoryTasPria
  Scenario: As a user, i want to filter product by category Tas Pria 
		Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller1@gmail.com"
    And User input Password "123456"
    And User click cta view password
    And User click cta Login
    Then Redirect to profile page sign in success
    And User click cta Beranda 
    And User swipe left on categori cta section until see cta category tas pria
    And User click cta category tas pria
    Then Show product list by category tas pria on beranda page
    
  @CategoryAksesorisFashion
  Scenario: As a user, i want to filter product by category Aksesoris Fashion
		Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller1@gmail.com"
    And User input Password "123456"
    And User click cta view password
    And User click cta Login
    Then Redirect to profile page sign in success
    And User click cta Beranda
    And User swipe left on categori cta section until see cta category aksesoris fashion
    And User click cta category aksesoris fashion
    Then Show product list by category aksesoris fashion on beranda page
    
  @CategoryKesehatan  
   Scenario: As a user, i want to filter product by category Kesehatan
		Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller1@gmail.com"
    And User input Password "123456"
    And User click cta view password
    And User click cta Login
    Then Redirect to profile page sign in success
    And User click cta Beranda
    And User swipe left on categori cta section until see cta category kesehatan
    And User click cta category kesehatan
    Then Show product list by category kesehatan on beranda page
    
  @CategoryHobidanKoleksi
  Scenario: As a user, i want to filter product by category Hobi dan Koleksi
		Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller1@gmail.com"
    And User input Password "123456"
    And User click cta view password
    And User click cta Login
    Then Redirect to profile page sign in success
    And User click cta Beranda
    And User swipe left on categori cta section until see cta category hobi dan koleksi
    And User click cta category hobi dan koleksi
    Then Show product list by category hobi dan koleksi on beranda page
    
  @CategoryMakanandanMinuman
  Scenario: As a user, i want to filter product by category Makanan dan Minuman
		Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller1@gmail.com"
    And User input Password "123456"
    And User click cta view password
    And User click cta Login
    Then Redirect to profile page sign in success
    And User click cta Beranda
    And User swipe left on categori cta section until see cta category makanan dan minuman
    And User click cta category makanan dan minuman
    Then Show product list by category makanan dan minuman on beranda page
    
   @CategoryPerawatandanKecantikan
   Scenario: As a user, i want to filter product by category Perawatan dan Kecantikan
		Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller1@gmail.com"
    And User input Password "123456"
    And User click cta view password
    And User click cta Login
    Then Redirect to profile page sign in success
    And User click cta Beranda
    And User swipe left on categori cta section until see cta category perawatan dan kecantikan
    And User click cta category perawatan dan kecantikan
    Then Show product list by category perawatan dan kecantikan on beranda page
    
    
   @CategoryPerlengkapanRumah   
    Scenario: As a user, i want to filter product by category Perlengkapan Rumah
			Given User launch the application
	    When User click menu Akun on tab
	    And User click cta Masuk
	    Then Show form sign in
	    And User input Email "kel3seller1@gmail.com"
	    And User input Password "123456"
	    And User click cta view password
	    And User click cta Login
	    Then Redirect to profile page sign in success
	    And User click cta Beranda
	    And User swipe left on categori cta section until see cta category perlengkapan rumah
	    And User click cta category perlengkapan rumah
	    Then Show product list by category perlengkapan rumah on beranda page
	    
	@CategoryPakaianWanita
	 Scenario: As a user, i want to filter product by category Pakaian Wanita
			Given User launch the application
	    When User click menu Akun on tab
	    And User click cta Masuk
	    Then Show form sign in
	    And User input Email "kel3seller1@gmail.com"
	    And User input Password "123456"
	    And User click cta view password
	    And User click cta Login
	    Then Redirect to profile page sign in success
	    And User click cta Beranda
	    And User swipe left on categori cta section until see cta category pakaian wanita   
	    And User click cta category pakaian wanita
	    Then Show product list by category pakaian wanita on beranda page
	    
	@CategoryFashionMuslim
	Scenario: As a user, i want to filter product by category fashion muslim
			Given User launch the application
	    When User click menu Akun on tab
	    And User click cta Masuk
	    Then Show form sign in
	    And User input Email "kel3seller1@gmail.com"
	    And User input Password "123456"
	    And User click cta view password
	    And User click cta Login
	    Then Redirect to profile page sign in success
	    And User click cta Beranda
	    And User swipe left on categori cta section until see cta category fashion muslim
	    And User click cta category fashion muslim
	    Then Show product list by category fashion muslim on beranda page
	    
	@CategoryFashionBayidanAnak
	Scenario: As a user, i want to filter product by category Fashion Bayi dan Anak
			Given User launch the application
	    When User click menu Akun on tab
	    And User click cta Masuk
	    Then Show form sign in
	    And User input Email "kel3seller1@gmail.com"
	    And User input Password "123456"
	    And User click cta view password
	    And User click cta Login
	    Then Redirect to profile page sign in success
	    And User click cta Beranda
	    And User swipe left on categori cta section until see cta category fashion bayi dan anak
	    And User click cta category fashion bayi dan anak
	    Then Show product list by category bayi dan anak on beranda page
    
  @CategoryIbudanBayi
	Scenario: As a user, i want to filter product by category Ibu dan Bayi
			Given User launch the application
	    When User click menu Akun on tab
	    And User click cta Masuk
	    Then Show form sign in
	    And User input Email "kel3seller1@gmail.com"
	    And User input Password "123456"
	    And User click cta view password
	    And User click cta Login
	    Then Redirect to profile page sign in success
	    And User click cta Beranda
	    And User swipe left on categori cta section until see cta category ibu dan bayi
	    And User click cta category ibu dan bayi
	    Then Show product list by category ibu dan bayi on beranda page
	    
	@CategorySepatuWanita
	Scenario: As a user, i want to filter product by category Sepatu Wanita
			Given User launch the application
	    When User click menu Akun on tab
	    And User click cta Masuk
	    Then Show form sign in
	    And User input Email "kel3seller1@gmail.com"
	    And User input Password "123456"
	    And User click cta view password
	    And User click cta Login
	    Then Redirect to profile page sign in success
	    And User click cta Beranda
	    And User swipe left on categori cta section until see cta category sepatu wanita
	    And User click cta category sepatu wanita
	    Then Show product list by category sepatu wanita on beranda page
	    
	@CategoryTasWanita
	Scenario: As a user, i want to filter product by category Tas Wanita
			Given User launch the application
	    When User click menu Akun on tab
	    And User click cta Masuk
	    Then Show form sign in
	    And User input Email "kel3seller1@gmail.com"
	    And User input Password "123456"
	    And User click cta view password
	    And User click cta Login
	    Then Redirect to profile page sign in success
	    And User click cta Beranda
	    And User swipe left on categori cta section until see cta category tas wanita
	    And User click cta category tas wanita
	    Then Show product list by category tas wanita on beranda page
	    
	@CategoryOtomotif
	Scenario: As a user, i want to filter product by category Otomotif
			Given User launch the application
	    When User click menu Akun on tab
	    And User click cta Masuk
	    Then Show form sign in
	    And User input Email "kel3seller1@gmail.com"
	    And User input Password "123456"
	    And User click cta view password
	    And User click cta Login
	    Then Redirect to profile page sign in success
	    And User click cta Beranda
	    And User swipe left on categori cta section until see cta category otomotif
	    And User click cta category otomotif
	    Then Show product list by category otomotif on beranda page
	    
	@CategoryOlahragadanOutdoor
	Scenario: As a user, i want to filter product by category Olahraga dan Outdoor
			Given User launch the application
	    When User click menu Akun on tab
	    And User click cta Masuk
	    Then Show form sign in
	    And User input Email "kel3seller1@gmail.com"
	    And User input Password "123456"
	    And User click cta view password
	    And User click cta Login
	    Then Redirect to profile page sign in success
	    And User click cta Beranda
	    And User swipe left on categori cta section until see cta category olahraga dan outdoor
	    And User click cta category olahraga dan outdoor
	   Then Show product list by category olahraga dan outdoor on beranda page
	    
	@CategoryBukudanAlatTulis
	Scenario: As a user, i want to filter product by category Buku dan Alat Tulis
			Given User launch the application
	    When User click menu Akun on tab
	    And User click cta Masuk
	    Then Show form sign in
	    And User input Email "kel3seller1@gmail.com"
	    And User input Password "123456"
	    And User click cta view password
	    And User click cta Login
	    Then Redirect to profile page sign in success
	    And User click cta Beranda
	    And User swipe left on categori cta section until see cta category buku dan alat tulis
	    And User click cta category buku dan alat tulis
	    Then Show product list by category buku dan alat tulis on beranda page
	    
	@CategoryVoucher
	Scenario: As a user, i want to filter product by category Voucher
			Given User launch the application
	    When User click menu Akun on tab
	    And User click cta Masuk
	    Then Show form sign in
	    And User input Email "kel3seller1@gmail.com"
	    And User input Password "123456"
	    And User click cta view password
	    And User click cta Login
	    Then Redirect to profile page sign in success
	    And User click cta Beranda
	    And User swipe left on categori cta section until see cta category voucher
	    And User click cta category voucher
	    Then Show product list by category voucher on beranda page
	    
	@CategorySouvenirdanPesta
	Scenario: As a user, i want to filter product by category Souvenir dan Pesta
			Given User launch the application
	    When User click menu Akun on tab
	    And User click cta Masuk
	    Then Show form sign in
	    And User input Email "kel3seller1@gmail.com"
	    And User input Password "123456"
	    And User click cta view password
	    And User click cta Login
	    Then Redirect to profile page sign in success
	    And User click cta Beranda
	    And User swipe left on categori cta section until see cta category souvenir dan pesta
	    And User click cta category souvenir dan pesta
	    Then Show product list by category souvenir dan pesta on beranda page
	    
	@CategoryFotografi
	Scenario: As a user, i want to filter product by category Fotografi
			Given User launch the application
	    When User click menu Akun on tab
	    And User click cta Masuk
	    Then Show form sign in
	    And User input Email "kel3seller1@gmail.com"
	    And User input Password "123456"
	    And User click cta view password
	    And User click cta Login
	    Then Redirect to profile page sign in success
	    And User click cta Beranda
	    And User swipe left on categori cta section until see cta category fotografi
	    And User click cta category fotografi
	    Then Show product list by category fotografi on beranda page