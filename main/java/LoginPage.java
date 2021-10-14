import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    By username = By.id("email");
    By password = By.id("pass");
    By enter = By.name("login");

    public WebElement username(){
        return driver.findElement(username);
    }

    public WebElement password(){
        return driver.findElement(password);
    }

    public WebElement enter(){
        return driver.findElement(enter);
    }
}
