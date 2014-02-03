package newnexus.jbehave;

import net.thucydides.core.annotations.Steps;
import newnexus.steps.GotoMainPageSteps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class DefinitionSteps {

    @Steps
    GotoMainPageSteps mainPage;

    @Given("the user is on the main page")
    public void givenTheUserIsOnTheWikionaryHomePage() {
        mainPage.gotoMainPage();
    }

    @When("the user clicks on the logo")
    public void whenTheUserLooksUpTheDefinitionOf(String word) {
        mainPage.clickOnLogo();
    }

    @Then("the user should see the same page again")
    public void thenTheyShouldSeeADefinitionContainingTheWords(String definition) {
        mainPage.isHomePage();
    }

}
