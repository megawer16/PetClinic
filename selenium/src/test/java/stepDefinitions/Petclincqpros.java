package stepDefinitions;

import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddOwnersDetailsPage;
import pages.AddPetDetailsPage;
import pages.HomePage;
import pages.ManageOwnerPage;
import tests.TestBase;

public class Petclincqpros extends TestBase {

	@Given("I navigate to Pet Clinic")
	public void INavigateToPetClinic()
	{
		HomePage homeObject = new HomePage(driver);
		homeObject.NavigateToPage(homeObject.findOwnersButton);

		/*FindOwnersPage findOwnersObject = new FindOwnersPage(driver);
		findOwnersObject.AddNewOwner();

		AddOwnersDetailsPage addDetailsObject = new AddOwnersDetailsPage(driver);
		addDetailsObject.AddNewOwnerDetails(fname, lname, address, city, telephone);

		ManageOwnerPage manageOwnerObject = new ManageOwnerPage(driver);
		manageOwnerObject.NavigateToAddNewPetPage();

		AddPetDetailsPage addPetObject = new AddPetDetailsPage(driver);
		addPetObject.AddNewPetDetails(petName, birthDate, petType);
	}*/
	}
	@When("I navigate to find owners page")
	public void INavigateToFindOwnersPage()
	{
		HomePage homeObject = new HomePage(driver);
		homeObject.NavigateToPage(homeObject.findOwnersButton);
	}
	@When("I add new owner")
	public void IAddNewOwner()
	{
		AddOwnersDetailsPage addDetailsObject = new AddOwnersDetailsPage(driver);
		addDetailsObject.AddNewOwnerDetails("Carlos", "Dennis", "New", "Old", "1234568");
	}
	@When("I add new pet to the new owner")
	public void addNewPet()
	{
		ManageOwnerPage manageOwnerObject = new ManageOwnerPage(driver);
		manageOwnerObject.NavigateToAddNewPetPage();

		AddPetDetailsPage addPetObject = new AddPetDetailsPage(driver);
		addPetObject.AddNewPetDetails("dog2", "2015-05-05", "dog");
	}
	@Then("I verify all the information add is correct")
	public void IVerifyAllTheInformationAddIsCorrect()
	{
		ManageOwnerPage manageOwnerObject = new ManageOwnerPage(driver);
		Boolean flag = manageOwnerObject.VerifyOwnersDetails("Name", "Carlos" +" "+ "Dennis");
		assertTrue(flag);
		flag = manageOwnerObject.VerifyOwnersDetails("Address", "New");
		assertTrue(flag);
		flag = manageOwnerObject.VerifyOwnersDetails("City", "Old");
		assertTrue(flag);
		flag = manageOwnerObject.VerifyOwnersDetails("Telephone", "1234568");
		assertTrue(flag);
		flag = manageOwnerObject.VerifyOwnersDetails("PetName", "dog2");
		assertTrue(flag);
		flag = manageOwnerObject.VerifyOwnersDetails("PetBirthDate", "2015-05-05");
		assertTrue(flag);
		flag = manageOwnerObject.VerifyOwnersDetails("PetType", "dog");
		assertTrue(flag);
	}
}
