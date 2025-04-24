package week2.Day4.W2D4Assignments;

public class LoginTestData extends TestData{
	
	public void enterUsername() {
		System.out.println("Please enter the Username");
	}
	
	public void enterPassword() {
		System.out.println("Please enter the Password");
	}

	public static void main(String[] args) {
		LoginTestData ltd = new LoginTestData();
		ltd.enterUsername();
		ltd.enterPassword();
		ltd.enterCredentials();
		ltd.navigateToHomePage();

	}

}
