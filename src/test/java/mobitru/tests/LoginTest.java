package mobitru.tests;

import mobitru.BaseTest;
import mobitru.pageobjects.HomePage;
import mobitru.pageobjects.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {
        System.out.println("Login test start");
        LoginPage.loginTextField.sendKeys(VALID_LOGIN);
        LoginPage.passwordTextField.sendKeys(VALID_PASSWORD);
        LoginPage.signInButton.is().displayed();
        LoginPage.signInButton.click();
        HomePage.categoryHeader.is().displayed();
        HomePage.categoryHeader.has().text("Mobile phones (12)");
    }

}
