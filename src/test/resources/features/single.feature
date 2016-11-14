Feature: Check a flash game - Wrong Block
    User must be to use webdriver
    User must be installed Sikuli for making screens
    You have to install java 1.7 (1.8 not supported)

    Scenario: Check menu for game - Wrong Block
        Given Go to Game Page and click on the game Wrong Block.
        When Click on the link Start Game.
        When Move Open menu and click Start Game.
        When Click on Next Level.
        When Click on Play.
        Then Should see begin game.


