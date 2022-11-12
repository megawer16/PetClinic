package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VeterinariansPage extends PageBase 
{
	public VeterinariansPage(WebDriver driver) {
		super(driver);
	}

	public WebElement veterinariansTable = driver.findElement(By.id(Locators.VeterinariansPageLocators.veterinariansTableId));
	
	public List<String> GetVetsNameList()
	{
		java.util.List<String> veterinarianNameList = new ArrayList<String>();
		java.util.List<WebElement> rows = veterinariansTable.findElements(By.xpath(".//tr"));
		int tableRowCount = rows.size();
		for(int i = 1; i<tableRowCount; i++)
		{
			String veterinarianDisplayedName = veterinariansTable.findElement(By.xpath(".//tr[" + i + "]/td[1]")).getText();
			veterinarianNameList.add(veterinarianDisplayedName);
		}
		return veterinarianNameList; 
	}
	

}
