Feature: Hotel Booking In Adactin Application 
@smokeTest
Scenario: User Login In The Web Application 
	Given user Launch The Url In Adactin Application 
	When  user Enter The Username In Username Field 
	And   user Enter The Password In Password Field 
	Then  user Click The Login Button And It Navigates To Search Hotel Page 
@sanityTest	
Scenario: User Search The Hotel Type 
	When  user Select The Location In DropDown Box 
	And   user Select The Hotel In DropDown Box 
	And   user Select The Room Type In DropDown Box 
	And   user Select The Number Of Rooms In DropDown Box 
	And   user Enter The CheckIn Date In DropDown Box 
	And   user Enter The CheckOut Date Out DropDown Box 
	And   user Select The No Of Adults In Room In DropDown Box 
	And   user Select The Children In Room In DropDown Box 
	Then  user Click The Search Button And It Navigates To Next Page 

Scenario: Select The Hotel 
	When  user Select The Hotel In DropDown Box 
	Then  user Click The Continue Button And It Navigates To Next Page 
	
Scenario:  Book A Hotel 
	When  user Enter The Firstname In Firstname Field 
	And   user Enter The Lastname In Lastname Field 
	And   user Enter The Billing Address In Billing Address Field 
	And   user Enter The Creditcard Number In Creditcard Field 
	And   user Select The Creditcardtye In Creditcardtye Field In DropDown Box 
	And   user Select The Expirydate In Month And Year In DropDown Box 
	And   user Enter The CVV Number In CVV Number Field In DropDown Box 
	Then  user Click The BookNow Button And It Navigates To Next Page 
	
