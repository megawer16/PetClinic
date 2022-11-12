package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.AddOwnersDetailsPage;
import pages.AddPetDetailsPage;
import pages.FindOwnersPage;
import pages.HomePage;
import pages.ManageOwnerPage;

public class AddNewOwnerTest extends TestBase {

	@DataProvider(name = "testData")
	public static Object[][] userData()
	{
		return new Object[][]
				{
			{"Mahmoud","Ahmed", "Jeddah", "KSA", "1235458", "dog1", "2022-01-01", "dog"}
				};
	}

	@Test(dataProvider = "testData")
	public void VerifyAddingNewOwnerWithNewPet(String fname, String lname, String address, String city
			, String telephone, String petName, String birthDate, String petType)
	{	
		HomePage homeObject = new HomePage(driver);
		homeObject.NavigateToPage(homeObject.findOwnersButton);

		FindOwnersPage findOwnersObject = new FindOwnersPage(driver);
		findOwnersObject.AddNewOwner();

		AddOwnersDetailsPage addDetailsObject = new AddOwnersDetailsPage(driver);
		addDetailsObject.AddNewOwnerDetails(fname, lname, address, city, telephone);

		ManageOwnerPage manageOwnerObject = new ManageOwnerPage(driver);
		manageOwnerObject.NavigateToAddNewPetPage();

		AddPetDetailsPage addPetObject = new AddPetDetailsPage(driver);
		addPetObject.AddNewPetDetails(petName, birthDate, petType);

		Boolean flag = manageOwnerObject.VerifyOwnersDetails("Name", fname +" "+ lname);
		assertTrue(flag);
		flag = manageOwnerObject.VerifyOwnersDetails("Address", address);
		assertTrue(flag);
		flag = manageOwnerObject.VerifyOwnersDetails("City", city);
		assertTrue(flag);
		flag = manageOwnerObject.VerifyOwnersDetails("Telephone", telephone);
		assertTrue(flag);
		flag = manageOwnerObject.VerifyOwnersDetails("PetName", petName);
		assertTrue(flag);
		flag = manageOwnerObject.VerifyOwnersDetails("PetBirthDate", birthDate);
		assertTrue(flag);
		flag = manageOwnerObject.VerifyOwnersDetails("PetType", petType);
		assertTrue(flag);

	}

}
