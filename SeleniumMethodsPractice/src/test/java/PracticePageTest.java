import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PracticePageTest extends CommonAPI {

    PracticePage practicePage;

    @BeforeClass
    public void initialize() throws Exception {
        this.practicePage = PageFactory.initElements(this.driver, PracticePage.class);
        this.practicePage.navigateToPracticePage();
        Thread.sleep(3000);
    }

    @Test
    public void testclickAllCarRadioBtns() throws Exception {
        this.practicePage.clickAllCarRadioBtns();
    }

    @Test
    public void testcheckAllCarsCheckbox() throws Exception {
        this.practicePage.checkAllCarsCheckbox();
    }

    @Test
    public void testSelectCars() throws Exception {
        this.practicePage.selectCars();
    }

    @Test
    public void testSelectFruit() throws Exception {
        this.practicePage.selectFruit();
    }

    @Test
    public void testOkAlert() throws Exception {
        this.practicePage.okAlert();
    }

    @Test
    public void testDismissAlert() throws Exception {
        this.practicePage.dismissAlert();
    }

    @Test
    public void testHandleDisplayedElem() throws Exception {
        this.practicePage.handleDisplayedElem();
    }

    @Test
    public void testHandleWindows() throws Exception {
        this.practicePage.handleWindows();
    }

    @Test
    public void testHandleIFrames() throws Exception {
        this.practicePage.handleIFrames();
    }

    @Test
    public void testMouseHovering() throws Exception {
        this.practicePage.mouseHovering();
    }
}
