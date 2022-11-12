package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddOwnersDetailsPage extends PageBase 
{
	public AddOwnersDetailsPage(WebDriver driver) {
		super(driver);
	}

	public WebElement fnameBox = driver.findElement(By.id(Locators.AddOwnersDetails.FirstNameId));
	public WebElement lnameBox = driver.findElement(By.id(Locators.AddOwnersDetails.LastNameId));
	public WebElement addressBox = driver.findElement(By.id(Locators.AddOwnersDetails.AddressId));
	public WebElement cityBox = driver.findElement(By.id(Locators.AddOwnersDetails.CityId));
	public WebElement telephoneBox = driver.findElement(By.id(Locators.AddOwnersDetails.TelephoneId));
	public WebElement submitAddNewOwnersButton = driver.findElement(By.xpath(Locators.AddOwnersDetails.SubmitAddNewButtonXpath));

	public void AddNewOwnerDetails(String firstname, String lastname, String address, String cityName, String telNum)
	{
		(fnameBox).sendKeys(firstname);
		(lnameBox).sendKeys(lastname);
		(addressBox).sendKeys(address);
		(cityBox).sendKeys(cityName);
		(telephoneBox).sendKeys(telNum);
		(submitAddNewOwnersButton).click();
	}

}
