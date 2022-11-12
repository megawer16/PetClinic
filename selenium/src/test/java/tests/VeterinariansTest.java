package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.VeterinariansPage;

public class VeterinariansTest extends TestBase {
	
	@Test
	public void  FindAllTheVeterinariansWhichAreAdded()
	{
		HomePage homeObject = new HomePage(driver);
		homeObject.NavigateToPage(homeObject.veterinariansButton);
		VeterinariansPage veterinarianObject = new VeterinariansPage(driver);
		java.util.List<String> veterinarianNameList = veterinarianObject.GetVetsNameList();
		System.out.println(veterinarianNameList);
	}

}
