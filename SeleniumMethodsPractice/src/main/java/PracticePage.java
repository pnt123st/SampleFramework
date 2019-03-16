import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PracticePage extends CommonAPI {

    String practicePageUrl = "https://learn.letskodeit.com/p/practice";

    @FindBy(xpath = ".//div[@id='radio-btn-example']//label/input")
    List<WebElement> radioBtnList;

    @FindBy(id = "carselect")
    WebElement selectCar;

    @FindBy(xpath = "//select[@id='multiple-select-example']/option")
    List<WebElement> selectFruitList;

    @FindBy(id = "multiple-select-example")
    WebElement multSelectFruit;

    @FindBy(xpath = ".//div[@id='checkbox-example']//label/input")
    List<WebElement> checkboxCarList;

    @FindBy(id = "openwindow")
    WebElement openWindowBtn;

    @FindBy(id = "search-courses")
    WebElement searchBar;

    @FindBy(id = "opentab")
    WebElement openTabBtn;

    @FindBy(id = "name")
    WebElement alertNameBar;

    @FindBy(id = "alertbtn")
    WebElement alertBtn;

    @FindBy(id = "confirmbtn")
    WebElement confirmBtn;

    @FindBy(id = "hide-textbox")
    WebElement hideBtn;

    @FindBy(id = "show-textbox")
    WebElement showBtn;

    @FindBy(id = "displayed-text")
    WebElement displayTextBar;

    @FindBy(id = "mousehover")
    WebElement mouseHoverBtn;

    @FindBy(xpath = "//a[text()='Top']")
    WebElement topLink;

    @FindBy(id = "courses-iframe")
    WebElement iFrameEx;

    public void navigateToPracticePage() {
        this.driver.navigate().to(this.practicePageUrl);
    }
}