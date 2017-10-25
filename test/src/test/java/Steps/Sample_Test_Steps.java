package Steps;

import Base.BaseUtils;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;

/**
 * Created by NhatDell on 30-Aug-17.
 */
public class Sample_Test_Steps extends BaseUtils{
    private BaseUtils base;

    public Sample_Test_Steps(BaseUtils base) {
        this.base = base;
    }

    @Given("^I navigate to facebook$")
    public void iNavigateToFacebook() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        base.driver.navigate().to("http://facebook.com");
    }

    @And("^I enter (.*) and (.*) for login$")
    public void iEnterAndForLogin(String user,String pass) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        base.driver.findElement(By.xpath("//input[contains(@data-testid,'royal_email')]")).sendKeys(user);
        base.driver.findElement(By.xpath("//input[contains(@data-testid,'royal_pass')]")).sendKeys(pass);

    }

    @And("^I click Login button$")
    public void iClickLoginButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        base.driver.findElement(By.xpath("//input[@data-testid='royallogin_button']")).click();
    }

    @Then("^I should see Newfeed Page$")
    public void iShouldSeeNewfeedPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(base.driver.getTitle().toString());
    }
}
