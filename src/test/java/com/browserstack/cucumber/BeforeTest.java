package com.browserstack.cucumber;

import com.browserstack.cucumber.utils.DataProperties;
import net.thucydides.core.annotations.Managed;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.io.IOException;


public class BeforeTest {


    @Managed(driver = "chrome")

    public WebDriver driver;
    public String ChromePath = DataProperties.get("chromedriver.exe");

    @Before
    public void myTest() throws Exception {

        System.setProperty("webdriver.chrome.driver", ChromePath);

    }
    @After
    public void close() throws IOException {
        driver.close();
    }
}

