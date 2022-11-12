package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddPetDetailsPage extends PageBase 
{
	public AddPetDetailsPage(WebDriver driver) {
		super(driver);
	}

	public WebElement nameTxtBox = driver.findElement(By.id(Locators.AddPetDetails.NameTxtBoxId));
	public WebElement dateTxtBox = driver.findElement(By.id(Locators.AddPetDetails.DateTxtBoxId));	
	public Select drpType = new Select(driver.findElement(By.id(Locators.AddPetDetails.TypeDrpdID)));
	public WebElement submitAddNewPet = driver.findElement(By.xpath(Locators.AddPetDetails.SubmitAddNewButtonXpath));	
	
	public void AddNewPetDetails(String name, String date, String category)
	{
		nameTxtBox.sendKeys(name);
		dateTxtBox.sendKeys(date);
		drpType.selectByVisibleText(category);
		
		submitAddNewPet.click();
		
	}
}
