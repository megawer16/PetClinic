package pages;


public class Locators {

	public static class HomePageLocators
	{
		public static String homeButtonXpath ="//span[text() = 'Home']";
		public static String findOwnersButtonXpath = "//span[text() = 'Find owners']";
		public static String VeterinariansButtonXpath = "//span[text() = 'Veterinarians']";
		public static String homePageImage = "img.img-responsive";
	}

	public static class VeterinariansPageLocators
	{
		public static String veterinariansTableTitleXpath = "//h2[text() = 'Veterinarians']";
		public static String veterinariansTableId = "vets";
	}

	public static class FindOwnersPageLocators
	{
		public static String OwnersTableId = "owners";
		public static String SearchButtonXpath = "//form[@id='search-owner-form']//button[contains(text(), 'Find')]";
		public static String AddButtonXpath = "//a[text() = 'Add Owner']";
	}

	public static class AddOwnersDetails
	{
		public static String FirstNameId = "firstName";
		public static String LastNameId = "lastName";
		public static String AddressId = "address";
		public static String CityId = "city";
		public static String TelephoneId = "telephone";
		public static String SubmitAddNewButtonXpath = "//button[text() = 'Add Owner']";
	}
	public static class ManageOwners
	{
		public static String AddNewPetXpath = "//a[contains(text(), 'New Pet')]";
		public static String OwnersNameXpath = "//table[@class='table table-striped']//td/b";
		public static String OwnersAddressXpath = "//th[text() = 'Address']/parent::*//td";
		public static String OwnersCityXpath = "//th[text() = 'City']/parent::*//td";
		public static String OwnersTelephoneXpath = "//th[text() = 'Telephone']/parent::*//td";
		public static String PetNameXpath = "//table[@class='table table-striped']//dd[1]";
		public static String PetBirthDateXpath = "//table[@class='table table-striped']//dd[2]";
		public static String PetTypeXpath = "//table[@class='table table-striped']//dd[3]";
		public static String fieldName = "";
		public static String OwnersFieldXpath = "//th[text() = '" + fieldName + "']/parent::*//td";
	}
	
	public static class AddPetDetails
	{
		public static String NameTxtBoxId = "name";	
		public static String DateTxtBoxId = "birthDate";
		public static String TypeDrpdID = "type";
		public static String SubmitAddNewButtonXpath = "//button[text() = 'Add Pet']";
	}
}
