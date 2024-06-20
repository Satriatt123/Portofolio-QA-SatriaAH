@ListProductCard
Feature: ListProductCard
	
	@ListProductCard
  Scenario: As a user, i can view product details in the category Semua
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller1@gmail.com"
    And User input Password "123456"
    And User click icon eye to show Password
    And User click cta Login
    Then Redirect to profile page sign in success
    And User click cta Beranda
    And User click cta Semua
    And User clicks on one of the products
    Then Users can view product details in the category Semua

	@ListProductCardElektronik
  Scenario: As a user, i can view product details in the category Elektronik
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller1@gmail.com"
    And User input Password "123456"
    And User click icon eye to show Password
    And User click cta Login
    Then Redirect to profile page sign in success
    And User click cta Beranda
    And User click cta Elektronik
    And User clicks on one of the products
    Then Users can view product details in the category Elektronik
	
	@ListProductCardKomputerdanAksesoris
  Scenario: As a user, i can view product details in the category Komputer dan Aksesoris
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller1@gmail.com"
    And User input Password "123456"
    And User click icon eye to show Password
    And User click cta Login
    Then Redirect to profile page sign in success
    And User click cta Beranda
    And User click cta Komputer dan Aksesoris
    And User clicks on one of the products
    Then Users can view product details in the category Komputer dan Aksesoris

	@ListProductCardHandphonedanAksesoris
  Scenario: As a user, i can see product details in the category Handphone dan Aksesoris
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller1@gmail.com"
    And User input Password "123456"
    And User click icon eye to show Password
    And User click cta Login
    Then Redirect to profile page sign in success
    And User click cta Beranda
    And User click cta Handphone dan Aksesoris
    And User clicks on one of the products
    Then Users can view product details in the category Handphone dan Aksesoris

	@ListProductCardPakaianPria
  Scenario: As a user, i can view product details in the category Pakaian Pria
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller1@gmail.com"
    And User input Password "123456"
    And User click icon eye to show Password
    And User click cta Login
    Then Redirect to profile page sign in success
    And User click cta Beranda
    And User swipe to the category section until see cta Pakaian Pria
    And User click cta Pakaian Pria
    And User clicks on one of the products
    Then Users can view product details in the category Pakaian Pria

	@ListProductCardSepatuPria
  Scenario: As a user, i can view product details in the category Sepatu Pria
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller1@gmail.com"
    And User input Password "123456"
    And User click icon eye to show Password
    And User click cta Login
    Then Redirect to profile page sign in success
    And User click cta Beranda
    And User swipe to the category section until see cta Sepatu Pria
    And User click cta Sepatu Pria
    And User clicks on one of the products
    Then Users can view product details in the category Sepatu Pria
	
	@ListProductCardTasPria
  Scenario: As a user, i can view product details in the category Tas Pria
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller1@gmail.com"
    And User input Password "123456"
    And User click icon eye to show Password
    And User click cta Login
    Then Redirect to profile page sign in success
    And User click cta Beranda
    And User swipe to the category section until see cta Tas Pria
    And User click cta Tas Pria
    And User clicks on one of the products
    Then Users can view product details in the category Tas Pria
	
	@ListProductCardAksesorisFashion
  Scenario: As a user, i can view product details in the category Aksesoris Fashion
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller1@gmail.com"
    And User input Password "123456"
    And User click icon eye to show Password
    And User click cta Login
    Then Redirect to profile page sign in success
    And User click cta Beranda
    And User swipe to the category section until see cta Aksesoris Fashion
    And User click cta Aksesoris Fashion
    And User clicks on one of the products
    Then Users can view product details in the category Aksesoris Fashion
	
	@ListProductCardKesehatan
  Scenario: As a user, i can view product details in the category Kesehatan
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller1@gmail.com"
    And User input Password "123456"
    And User click icon eye to show Password
    And User click cta Login
    Then Redirect to profile page sign in success
    And User click cta Beranda
    And User swipe to the category section until see cta Kesehatan
    And User click cta Kesehatan
   And User clicks on one of the products
    Then Users can view product details in the category Kesehatan

	@ListProductCardHobidanKoleksi
  Scenario: As a user, i can view product details in the category Hobi dan Koleksi
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller1@gmail.com"
    And User input Password "123456"
    And User click icon eye to show Password
    And User click cta Login
    Then Redirect to profile page sign in success
    And User click cta Beranda
    And User swipe to the category section until see cta Hobi dan Koleksi
    And User click cta Hobi dan Koleksi
    And User clicks on one of the products
    Then Users can view product details in the category Hobi dan Koleksi

	@ListProductCardMakanandanMinuman
  Scenario: As a user, i can view product details in the category Makanan dan Minuman
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller1@gmail.com"
    And User input Password "123456"
    And User click icon eye to show Password
    And User click cta Login
    Then Redirect to profile page sign in success
    And User click cta Beranda
    And User swipe to the category section until see cta Makanan dan Minuman
    And click cta Makanan dan Minuman
    And User clicks on one of the products
    Then Users can view product details in the category Makanan dan Minuman

	@ListProductCardPerawatandanKecantikan
  Scenario: As a user, i can view product details in the category Perawatan dan Kecantikan
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller1@gmail.com"
    And User input Password "123456"
    And User click icon eye to show Password
    And User click cta Login
    Then Redirect to profile page sign in success
    And User click cta Beranda
    And User swipe to the category section until see cta Perawatan dan Kecantikan
    And User click cta Perawatan dan Kecantikan
    And User clicks on one of the products
    Then Users can view product details in the category Perawatan dan Kecantikan
	
	@ListProductCardPerlengkapanRumah
  Scenario: As a user, i can view product details in the category Perlengkapan Rumah
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller1@gmail.com"
    And User input Password "123456"
    And User click icon eye to show Password
    And User click cta Login
    Then Redirect to profile page sign in success
    And User click cta Beranda
    And User swipe to the category section until see cta Perlengkapan Rumah
    And User click cta Perlengkapan Rumah
    And User clicks on one of the products
    Then Users can view product details in the category Perlengkapan Rumah
	
	@ListProductCardPakaianWanita
  Scenario: As a user, i can view product details in the category Pakaian Wanita
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller1@gmail.com"
    And User input Password "123456"
    And User click icon eye to show Password
    And User click cta Login
    Then Redirect to profile page sign in success
    And User click cta Beranda
    And User swipe to the category section until see cta Pakaian Wanita
    And User click cta Pakaian Wanita
    And User clicks on one of the products
    Then Users can view product details in the category Pakaian Wanita

	@ListProductCardFashionMuslim
  Scenario: As a user, i can view product details in the category Fashion Muslim
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller1@gmail.com"
    And User input Password "123456"
    And User click icon eye to show Password
    And User click cta Login
    Then Redirect to profile page sign in success
    And User click cta Beranda
    And User swipe to the category section until see cta Fashion Muslim
    And User click cta Fashion Muslim
    And User clicks on one of the products
    Then Users can view product details in the category Fashion Muslim

	@ListProductCardFashionBayidanAnak
  Scenario: As a user, i can view product details in the category Fashion Bayi dan Anak
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller1@gmail.com"
    And User input Password "123456"
    And User click icon eye to show Password
    And User click cta Login
    Then Redirect to profile page sign in success
    And User click cta Beranda
    And User swipe to the category section until see cta Fashion Bayi dan Anak
    And User click cta Fashion Bayi dan Anak
    And User clicks on one of the products
    Then Users can view product details in the category Fashion Bayi dan Anak

	@ListProductCardIbudanBayi
  Scenario: As a user, i can view product details in the category Ibu dan Bayi
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller1@gmail.com"
    And User input Password "123456"
    And User click icon eye to show Password
    And User click cta Login
    Then Redirect to profile page sign in success
    And User click cta Beranda
    And User swipe to the category section until see cta Ibu dan Bayi
    And User click cta Ibu dan Bayi
    And User clicks on one of the products
    Then Users can view product details in the category Ibu dan Bayi

	@ListProductCardSepatuWanita
  Scenario: As a user, i can view product details in the category Sepatu Wanita
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller1@gmail.com"
    And User input Password "123456"
    And User click icon eye to show Password
    And User click cta Login
    Then Redirect to profile page sign in success
    And User click cta Beranda
    And User swipe to the category section until see cta Sepatu Wanita
    And User click cta Sepatu Wanita
    And User clicks on one of the products
    Then Users can view product details in the category Sepatu Wanita

	@ListProductCardTasWanita
  Scenario: As a user, i can view product details in the category Tas Wanita
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller1@gmail.com"
    And User input Password "123456"
    And User click icon eye to show Password
    And User click cta Login
    Then Redirect to profile page sign in success
    And User click cta Beranda
    And User swipe to the category section until see cta Tas Wanita
    And User click cta Tas Wanita
    And User clicks on one of the products
    Then Users can view product details in the category Tas Wanita

	@ListProductCardOtomotif
  Scenario: As a user, i can view product details in the category Otomotif
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller1@gmail.com"
    And User input Password "123456"
    And User click icon eye to show Password
    And User click cta Login
    Then Redirect to profile page sign in success
    And User click cta Beranda
    And User swipe to the category section until see cta Otomotif
    And User click cta Otomotif
    And User clicks on one of the products
    Then Users can view product details in the category Otomotif

	@ListProductCardOlahragadanOutdoor
  Scenario: As a user, i can view product details in the category Olahraga dan Outdoor
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller1@gmail.com"
    And User input Password "123456"
    And User click icon eye to show Password
    And User click cta Login
    Then Redirect to profile page sign in success
    And User click cta Beranda
    And User swipe to the category section until see cta Olahraga dan Outdoor
    And User click cta Olahraga dan Outdoor
    And User clicks on one of the products
    Then Users can view product details in the category Olahraga dan Outdoor

	@ListProductCardBukudanAlatTulis
  Scenario: As a user, i can view product details in the category Buku dan Alat Tulis
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller1@gmail.com"
    And User input Password "123456"
    And User click icon eye to show Password
    And User click cta Login
    Then Redirect to profile page sign in success
    And User click cta Beranda
    And User swipe to the category section until see cta Buku dan Alat Tulis
    And User click cta Buku dan Alat Tulis
    And User clicks on one of the products
    Then Users can view product details in the category Buku dan Alat Tulis

	@ListProductCardVoucher
  Scenario: As a user, i can view product details in the category Voucher
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller1@gmail.com"
    And User input Password "123456"
    And User click icon eye to show Password
    And User click cta Login
    Then Redirect to profile page sign in success
    And User click cta Beranda
    And User swipe to the category section until see cta Voucher
    And User click cta Voucher
    And User clicks on one of the products
    Then Users can view product details in the category Voucher

	@ListProductCardSourvenirdanPesta
  Scenario: As a user, i can view product details in the category Souvenir dan Pesta
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller1@gmail.com"
    And User input Password "123456"
    And User click icon eye to show Password
    And User click cta Login
    Then Redirect to profile page sign in success
    And User click cta Beranda
    And User swipe to the category section until see cta Souvenir dan Pesta
    And User click cta Souvenir dan Pesta
    And User clicks on one of the products
    Then Users can view product details in the category Souvenir dan Pesta

	@ListProductCardFotografi
  Scenario: As a user, i can view product details in the category Fotografi
    Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller1@gmail.com"
    And User input Password "123456"
    And User click icon eye to show Password
    And User click cta Login
    Then Redirect to profile page sign in success
    And User click cta Beranda
    And User swipe to the category section until see cta Fotografi
    And User click cta Fotografi
    And User clicks on one of the products
    Then Users can view product details in the category Fotografi
