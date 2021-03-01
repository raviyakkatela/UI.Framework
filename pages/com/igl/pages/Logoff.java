package com.igl.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.igc.factory.DriverFactory;

public class Logoff extends DriverFactory {

	By SIGNOUT = By.xpath("//*[@title='Log me out']");

	public void loggoff() {
		driver.findElement(SIGNOUT).click();

	}
}
