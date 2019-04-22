Feature: Credit Card Application

@apply
Scenario: Credit Card Application from BOfAmerica

	Given the user is on the home page 
	And the user click credit crads link
	And the user click Cash Rewards Credit Cards link
	And the user click apply button for Cash Rewards Credit Cards
	When the user verifies url and title
	And the user enters the first name
	And the user enters the last name
	And the user enters the address
	And the user enters the city
	And the user selecets the state
	And the user enters the zip code
	And the user enters the phone number
	And the user selects the phone number type
	And the user enters the email address
	And the user answers the citizenship question
	And the user enters the SSN
	And the user answers the dual citizenship question
	And the user selects the country of residence
	And the user enters the date of birth
	And the user selects employment status
	And the user enters the total annual income
	And the user selects the source of income
	And the user enters the montlhy housing payment
	And the user click checkbox of agrement terms and conditions
	And the user selects occupation
	And the user click Continue Button
