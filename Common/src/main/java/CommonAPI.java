import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

/**
 * Change the property of the chrome driver!
 * Not everyone will share the same property as me.
 */
public class CommonAPI {

    public static  WebDriver driver = null;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "../common/driver/chromedriver");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterClass(alwaysRun = true)
    public void cleanUp() {
        this.driver.quit();
    }

}