package com.e2eTest.automation.step_definitions;

import org.junit.jupiter.api.Assertions;

import com.e2eTest.automation.pages_objects.NewsletterPage;

import com.e2eTest.automation.utils.ConfigFileReader;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewsletterSteps {

	NewsletterPage newsLetterPage = new NewsletterPage();
	ConfigFileReader configFileReader = new ConfigFileReader();

	@When("Je me redirige vers la rubrique newsletter")
	public void jeMeRedirigeVersLaRubriqueNewsletter() {
		NewsletterPage.getNewsLetterBarMenu();
	}
	
	@When("Je saisis une adresse mail valide")
	public void jeSaisisUneAdresseMailValide() {
		NewsletterPage.getEmailField().sendKeys(configFileReader.getProperty("home.email"));
	}
	
	@When("Je clique sur le bouton subscribe")
	public void jeCliqueSurLeBoutonSubscribe() {
		NewsletterPage.getSubscribeButton().click();
	}
	
	@Then("Je vois un msg de confirmation {string}")
	public void jeVoisUnMsgDeConfirmation(String message) {
	
//		String confirmationMessage = WaitUtils.waitForVisibility(
//				  NewsLetterPage.getConfirmationMessage()).getText();
//		
//		Assertions.assertEquals(confirmationMessage, message);
	}




}