package com.igc.pages.impl;

import com.igl.pages.LoginPage;
import com.igc.factory.DriverFactory;

public class LoginPageImpl extends DriverFactory implements LoginPage{
	

	public void login(String username, String pwd) {
		driver.findElement(SIGNINHEADER_BUTTON).click();
		driver.findElement(USERNAME).sendKeys(username);
		driver.findElement(PASSWORD).sendKeys(pwd);
		driver.findElement(SIGNIN_BUTTON).click();
	}

}
