import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestLoginPage {


    @Test
    public void TestLogin(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\princ\\Downloads\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");

       LoginPage lp = new LoginPage(driver);

        lp.username().sendKeys("prince");
        lp.password().sendKeys("dhiman");
        lp.enter().click();



    }
}
