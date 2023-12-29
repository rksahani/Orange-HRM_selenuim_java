import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class clickEyeTest extends baseTest{

    @Test
    public void SearchCandidate(){

            new LoginPage(driver).performLogin("Admin", "admin123");

            new RecruitmentPage(driver).clickRecruitment();
            new AddButton(driver).clickAddButton();
            new CandidateDetails(driver).candidateDeatilsInsert("Rakesh","Kumar","Sah","rks123@gmail.com");

        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form")).isDisplayed());
    }

}