package mobitru.pageobjects;

import com.epam.jdi.light.mobile.elements.common.app.android.TextField;
import com.epam.jdi.light.mobile.elements.pageobjects.annotations.MobileFindBy;

public class HomePage {

    @MobileFindBy(id = "com.epam.mobitru:id/category")
    public static TextField categoryHeader;

}
