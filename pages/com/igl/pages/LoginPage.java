package com.igl.pages;

import org.openqa.selenium.By;

public interface LoginPage {
	
	By SIGNINHEADER_BUTTON = By.xpath("//*[@class='login']");
	By USERNAME = By.xpath("//*[@id='email']");
	By PASSWORD = By.xpath("//*[@id='passwd']");
	By SIGNIN_BUTTON = By.xpath("//*[@id='SubmitLogin']");

}
