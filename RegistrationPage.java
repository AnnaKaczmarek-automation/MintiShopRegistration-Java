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

public class RegistrationPage {
    private WebDriver driver;
    private By facebookBTN = By.xpath("//a[@class=\"service_item service_Facebook\"]");
    private By signingFormBTN = By.xpath("//a[@class=\"btn signin-form_register2\"][@href=\"/client-new.php?register\"]");

    public RegistrationPage (WebDriver driver){
        this.driver = driver;
    }
     public void facebookScrolling() {

         JavascriptExecutor js = (JavascriptExecutor) driver;
         WebElement Element = driver.findElement(facebookBTN);
         js.executeScript("arguments[0].scrollIntoView();", Element);

         //driver.findElement(By.className("signin-form_box_sub"));
        }

     public void signingForm() throws InterruptedException {
         driver.findElement(signingFormBTN).click();
         Thread.sleep(500);
        }

    }

