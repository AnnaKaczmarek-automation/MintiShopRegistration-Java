package pages;
import net.bytebuddy.utility.RandomString;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;



// Jest opcja,żeby tak to zrobić.najpierw wszystkie lokatory
// dla strony a potem wypisujemy już metody w których powołujemy się na na dane lokatory


public class RegistrationForm {
    private WebDriver driver;

    private By firstNameBTN  = By.id("client_firstname");
    private By lastNameBTN = By.id("client_lastname");
    private By birthDate  = By.id("birth_date");
    private By choosingYear = By.className("ui-datepicker-year");
    private By year = By.xpath("//option[@value=\"1988\"]");
    private By month = By.xpath("//select[@class=\"ui-datepicker-month\"]");
    private By day = By.xpath("//a[@class=\"ui-state-default\"][text()=\"6\"]");
    private By street = By.id("client_street");
    private By zipcode = By.id("client_zipcode");
    private By city= By.id("client_city");
    private By email = By.id("client_email");
    private By phoneNumber = By.id("client_phone");
    private By login = By.id("client_login");
    private By password = By.id("client_password");
    private By repeatedPassword = By.id("repeat_password");
    private By rulesLebel = By.xpath("//label[@class=\"has-required\"]");
    private By clientSubmitting = By.id("submit_clientnew_form");

    public RegistrationForm (WebDriver driver){
        this.driver = driver;
        //Assert.assertEquals(driver.findElement(header).getText(), "Register");
    }

//    //Locators l = new Locators(driver);
//    Locators l = new Locators();

//    ProductCanvas pc = new ProductCanvas(driver);
//    int count = pc.getPrices().size();
//      System.out.println(count);


    public void nameFilling() throws InterruptedException {
        String random = RandomString.make(10);
        driver.findElement(firstNameBTN).sendKeys("Karolina" + random);
        Thread.sleep(500);
        }

    public void lastNameFilling(){
        String random = RandomString.make(10);
        driver.findElement(lastNameBTN).sendKeys("Walczak"+ random);
        }


    public void birthDate() {
        driver.findElement(birthDate).click();
        driver.findElement(choosingYear).click();
        driver.findElement(year).click();
        driver.findElement(month).click();
        //driver.findElement(By.xpath("//option[@value=\"5\"]")).click();
        driver.findElement(day).click();
        }

    public void clientAdress(){
        //String random = RandomString.make(10);
        driver.findElement(street).sendKeys("Opolska 5");

        driver.findElement(zipcode).sendKeys("42-300");

        driver.findElement(city).sendKeys("Kraków");

        }

    public void contactInformations(){
        driver.findElement(email).sendKeys("oto@gmail.com");

        driver.findElement(phoneNumber).sendKeys("552876032");

        }

    public void loginData(){

        driver.findElement(login).sendKeys("lpkk007");
        driver.findElement(password).sendKeys("123456789");
        driver.findElement(repeatedPassword).sendKeys("123456789");

        }

    public void rulesLabel() throws InterruptedException {
        driver.findElement(rulesLebel).click();
        Thread.sleep(500);
        }

    public void newClientSubmitting() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement Element1 = driver.findElement(By.id("client_phone"));
        js.executeScript("arguments[0].scrollIntoView();", Element1);
        driver.findElement(clientSubmitting).click();
        Thread.sleep(1500);
        }

//    public void alertPopUp(){
//        WebDriverWait wait = new WebDriverWait(driver, 60);
//        wait.until(ExpectedConditions.alertIsPresent());
//        }




    }

