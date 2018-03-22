package SnapTrude.SeleniumTest;

import org.openqa.selenium.By;

public class HomePage extends BasePage {
	
	public static final By byEmailfield = findBy("email");
	public static final By byInviteButton = findBy("login");
	public static final By byMessage = findBy("//*[@id='subscribediv']/b/div[3]/center/h2/b");
	public static final By byLoginButton = findBy("//*[text()='Login']");
	
	
	//*** Setters
	
	public static void SetEmailField(String email) {
		setText(byEmailfield, email);
	}
	
	//*** Clickers

	public static void clickInviteButton() {
		clickElement(byInviteButton);
	}
	
	public static void clickEmailField() {
		clickElement(byEmailfield);
	}
	
	public static void clickLoginButton() {
		clickElement(byLoginButton);
	}
	
	
	public static boolean msgStatus(){
		return isElementPresent(byMessage);
	}
	

}
