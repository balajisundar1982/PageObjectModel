package testcases.login;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LandingPage;

public class LoginTest {
	
	@Test(/*dataProvider="getData"*/)
	public void doLogin(/*String username,String password*/) {
		
		HomePage home = new HomePage();
		LandingPage lp = home.doLogin("balajisundar_1982@yahoo.com", "Tharani1234@");
	
	}

	/*@DataProvider
	public Object[][] getData(){
		
		
	}*/
}
