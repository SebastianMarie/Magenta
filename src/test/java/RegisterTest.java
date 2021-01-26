import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test");
        driver.get("HomePage");
        driver.get("Account");
        driver.get("Register");

    }

}
