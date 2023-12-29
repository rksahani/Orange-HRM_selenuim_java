import org.testng.Assert;
import org.testng.annotations.Test;

public class candidateDetailsTest extends baseTest
{

    @Test
    public void addingCandidateDetails()
    {
        new LoginPage(driver).performLogin("Admin", "admin123");

        new RecruitmentPage(driver).clickRecruitment();
        new AddButton(driver).clickAddButton();
        new CandidateDetails(driver).candidateDeatilsInsert("Rakesh","Kumar","Sah","rks123@gmail.com");
    }
}
