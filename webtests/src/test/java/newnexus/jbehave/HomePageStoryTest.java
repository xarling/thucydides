package newnexus.jbehave;

import net.thucydides.core.annotations.*;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;
import newnexus.steps.GotoMainPageSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

/**
 * User: xanderarling
 * Date: 01/02/14
 * Time: 16:41
 */
@Story(Application.HomePage.GotoHomePageAgain.class)
@RunWith(ThucydidesRunner.class)
public class HomePageStoryTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://iwpangular-codist.rhcloud.com/")
    public Pages pages;

    @Steps
    public GotoMainPageSteps steps;

    @Test
    @WithTag(type="feature", name="Navigational")
    public void goto_home_page_click_on_logo() {
        steps.gotoMainPage();
        steps.clickOnLogo();
        steps.isHomePage();

    }

}
