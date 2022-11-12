package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.HomePage;

public class ImageTestCase extends TestBase {

	@Test
	public void VerifyImageOnHomePage()
	{	
		HomePage homeObject = new HomePage(driver);
		Boolean flag = homeObject.IsImageDisplayed();
		assertTrue(flag);
	}

}
