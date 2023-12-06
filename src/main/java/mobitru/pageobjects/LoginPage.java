package mobitru.pageobjects;

import com.epam.jdi.light.mobile.elements.common.app.Button;
import com.epam.jdi.light.mobile.elements.common.app.android.TextField;
import com.epam.jdi.light.mobile.elements.pageobjects.annotations.MobileFindBy;

public class LoginPage {

    @MobileFindBy(xpath = "//*[@resource-id='com.epam.mobitru:id/login_email']//android.widget.EditText")
    public static TextField loginTextField;

    @MobileFindBy(xpath = "//*[@resource-id='com.epam.mobitru:id/login_password']//android.widget.EditText")
    public static TextField passwordTextField;

    @MobileFindBy(id = "com.epam.mobitru:id/login_signin")
    public static Button signInButton;}
