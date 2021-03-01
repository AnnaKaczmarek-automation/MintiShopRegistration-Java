package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators {
    WebDriver driver;
//ten lokator będzie na basePage
    WebElement personBTN = driver.findElement(By.xpath("//a[@class=\"account_link link hidden-phone\"][@title=\"TWOJE KONTO\"]"));


    WebElement facebookBTN = driver.findElement(By.xpath("//a[@class=\"service_item service_Facebook\"]"));
    WebElement signingFormBTN = driver.findElement(By.xpath("//a[@class=\"btn signin-form_register2\"][@href=\"/client-new.php?register\"]"));
    WebElement firstNameBTN = driver.findElement(By.id("client_firstname"));
    WebElement lastNameBTN = driver.findElement(By.id("client_lastname"));
    WebElement birthDate = driver.findElement(By.id("birth_date"));
    WebElement choosingYear = driver.findElement(By.className("ui-datepicker-year"));
    WebElement year = driver.findElement(By.xpath("//option[@value=\"1988\"]"));
    WebElement month = driver.findElement(By.xpath("//select[@class=\"ui-datepicker-month\"]"));
    WebElement day = driver.findElement(By.xpath("//a[@class=\"ui-state-default\"][text()=\"6\"]"));
    WebElement street = driver.findElement(By.id("client_street"));
    WebElement zipcode = driver.findElement(By.id("client_zipcode"));
    WebElement city= driver.findElement(By.id("client_city"));
    WebElement email = driver.findElement(By.id("client_email"));
    WebElement phoneNumber = driver.findElement(By.id("client_phone"));
    WebElement login = driver.findElement(By.id("client_login"));
    WebElement password = driver.findElement(By.id("client_password"));
    WebElement repeatedPassword = driver.findElement(By.id("repeat_password"));
    WebElement rulesLebel = driver.findElement(By.xpath("//label[@class=\"has-required\"]"));
    WebElement clientSubmitting = driver.findElement(By.id("submit_clientnew_form"));


}
