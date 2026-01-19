package com.e2eTest.automation.pages_objects;

import org.openqa.selenium.WebDriver;

import com.e2eTest.automation.utils.BasePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;


public class NewsletterPage extends BasePage {

	public NewsletterPage(WebDriver driver) {
		super(driver);
		
	}

	
	@FindBy(how = How.CSS, using = "#newsletter-email")
	private static WebElement newsletterPage;

	@FindBy(how = How.CSS, using = "#newsletter-subscribe-button")
	private static WebElement subscribeButton;

	@FindBy(how = How.ID, using = "newsletter-result-block")
	private static WebElement errorMessage;

	
	public static WebElement getNewsletterPage() {
		return newsletterPage;
	}
	
	public static WebElement getSubscribeButton() {
		return subscribeButton;
	}
	
	public static WebElement getErrorMessage() {
		return errorMessage;



}

}