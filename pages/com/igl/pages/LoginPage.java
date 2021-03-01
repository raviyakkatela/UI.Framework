package com.igl.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.igc.factory.DriverFactory;

public class LoginPage extends DriverFactory {

	private By SIGNINHEADER_BUTTON = By.xpath("//*[@class='login']");
	private By USERNAME = By.xpath("//*[@id='email']");
	private By PASSWORD = By.xpath("//*[@id='passwd']");
	private By SIGNIN_BUTTON = By.xpath("//*[@id='SubmitLogin']");

	public void login(String username, String pwd) {
		driver.findElement(SIGNINHEADER_BUTTON).click();
		driver.findElement(USERNAME).sendKeys(username);
		driver.findElement(PASSWORD).sendKeys(pwd);
		driver.findElement(SIGNIN_BUTTON).click();
	}

}
