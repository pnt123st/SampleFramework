import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {

    @FindBy(className = "login")
    WebElement signInTab;

    @FindBy(xpath = "//a[@title='Contact Us']")
    WebElement contactUsTab;

    @FindBy(id = "search_query_top")
    WebElement searchBox;

    @FindBy(name = "submit_search")
    WebElement searchButton;

    @FindBy(xpath = "//a[@title='Women']")
    WebElement womenTab;

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
