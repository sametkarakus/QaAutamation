package org.example.runAllTest;

import com.sun.tools.javac.Main;
import org.example.base.BaseTest;
import org.example.pages.MainPage;
import org.junit.jupiter.api.Test;

public class runAllTestSc extends BaseTest {

    @Test
    public void testSc_1() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.loadPage()
                .searchTextArea()
                .product()
                .checkLoginPage();

    }
}
