import org.testng.annotations.Test;

public class EditCandidateTest extends baseTest {

    @Test
    public void editCandidateDetails(){
        new LoginPage(driver).performLogin("Admin", "admin123");

        new RecruitmentPage(driver).clickRecruitment();
        new AddButton(driver).clickAddButton();
        new CandidateDetails(driver).candidateDeatilsInsert("Rakesh","Kumar","Sah","rks123@gmail.com");
        new EditCandidatePage(driver).editCandidate();
    }
}