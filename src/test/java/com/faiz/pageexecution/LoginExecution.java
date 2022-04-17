package com.faiz.pageexecution;

import com.faiz.baseclass.BaseClass;
import com.faiz.locators.LoginLocators;

public class LoginExecution extends LoginLocators{

	public static void userName(String name) {
		BaseClass.sendValues(BaseClass.findById(LoginLocators.userName), name);
	}
	public static void passWord(String pass) {
		BaseClass.sendValues(BaseClass.findById(LoginLocators.passWord), pass);
	}
	public static void clickButton() {
		BaseClass.click(BaseClass.findById(LoginLocators.clickButton));
	}
	
	public static void assertUrlNotEqual(String login) {
		BaseClass.assertNotEqualUrl(login);
	}
	
}
