package info.seleniumcucumber.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import env.DriverUtil;
import info.seleniumcucumber.methods.BaseTest;
import info.seleniumcucumber.pages.PageTest;
import org.openqa.selenium.WebDriver;

public class MenuStepdefinitions implements PageTest {
    protected WebDriver driver = DriverUtil.getDefaultDriver();

    @When("^User in \"([^\"]*)\" page$")
    public String validatePage(String page) throws Exception{
    switch (page.toLowerCase()) {
        case "select menu":
            selectMenuPages.getPropertiesElement();
            selectMenuPages.validateMenuPages();
            break;
        case "book store":
            BaseTest.miscmethodObj.validateLocator("");
            BaseTest.miscmethodObj.validateLocator("");
            BaseTest.miscmethodObj.validateLocator("");
            break;
        default:
            System.out.println("you need to select page");
        break;
        }
        return page;
    }

    @And("^User choose select value \"([^\"]*)\"$")
    public void choosePageOption(String option) throws Exception{
        selectMenuPages.chooseRootOption(option);
    }
}
