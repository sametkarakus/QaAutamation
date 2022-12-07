package org.example.pages;

import dev.failsafe.internal.util.Assert;
import org.example.base.BasePage;
import org.example.base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {

    By CLICK_CLOSE_BUTTON = By.cssSelector(".ins-close-button-c2703");
    By SEARCH_INPUT_AREA = By.cssSelector("#txtSearchBox");
    By CHOOSE_PRODUCT = By.cssSelector("div[class='row header-line-1'] li:nth-child(1)");

    By ADD_TO_CART = By.xpath("//*[@class=\"btn btn-add ng-star-inserted\"]");

    By SEE_CARD = By.cssSelector("#btnShowCart");
    By DONE_TO_SHOPPING = By.cssSelector("button[id='btnGoToShippingAddress'] span[class='ng-star-inserted']");

    By CHECK_TITLE = By.cssSelector(".title-primary.text-center.mb-5");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage loadPage() {
        loadPage("/");
        clickElement(CLICK_CLOSE_BUTTON);
        return this;
    }

    public MainPage searchTextArea() throws InterruptedException {
        sendKey(SEARCH_INPUT_AREA,"kaşık maması");
        Thread.sleep(2000);
        clickElement(CHOOSE_PRODUCT);
        return this;
    }

    public MainPage product() throws InterruptedException {
        clickElement(ADD_TO_CART);
        //Thread.sleep(3000);
        clickElement(SEE_CARD);
        clickElement(DONE_TO_SHOPPING);
        Thread.sleep(3000);
        return this;
    }

    public MainPage checkLoginPage(){
        String e = driver.findElement(CHECK_TITLE).getText();
        Assertions.assertEquals(e,"Üyelik");
        System.out.printf(e, "Üyelik");

        return this;
    }

}
