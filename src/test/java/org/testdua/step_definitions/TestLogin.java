package org.testdua.step_definitions;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;
import org.openqa.selenium.WebDriver;
import org.testdua.pages.Login;
import org.testdua.utils.Constants;
import org.testng.Assert;

public class TestLogin {
    WebDriver driver;
    private static ExtentTest extentTest;

    private Login login = new Login();

    public TestLogin(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User go to Web Music Youtube")
    public void user_go_to_web_music_youtube(){
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User go to Web Music Youtube");
        Hooks.delay(1);
    }

    @And("User click sign in button")
    public void user_click_signin_button(){
        Hooks.delay(1);
        login.signIn();
        extentTest.log(LogStatus.PASS, "User click sign in button");
    }

    @And("User input username and password")
    public void user_input_username(){
        Hooks.delay(1);
        login.loginForm("acctestsqa", "testsqajc123");
    }


    @And("User click button login")
    public void user_click_btnLogin(){
        Hooks.delay(1);
        login.clickBtnLogin();
        Hooks.delay(2);
        login.clickBtnAccount();
    }
    @Then("User on dashboard page")
    public void user_on_dashboard_page(){
        System.out.println(login.getTxtAccountValid());
        Assert.assertTrue(login.getTxtAccountValid().contains("testing account"));
    }
}
