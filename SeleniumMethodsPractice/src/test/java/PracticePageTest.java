import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

public class PracticePageTest extends CommonAPI {

    PracticePage practicePage;

    @BeforeClass
    public void initialize() throws Exception {
        this.practicePage = PageFactory.initElements(this.driver, PracticePage.class);
        this.practicePage.navigateToPracticePage();
        Thread.sleep(3000);
    }

}
