package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindOwnersPage extends PageBase 
{
	public FindOwnersPage(WebDriver driver) {
		super(driver);
	}

	public WebElement searchOwnersButton = driver.findElement(By.xpath(Locators.FindOwnersPageLocators.SearchButtonXpath));
	public WebElement addOwnersButton = driver.findElement(By.xpath(Locators.FindOwnersPageLocators.AddButtonXpath));

	public void SearchOwners()
	{
		(searchOwnersButton)
		.click();
	}

	public void AddNewOwner()
	{
		(addOwnersButton)
		.click();
	}

	public List<String> GetOwnersNameList()
	{
		WebElement ownersTable = driver.findElement(By.id(Locators.FindOwnersPageLocators.OwnersTableId));
		java.util.List<String> OwnersNameList = new ArrayList<String>();
		java.util.List<WebElement> rows = ownersTable.findElements(By.xpath(".//tr"));
		int tableRowCount = rows.size();
		for(int i = 1; i<tableRowCount; i++)
		{
			String OwnerDisplayedName = ownersTable.findElement(By.xpath(".//tr[" + i + "]/td[1]")).getText();
			OwnersNameList.add(OwnerDisplayedName);
		}
		return OwnersNameList; 
	}

}
