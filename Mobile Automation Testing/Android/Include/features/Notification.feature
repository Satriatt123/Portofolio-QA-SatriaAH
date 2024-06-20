@Notification
Feature: Notification-Displayed


 @NotificationAlltransaction
	Scenario: User wants to see all notifications of transactions
		Given User launch the application
    When User click menu Akun on tab
    And User click cta Masuk
    Then Show form sign in
    And User input Email "kel3seller1@gmail.com"
    And User input Password "123456"
    And User click cta view password
    And User click cta Login
    Then Redirect to profile page sign in success
    And the user clicks on the User Notifikasi cta
    Then the User Notification page with a list of User notifications should be displayed
    
 