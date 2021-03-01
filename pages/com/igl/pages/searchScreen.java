package com.igl.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.igc.factory.DriverFactory;

public class searchScreen extends DriverFactory {

	// Search and sort the products
	By GLOBALSEARCH_TEXTBOX = By.xpath("//*[@id='search_query_top']");
	By GLOBALSEARCH__LINK = By.xpath("//*[@name='submit_search']");
	By SORTBY_SELECT = By.xpath("//*[@id='selectProductSort']");
	By PRODUCTLIST = By.xpath("//*[@class='product_list grid row']/li[1]");

	public void enterSerachCriteria(String keyword) {
		driver.findElement(GLOBALSEARCH_TEXTBOX).sendKeys(keyword);
		driver.findElement(GLOBALSEARCH__LINK).click();
	}

	public void selectSortBy(String price) {
		Select sortBy = new Select(driver.findElement(SORTBY_SELECT));
		if (price.equalsIgnoreCase("lowest")) {
			sortBy.selectByVisibleText("Price: Lowest first");
		}
	}

}
