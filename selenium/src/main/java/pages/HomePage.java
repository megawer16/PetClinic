package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage extends PageBase{


	public HomePage(WebDriver driver) {
		super(driver);
	}

	public WebElement homeButton = driver.findElement(By.xpath(Locators.HomePageLocators.homeButtonXpath));

	public WebElement findOwnersButton = driver.findElement(By.xpath(Locators.HomePageLocators.findOwnersButtonXpath));

	public WebElement veterinariansButton = driver.findElement(By.xpath(Locators.HomePageLocators.VeterinariansButtonXpath));

	public WebElement HomeImage = driver.findElement(By.cssSelector(Locators.HomePageLocators.homePageImage));

	public void NavigateToPage(WebElement linkName)
	{
		linkName.click();
	}
	
	public Boolean IsImageDisplayed()
	{
		Boolean flag = false;
		flag = (Boolean) ((JavascriptExecutor)driver) 
				.executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " 
						+ "&& arguments[0].naturalWidth > 0", HomeImage);
		return flag;
	}
}
