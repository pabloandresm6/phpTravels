package Steps;

import Pages.FilterPage;
import Pages.SearchPage;
import Utils.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Pablo Andres on 07/05/2017.
 */
public class SearchSteps extends BaseUtil
{
    private BaseUtil base;

    private SearchPage searchPage;

    private FilterPage filterPage;

    public SearchSteps(BaseUtil base)
    {
        this.base = base;
    }

    @Given("^Navigate to URL 'http://www.phptravels.net/'$")
    public void navigateToURLHttpWwwPhptravelsNet() throws Throwable
    {
        System.out.println("Navigate to URL 'http://www.phptravels.net/'");
        base.driver.navigate().to("http://www.phptravels.net/");

    }

    @And("^Enter a valid location as ([^\\\"]*)$")
    public void enterAValidLocation(String location) throws Throwable
    {
        System.out.println("Enter a valid <location>: "+location);
        searchPage = new SearchPage(base.driver);
        searchPage.setLocation(location);

    }

    @And("^skip the location field$")
    public void skipTheLocationField() throws Throwable {
        System.out.println("Skip the <location> field");
    }

    @And("^Enter a invalid location as ([^\\\"]*)$")
    public void enterAInvalidLocation(String location) throws Throwable
    {
        System.out.println("Enter a invalid <location>: "+location);
        searchPage = new SearchPage(base.driver);
        searchPage.setLocation(location);
    }


    @And("^Enter a valid check in date as ([^\\\"]*)$")
    public void enterAValidCheckInDate(String checkindate) throws Throwable
    {
        System.out.println("Enter a valid <check in date>: "+checkindate);
        searchPage = new SearchPage(base.driver);
        searchPage.setCheckInDate(checkindate);
    }

    @And("^Enter a valid check out date as ([^\\\"]*)$")
    public void enterAValidCheckOutDate(String checkoutdate) throws Throwable
    {
        System.out.println("Enter a valid <check out date>: "+checkoutdate);
        searchPage = new SearchPage(base.driver);
        searchPage.setCheckOutDate(checkoutdate);
    }

    @And("^Select number of adults as ([^\\\"]*)$")
    public void selectNumberOfAdults(String adults) throws Throwable
    {
        System.out.println("Select number of <adults>: "+adults);
        searchPage = new SearchPage(base.driver);
        searchPage.setAdults(adults);
    }

    @And("^Select number of child as ([^\\\"]*)$")
    public void selectNumberOfChildAsChild(String nchild) throws Throwable
    {
        System.out.println("Select <number of child>: "+nchild);
        searchPage = new SearchPage(base.driver);
        searchPage.setChild(nchild);
    }

    @And("^select age of child as ([^\\\"]*)$")
    public void selectAgeOfChild(String ageofchild) throws Throwable
    {
        System.out.println("Select <age of child>: "+ageofchild);
        searchPage = new SearchPage(base.driver);
        searchPage.setAgeChild(ageofchild);
    }

    @And("^press Done button$")
    public void pressDoneButton() throws Throwable
    {
        System.out.println("press DONE button...");
        searchPage = new SearchPage(base.driver);
        searchPage.modalButtonClickEvent();
    }

    @When("^Press Search button$")
    public void pressSearchButton() throws Throwable
    {
        System.out.println("press SEARCH button...");
        searchPage = new SearchPage(base.driver);
        searchPage.searchClickEvent();
    }

    @Then("^show warning message$")
    public void showWarningMessage() throws Throwable
    {
        System.out.println("Show warning message.");
    }

    @Then("^Select star grade as ([^\\\"]*)$")
    public void selectAStarGrade(String stargrade) throws Throwable
    {
        System.out.println("select a <star grade>: "+stargrade);
        filterPage = new FilterPage(base.driver);
        filterPage.setStarGrade(stargrade);
    }

    @And("^Select price range as ([^\\\"]*)$")
    public void selectAPriceRange(String pricerange) throws Throwable
    {
        System.out.println("select a <price range>: "+pricerange);
        filterPage = new FilterPage(base.driver);
        String [] split = pricerange.split(":");
        filterPage.setSpnPriceRange(split[0],split[1]);
    }

    @When("^Press Search blue button$")
    public void pressSearchBlueButton() throws Throwable
    {
        System.out.println("press SEARCH BLUE button...");
        filterPage = new FilterPage(base.driver);
        filterPage.searchFilterClickEvent();
    }

    @Then("^reload page$")
    public void reloadPage() throws Throwable
    {
        System.out.println("Reload page.");
    }


}
