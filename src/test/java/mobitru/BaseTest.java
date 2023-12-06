package mobitru;

import com.epam.jdi.light.mobile.elements.common.AppManager;
import org.testng.annotations.BeforeClass;

import java.io.File;

import static com.epam.jdi.light.mobile.elements.init.PageFactory.initMobile;

public class BaseTest {

    final String FILE_NAME = "src/main/resources/app-debug.apk";

    @BeforeClass(alwaysRun = true)
    public void setup() {
        System.out.println("Start Mobitru app setup");
        initMobile(MobitruApp.class);
        File appFile = new File(FILE_NAME);
        String appFilePath = appFile.getAbsolutePath();
        System.out.println("Mobitru app absolute file path is: " + appFilePath);
        AppManager.installApp(appFilePath);
//        AppManager.launchApp();
    }

}
