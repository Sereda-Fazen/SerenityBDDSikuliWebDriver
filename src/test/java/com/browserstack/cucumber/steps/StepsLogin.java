package com.browserstack.cucumber.steps;


import com.browserstack.cucumber.pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.sikuli.script.FindFailed;


public class StepsLogin extends ScenarioSteps {
    LoginPage loginPage;

    @Step()
    public void homePage(){
        loginPage.open();

    }

    @Step()
    public void startGame() throws FindFailed {
        loginPage.game();
        loginPage.startGames();
    }
    @Step()
    public void clickOpenMenu() throws FindFailed, InterruptedException {

        loginPage.clickOpenMenu();
    }
    @Step()
    public void clickNextLevel() throws FindFailed {
        loginPage.clickNextLevel();
    }

    @Step()
    public void clickPlay() throws FindFailed {
        loginPage.clickPlay();
    }

    @Step()
    public void seeToBeginGame() throws FindFailed {
        loginPage.seeStartGame();
    }



}
