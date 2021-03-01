package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class BasePage {
    private WebDriver driver;
    private By personBTN = By.xpath("//a[@class=\"account_link link hidden-phone\"][@title=\"TWOJE KONTO\"]");

    public BasePage(WebDriver driver) {
        this.driver = driver;
        //Assert.assertEquals(driver.findElement(header).getText(), "Register");
    }

    public RegistrationPage goToRegisterPage () {
        driver.findElement(personBTN).click();
        return new RegistrationPage (driver);

        }



    }

