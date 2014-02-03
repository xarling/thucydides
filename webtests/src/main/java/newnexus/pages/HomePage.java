package newnexus.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

/**
 * User: xanderarling
 * Date: 01/02/14
 * Time: 16:24
 */
@DefaultUrl("http://iwpangular-codist.rhcloud.com/index.html")
public class HomePage extends PageObject {
    @FindBy(className="navbar-brand")
    private WebElementFacade logo;

    public void clickOnLogo() {
        logo.click();
    }



}
