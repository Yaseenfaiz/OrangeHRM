package com.faiz.execution;

import com.faiz.baseclass.BaseClass;
import com.faiz.pageexecution.LoginExecution;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Execution extends LoginExecution{

	@Given("log Into Url")
	public void log_into_url() {
		BaseClass.brwserlaunch();
		BaseClass.url("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}

	@When("enter The UserName {string}")
	public void enter_the_user_name(String string) {
		userName(string);
	}
	@When("enter The Password {string}")
	public void enter_the_password(String string) {
		passWord(string);
	}
	@When("click The Login Button")
	public void click_the_login_button() {
		clickButton();
	}
	@Then("assertion")
	public void assertion() {
		assertUrlNotEqual("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	@Then("driverClose")
	public void driver_close() {
		BaseClass.quitBrowser();
	}



	
}
