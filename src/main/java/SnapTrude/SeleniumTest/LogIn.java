package SnapTrude.SeleniumTest;

import org.openqa.selenium.By;

public class LogIn extends BasePage{
	public static final By byUserNameField = findBy("//*[@id='login_username']");
	public static final By byPasswordField = findBy("//*[@id='login_password']");
	public static final By bySignInButton = findBy("//*[@id='loginForm']");
	
	
	//*** Clickers
	
	public static void clickSignInButton() {
		clickElement(bySignInButton);
	}
	
	//*** Setters
	
	public static void SetUserNameField(String email) {
		setText(byUserNameField, email);
	}
	
	public static void SetPasswordField(String email) {
		setText(byPasswordField, email);
	}
	

}
