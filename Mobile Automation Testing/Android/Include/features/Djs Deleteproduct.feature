@Daftarjualsayadeleteproduct @smoke
Feature: Daftar Jual Saya - Delete Product

@Daftarjualsayadeleteproduct @deleteproduct
Scenario: [Seller] As a user, i want to delete product
Given user launched the second hand apps
And user click menu Profile on tab
When User click cta Masuk in profile page
And User input the Email "kel3seller5@gmail.com"
And User input the Password "123456"
And User click eye icon to show Password
And user click cta Masuk
Then user will be Redirect to profile page, sign in success
And User click menu Daftar Jual Saya
When User click icon Trash
And User click cta Hapus
Then Show popup success message Produk berhasil dihapus

@Daftarjualsayadeleteproduct @canceldeleteproduct
Scenario: [Seller] As a user, i want to cancel when delete product
Given user launched the second hand apps
And user click menu Profile on tab
When User click cta Masuk in profile page
And User input the Email "kel3seller5@gmail.com"
And User input the Password "123456"
And User click eye icon to show Password
And user click cta Masuk
Then user will be Redirect to profile page, sign in success
And User click menu Daftar Jual Saya
When User click icon Trash
And User click cta Batalkan
Then Show list product on tab Produk