package tests;

import org.testng.annotations.Test;

import pages.FindOwnersPage;
import pages.HomePage;

public class FindOwnersTest extends TestBase {
	
	@Test
	public void  FindAllTheVeterinariansWhichAreAdded()
	{
		HomePage homeObject = new HomePage(driver);
		homeObject.NavigateToPage(homeObject.findOwnersButton);
		FindOwnersPage findOwnersObject = new FindOwnersPage(driver);
		findOwnersObject.SearchOwners();
		java.util.List<String> ownersNameList = findOwnersObject.GetOwnersNameList();
		System.out.println(ownersNameList);
	}

}
