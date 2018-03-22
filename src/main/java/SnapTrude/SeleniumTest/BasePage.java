package SnapTrude.SeleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
	
	public static WebDriver driver;
	
	public static void initialSetup() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-3.8.1\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.get("http://www.snaptrude.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	public static By findBy(String locator) {
		By byElement = null;
		if(locator.contains("/")) {
			byElement = By.xpath(locator);
		} else {
			byElement = By.id(locator);
		}
		return byElement;
	}
	
	public static String getText(By ele) {
		WebElement wEle = findElement(ele);
		return wEle.getText();
	}
	
	public static boolean isElementPresent(By ele)
    {	
   	 boolean status= false;
        WebElement wEle = findElement(ele);
       try{
       status=wEle.isDisplayed();
       return status;
       }catch(Exception e){
       	 System.out.println("ERROR: Element is not present on screen ");
       }
       return status;
    }
	public static WebElement findElement(By ele) {
		WebElement wElement = null;
		try {
			wElement = driver.findElement(ele);
		}
		catch(Exception e) {
			System.out.println("ERROR: Element not found");
		}
		return wElement;
	}
	
	public static void setText(By ele, String text) {
		WebElement wEle = findElement(ele);
		wEle.sendKeys(text);
	}
	
	public static void clickElement(By ele)
    {
        WebElement wEle = findElement(ele);
       try {
           wEle.click();
       }catch (Exception e)
       {
       	 System.out.println("ERROR: Element is unclickable ");
       }

    }
	
	public static void wait(int t) {
		try {
			Thread.sleep(t);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void implicitwait(int t) {
		driver.manage().timeouts().implicitlyWait(t, TimeUnit.SECONDS);
	}
	
	public static void closeSetup() {
		driver.quit();
	}
	
	
}
