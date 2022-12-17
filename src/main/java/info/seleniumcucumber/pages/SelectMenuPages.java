package info.seleniumcucumber.pages;

import info.seleniumcucumber.methods.BaseTest;
import info.seleniumcucumber.methods.TestCaseFailed;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class SelectMenuPages implements BaseTest {
    static String currentPath = System.getProperty("user.dir");
    public static Properties prop = new Properties();


    public static Properties getPropertiesElement() {
        try {
            FileInputStream properties = new FileInputStream(currentPath+"/src/main/java/element/menu.properties");
            prop.load(properties);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }

    public static void validateMenuPages () throws TestCaseFailed {
        assertionObj.checkElementPresence("xpath", prop.getProperty("SELECT_MENU"), true);
    }

    public static void chooseRootOption (String optionValue) {
        clickObj.click("xpath", prop.getProperty("SELECT_OPTION"));
//        inputObj.selectOptionFromDropdown("xpath", "xpath",optionValue,prop.getProperty("SELECT_ANOTHER"));
        inputObj.enterText("xpath", optionValue, prop.getProperty("SELECT_OPTION"));
    }

}
