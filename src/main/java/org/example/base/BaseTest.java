package org.example.base;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.example.factory.DriverManager;
public class BaseTest {

    protected WebDriver driver;

    @BeforeEach
    public void initializeDriver() {
        driver = new DriverManager().initializeDriver();
    }

//    @AfterEach
//    public void quitDriver() {
//        driver.quit();
//    }

}
