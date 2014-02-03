package newnexus.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import newnexus.pages.HomePage;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;


/**
 * User: xanderarling
 * Date: 01/02/14
 * Time: 16:28
 */
public class GotoMainPageSteps extends ScenarioSteps {
    private static final String title = "Inwerk AngularJS";

    @Step
    public void gotoMainPage() {
        onHomePage().open();
    }

    @Step
    public void clickOnLogo() {
        onHomePage().clickOnLogo();
    }

    public void isHomePage() {
        assertThat(onHomePage().getTitle(), is(title));
    }


    private HomePage onHomePage() {
        return getPages().currentPageAt(HomePage.class);
    }
}
