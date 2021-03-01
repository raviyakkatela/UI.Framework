package com.igl.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.igc.factory.DriverFactory;

public class CheckoutPayment extends DriverFactory {

	By PRODUCTLIST = By.xpath("//*[@class='product_list grid row']/li[1]");
	By ADDTOCART_BUTTON = By.xpath("//*[@id='add_to_cart']");
	By CHECKOUT_BUTTON = By.xpath("//*[@title='Proceed to checkout']");
	By CHECKOUT_BUTTON_CART_SUMMARY = By
			.xpath("//*[@class='cart_navigation clearfix']//*[@title='Proceed to checkout']");
	By CHECKOUT_BUTTON_CART_ADDRESS = By.xpath("//*[@name='processAddress']");
	By CHECKOUT_BUTTON_CART_SHIPPING = By.xpath("//*[@name='processCarrier']");
	By TERMS_CHECKBOX = By.xpath("//*[@id='cgv']");
	By PAYBYCHECK = By.xpath("//*[@title='Pay by check.']");
	By CONFIRMORDER_BUTTON = By.xpath("//*[@type='submit']//*[text()='I confirm my order']");
	By SUCCESSMESSAGE = By.xpath("//*[@class='alert alert-success']");
	By SIGNOUT = By.xpath("//*[@title='Log me out']");

	public void addItemToCart() {
		Actions actions = new Actions(driver);
		WebElement item = driver.findElement(PRODUCTLIST);
		actions.moveToElement(item);
		actions.click().build().perform();
		driver.findElement(ADDTOCART_BUTTON).click();
	}

	/**
	 * To checkout and payment the added product and complete the transaction
	 * 
	 * @author Ravi Kumar Yakkatela
	 * 
	 */
	public void checkoutAndPayment() {
		driver.findElement(CHECKOUT_BUTTON).click();
		driver.findElement(CHECKOUT_BUTTON_CART_SUMMARY).click();
		driver.findElement(CHECKOUT_BUTTON_CART_ADDRESS).click();
		driver.findElement(TERMS_CHECKBOX).click();
		driver.findElement(CHECKOUT_BUTTON_CART_SHIPPING).click();
		driver.findElement(PAYBYCHECK).click();
		driver.findElement(CONFIRMORDER_BUTTON).click();
		String msg = driver.findElement(SUCCESSMESSAGE).getText();
		Assert.assertEquals("Your order on My Store is complete.", msg);
	}

}
