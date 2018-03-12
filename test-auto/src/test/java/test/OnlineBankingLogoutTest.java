package selenium.test;

import org.junit.BeforeClass;
import selenium.page.OnlineBankingDitailsPage;
import selenium.setting.OnlineBankingBrowserSetting;

public class OnlineBankingLogoutTest {




    @BeforeClass
    public static void loginTestShouldBeSuccess() {


        OnlineBankingBrowserSetting OnlineBankingBrowserSetting = new OnlineBankingBrowserSetting();

        OnlineBankingBrowserSetting.runChrome();
        OnlineBankingDitailsPage unionBankDitailsPage = new OnlineBankingDitailsPage(OnlineBankingBrowserSetting.driver);

        unionBankDitailsPage.fillEmail("fahmida")
                .fillPassword("F$2R.h8v")
                .clickLogin()
                .clickLogout();

    }
    public static void main(String avgs[]){
        OnlineBankingLogingTest onlineBankingLogingTest =new OnlineBankingLogingTest();
        onlineBankingLogingTest.loginTestShouldBeSuccess();
    }
}
