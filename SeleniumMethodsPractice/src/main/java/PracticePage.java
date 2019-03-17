import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

public class PracticePage extends CommonAPI {

    String practicePageUrl = "https://learn.letskodeit.com/p/practice";

    @FindBy(xpath = "//div[@id='radio-btn-example']//label/input")
    List<WebElement> carRadioBtnList;

    @FindBy(id = "carselect")
    WebElement selectCar;

    @FindBy(xpath = "//select[@id='carselect']/option")
    List<WebElement> carList;

    @FindBy(xpath = "//select[@id='multiple-select-example']/option")
    List<WebElement> selectFruitList;

    @FindBy(id = "multiple-select-example")
    WebElement multSelectFruit;

    @FindBy(xpath = "//div[@id='checkbox-example']//label/input")
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

    // handling radio buttons
    public void clickAllCarRadioBtns() throws Exception {
        for (WebElement element : carRadioBtnList) {
            Thread.sleep(1500);
            element.click();
            Thread.sleep(1500);
        }
    }

    // handling checkbox
    public void checkAllCarsCheckbox() throws Exception {
        for (WebElement element : checkboxCarList) {
            Thread.sleep(1500);
            element.click();
            Thread.sleep(1500);
        }
    }

    // handling select drop down
    public void selectCars() throws Exception {
        Select select = new Select(selectCar);
        for (int i = 0; i < carList.size(); i++) {
            select.selectByIndex(i);
            Thread.sleep(1500);
        }
    }

    // handling multiple selects
    public void selectFruit() throws Exception {
        Select select = new Select(multSelectFruit);
        for (int i = 0; i < selectFruitList.size(); i++) {
            select.selectByIndex(i);
            Thread.sleep(1500);
        }
    }

    // handling alerts
    public void okAlert() throws Exception {
        alertNameBar.sendKeys("OkTest");
        alertBtn.click();
        Thread.sleep(1500);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(1500);
    }

    public void dismissAlert() throws Exception {
        alertNameBar.sendKeys("OkTest");
        confirmBtn.click();
        Thread.sleep(1500);
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
        Thread.sleep(1500);
    }

    // handling visibility of web elements
    public void handleDisplayedElem() throws Exception {
        Thread.sleep(1500);
        if (displayTextBar.isDisplayed()) {
            displayTextBar.sendKeys("test1");
            Thread.sleep(1000);
            hideBtn.click();
        }
        showBtn.click();
        displayTextBar.sendKeys("test2");
        Thread.sleep(1000);
    }

    // handling windows, tabs and iFrames
    public void handleWindows() throws Exception {
        // save the parent handle
        String parentHandle = driver.getWindowHandle();
        openWindowBtn.click();
        Thread.sleep(1500);

        // get all window handles and save them in a set
        Set<String> handles = driver.getWindowHandles();

        // switch to the new window and do whatever action
        for (String handle : handles) {
            if (!handle.equals(parentHandle)) {
                driver.switchTo().window(handle);
                searchBar.sendKeys("python");
                Thread.sleep(1500);
                driver.close();
                break;
            }
        }
        // switch back to the original window
        driver.switchTo().window(parentHandle);
    }

    public void handleIFrames() throws Exception {
        String parentHandle = driver.getWindowHandle();

        driver.switchTo().frame(iFrameEx);
        Thread.sleep(1500);
        searchBar.sendKeys("Java");
        Thread.sleep(1500);

        driver.switchTo().parentFrame();
    }

    // handling mouse hovering
    public void mouseHovering() throws Exception {
        Actions actions = new Actions(driver);
        actions.moveToElement(mouseHoverBtn).perform();
        Thread.sleep(2000);
        actions.moveToElement(topLink).perform();
        Thread.sleep(1500);
        actions.click().build().perform();
    }
}