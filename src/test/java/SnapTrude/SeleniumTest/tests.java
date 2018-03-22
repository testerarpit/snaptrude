package SnapTrude.SeleniumTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import SnapTrude.SeleniumTest.LogIn;
import SnapTrude.SeleniumTest.HomePage;

public class tests extends BasePage{
  @Test(enabled=false)
  public void emptyEmailValue() {
	  HomePage.clickInviteButton();
	  BasePage.wait(5000);
	  Assert.assertEquals(HomePage.msgStatus(), true);
  }
  
  @Test(enabled=false)
  public void invalidEmailValue() {
	  HomePage.SetEmailField("Test");
	  HomePage.clickInviteButton();
	  BasePage.wait(5000);
	  Assert.assertEquals(HomePage.msgStatus(), true);
  }
  
  @Test(enabled=false)
  public void validEmailValue() {
	  HomePage.SetEmailField("Test@test.com");
	  HomePage.clickInviteButton();
	  BasePage.wait(5000);
	  Assert.assertEquals(HomePage.msgStatus(), true);
  }
  
  @Test()
  public void validEmailPassLogin() {
	  HomePage.clickLoginButton();
	  LogIn.SetUserNameField("snaptrude@snaptrude.com");
	  LogIn.SetPasswordField("test12345");
	  LogIn.clickSignInButton();
	  BasePage.wait(2000);
	  Assert.assertEquals(driver.getTitle(), "Build | Snaptrude");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  BasePage.initialSetup();
  }

  @AfterMethod
  public void afterMethod() {
	  BasePage.closeSetup();
  }

}
