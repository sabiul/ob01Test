package selenium.setting;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlineBankingBrowserSetting {
    static public WebDriver driver = null;
    @BeforeClass
    public static void runChrome() {
        String service = "E:\\work\\UnionBankLimitedTest\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://192.168.1.152:8091/");
       // driver.get("http://192.168.1.152:8090/Home/Index");

    }
}
