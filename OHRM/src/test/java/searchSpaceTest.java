import org.testng.annotations.Test;

public class searchSpaceTest extends baseTest
{

    @Test
    public void Search()
    {
        new LoginPage(driver).performLogin("Admin", "admin123");

        new RecruitmentPage(driver).clickRecruitment();
        new AddButton(driver).clickAddButton();
        new CandidateDetails(driver).candidateDeatilsInsert("Rakesh","Kumar","Sah","rks123@gmail.com");
        new RecruitmentPage(driver).clickRecruitment();
        new SearchSpace(driver).SearchCandidate("Rakesh Kumar Sah");

// There is a bug in OrangeHRM site at the search side.
// When we enter name manually we get 'invalid' message but only get searched if we select the name from given suggested name.
    }
}