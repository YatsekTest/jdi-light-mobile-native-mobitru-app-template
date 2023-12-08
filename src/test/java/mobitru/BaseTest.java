package mobitru;

import com.epam.jdi.light.mobile.elements.common.AppManager;
import org.testng.annotations.BeforeClass;

import java.io.File;

import static com.epam.jdi.light.mobile.elements.init.PageFactory.initMobile;

public class BaseTest {

    private static final String FILE_NAME = "src/main/resources/app-debug.apk";
    protected static final String VALID_LOGIN = "testuser@mobitru.com";
    protected static final String VALID_PASSWORD = "password1";

    @BeforeClass(alwaysRun = true)
    public void setup() {
        System.out.println("Start Mobitru app setup");
        initMobile(MobitruApp.class);
//        File appFile = new File(FILE_NAME);
//        String appFilePath = appFile.getAbsolutePath();
//        System.out.println("Mobitru app absolute file path is: " + appFilePath);
//        AppManager.installApp(appFilePath);
//        AppManager.launchApp();
    }

}
