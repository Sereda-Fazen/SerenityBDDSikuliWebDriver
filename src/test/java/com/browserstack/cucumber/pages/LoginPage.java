package com.browserstack.cucumber.pages;

import com.browserstack.cucumber.utils.DataProperties;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


@DefaultUrl("http://www.best-flash-games.net/")
public class LoginPage extends PageObject {

    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 15000;


    private Pattern wrongBlock;
    private Pattern start;
    private Pattern openMenu;
    private Pattern startGame;
    private Pattern nextLevel;
    private Pattern play;
    private Pattern one;


    public LoginPage (WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);


        wrongBlock = new Pattern(DataProperties.path("wrongBlock.jpg"));
        start = new Pattern(DataProperties.path("start.jpg"));
        openMenu = new Pattern(DataProperties.path("openMenu.jpg"));
        startGame = new Pattern(DataProperties.path("startGame.jpg"));
        nextLevel = new Pattern(DataProperties.path("nextLevel.jpg"));
        play = new Pattern(DataProperties.path("play.jpg"));
        one = new Pattern(DataProperties.path("one.jpg"));
    }

    public void game() throws FindFailed {

        Screen screen = new Screen();
        screen.click(wrongBlock);

    }

    public void startGames() throws FindFailed{
        Screen screen = new Screen();
        screen.wait(start,10);
        screen.click(start);
    }

    public void clickOpenMenu() throws FindFailed, InterruptedException {

        Screen screen = new Screen();
        screen.wait(openMenu, 20);
        screen.mouseMove(openMenu);
        screen.wait(startGame,10);
        screen.click(startGame);
    }


    public void clickNextLevel() throws FindFailed {

        Screen screen = new Screen();
        screen.wait(nextLevel, 10);
        screen.click(nextLevel);
    }
    public void clickPlay() throws FindFailed {

        Screen screen = new Screen();
        screen.wait(play, 10);
        screen.click(play);
    }
    public void seeStartGame() throws FindFailed {

        Screen screen = new Screen();
        screen.wait(one,10);
        screen.wait(one,5);
    }

}
