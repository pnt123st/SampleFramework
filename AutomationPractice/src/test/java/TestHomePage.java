import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {

    String homepageUrl = "http://automationpractice.com/index.php";

    /**
     * Will navigate to the url before running all tests
     */
    @BeforeClass
    public void initialize() {
        this.driver.navigate().to(this.homepageUrl);
    }

    @Test
    public void testUserCanNavigateToHomePage(){
        String homepageTitle = "My Store";
        Assert.assertEquals(this.driver.getTitle(), homepageTitle);
    }

    @Test
    public void testUserCanNavigateToTheSignInPage() {
        HomePage homePage = PageFactory.initElements(this.driver, HomePage.class);
        homePage.clickOnSignInTab();
        String signInPageUrl =
                "http://automationpractice.com/index.php?controller=authentication&back=my-account";
        Assert.assertEquals(this.driver.getCurrentUrl(), signInPageUrl);
    }

    @Test
    public void testUserCanSearchForDresses() {
        HomePage homePage = PageFactory.initElements(this.driver, HomePage.class);
        homePage.searchFor("dresses");
    }


}
