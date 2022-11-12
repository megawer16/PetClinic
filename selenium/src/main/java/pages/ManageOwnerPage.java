package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ManageOwnerPage extends PageBase 
{
	public ManageOwnerPage(WebDriver driver) {
		super(driver);
	}

	public WebElement addNewPetButton = driver.findElement(By.xpath(Locators.ManageOwners.AddNewPetXpath));


	public void NavigateToAddNewPetPage()
	{
		(addNewPetButton)
		.click();
	}

	public Boolean VerifyOwnersDetails(String field, String expectedValue)
	{
		Boolean flag = false;
		String actualValue = "";
		if(field.equals("Name"))
			actualValue = driver.findElement(By.xpath(Locators.ManageOwners.OwnersNameXpath)).getText();
		else if(field.equals("Address"))
			actualValue = driver.findElement(By.xpath(Locators.ManageOwners.OwnersAddressXpath)).getText();
		else if(field.equals("City"))
			actualValue = driver.findElement(By.xpath(Locators.ManageOwners.OwnersCityXpath)).getText();
		else if(field.equals("Telephone"))
			actualValue = driver.findElement(By.xpath(Locators.ManageOwners.OwnersTelephoneXpath)).getText();
		else if(field.equals("PetName"))
			actualValue = driver.findElement(By.xpath(Locators.ManageOwners.PetNameXpath)).getText();
		else if(field.equals("PetBirthDate"))
			actualValue = driver.findElement(By.xpath(Locators.ManageOwners.PetBirthDateXpath)).getText();
		else if(field.equals("PetType"))
			actualValue = driver.findElement(By.xpath(Locators.ManageOwners.PetTypeXpath)).getText();
		if(actualValue.equals(expectedValue))
			flag = true;
		return flag;
	}

}
