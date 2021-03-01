package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.RegistrationForm;
import pages.RegistrationPage;

import java.util.concurrent.TimeUnit;

public class RegistrationTest {
    public WebDriver driver;
    public RegistrationPage registrationPage;
    public BasePage basePage;
    public RegistrationForm registrationForm;

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "src/test/java/data/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://mintishop.pl/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        driver.quit();
    }

    @Test
    public  void mainTest() throws InterruptedException {
        basePage = new BasePage(driver);
        basePage.goToRegisterPage();
        registrationPage = new RegistrationPage(driver);
        registrationPage.facebookScrolling();
        registrationPage.signingForm();
        registrationForm = new RegistrationForm(driver);
        registrationForm.nameFilling();
        registrationForm.lastNameFilling();
        registrationForm.birthDate();
        registrationForm.clientAdress();
        registrationForm.contactInformations();
        registrationForm.loginData();
        registrationForm.rulesLabel();
        registrationForm.newClientSubmitting();
        //registrationForm.alertPopUp();



    }

}
