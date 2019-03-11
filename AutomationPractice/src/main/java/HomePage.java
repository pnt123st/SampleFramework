import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {

    @FindBy(className = "login")
    private WebElement signInTab;

    @FindBy(xpath = "//a[@title='Contact Us']")
    private WebElement contactUsTab;

    @FindBy(id = "search_query_top")
    private WebElement searchBox;

    @FindBy(name = "submit_search")
    private WebElement searchButton;

    @FindBy(xpath = "//a[@title='Women']")
    private WebElement womenTab;

    public void clickOnSignInTab() {
        this.signInTab.click();
    }

    public void clickOnContactUsTab() {
        this.contactUsTab.click();
    }

    public void searchFor(String text) {
        this.searchBox.sendKeys(text);
        this.searchButton.click();
    }

    public void navigateToWomenTab() {
        this.womenTab.click();
    }
}
