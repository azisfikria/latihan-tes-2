package org.testdua.step_definitions;

import com.relevantcodes.extentreports.ExtentTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testdua.pages.Login;
import org.testdua.pages.Search;

public class TestSearch {
    WebDriver driver;
    private static ExtentTest extentTest;

    private Login login = new Login();
    private Search search = new Search();

    public TestSearch(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }



}
