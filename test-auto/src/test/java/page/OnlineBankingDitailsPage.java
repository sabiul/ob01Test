package selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.By.className;
import static org.openqa.selenium.By.id;


public class OnlineBankingDitailsPage {

    WebDriver driver;

    public OnlineBankingDitailsPage() {
    }

    public OnlineBankingDitailsPage(WebDriver driver) {
        this.driver = driver;
    }
    public OnlineBankingDitailsPage fillEmail(String email) {
        if (driver != null) {

            driver.findElement(id("UserInfo_UserName")).sendKeys(email);
        }else {
            System.out.printf("driver null");
        }

        return  this;
    }

//    public void fillEmail(String email) {
//
//        driver.findElement(id("username")).sendKeys(email);
//
//    }
    public OnlineBankingDitailsPage fillPassword(String pass) {
        driver.findElement(id("primary_secu")).sendKeys(pass);

        return  this;

    }


    public OnlineBankingDitailsPage clickLogin() {
        driver.findElement(className("btn-primary")).click();
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(className("fa-sign-out")));



        return this;
    }

    public OnlineBankingDitailsPage clickLogout() {
        driver.findElement(className("nav-label")).click();



        return this;
    }

}

