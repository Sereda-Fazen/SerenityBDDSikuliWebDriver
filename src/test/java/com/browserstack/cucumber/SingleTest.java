package com.browserstack.cucumber;



import com.browserstack.cucumber.steps.LoginSteps;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/single.feature")
public class SingleTest extends BeforeTest {

    @Steps
    LoginSteps login;

    @WithTag("Sikuli")
    @Test
    public void loginSuccess() throws Throwable {
        login.homePage();

    }
}
