package mobitru;

import com.epam.jdi.light.mobile.elements.pageobjects.annotations.JApp;
import mobitru.pageobjects.HomePage;
import mobitru.pageobjects.LoginPage;

@JApp(appPackage = "com.epam.mobitru", appActivity = "com.epam.mobitru.MainActivity")
public class MobitruApp {

    public static LoginPage loginPage;
    public static HomePage homePage;

}
