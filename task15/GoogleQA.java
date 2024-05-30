package mavenproject;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class GoogleQA {
	
	@Test
	public void test() {
//create a object for ChromeDriver	
ChromeDriver chromeDriver=new ChromeDriver();
//enter the URL
chromeDriver.get("https://www.google.com");
//Enter the search id from the inspect element
By by=By.id("APjFqb");
WebElement element=chromeDriver.findElement(by);
//enter the search keywords
element.sendKeys("selenium browser driver");
element.sendKeys(Keys.ENTER);
//click the serach options
String results=chromeDriver.getPageSource();

boolean result=results.contains("selenium browser driver");
//compare the expect result and actual result

Assert.assertEquals(result, true);
//automatic google browser quit

chromeDriver.quit();



}
	}


