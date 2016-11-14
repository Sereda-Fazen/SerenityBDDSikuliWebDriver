package com.browserstack.cucumber.steps;



import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.sikuli.script.FindFailed;


public class LoginSteps extends StepsLogin {

    @Steps
    StepsLogin stepsLogin;

    @Given("Go to Game Page and click on the game Wrong Block.")
    public void homePage() {
        stepsLogin.homePage();
    }

    @When("Click on the link Start Game.")
    public void getClickStartGame() throws FindFailed {
        stepsLogin.startGame();
    }
    @When("Move Open menu and click Start Game.")
    public void getClickOpenMenu() throws FindFailed, InterruptedException {
        stepsLogin.clickOpenMenu();
    }

    @When("Click on Next Level.")
    public void getClickNextLevel() throws FindFailed {
        stepsLogin.clickNextLevel();
    }

    @When("Click on Play.")
    public void getClickPlay() throws FindFailed {
        stepsLogin.clickPlay();
    }
    @Then("Should see begin game.")
    public void getSeeToBeginGame() throws FindFailed {
        stepsLogin.seeToBeginGame();
    }









}
