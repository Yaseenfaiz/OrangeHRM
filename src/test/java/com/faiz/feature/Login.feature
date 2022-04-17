Feature: Login Execution

Scenario: Correct User Name And Correct Password
		Given log Into Url
		When enter The UserName "Admin"
    And enter The Password "admin123"
    And click The Login Button
    Then assertion
    And driverClose