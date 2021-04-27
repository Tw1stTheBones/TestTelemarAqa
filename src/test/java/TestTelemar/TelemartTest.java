package TestTelemar;

import TestTelemar.Helpers.TestInit;

import TestTelemar.PageObject.TelemartMainPageHelpers;
import TestTelemar.PageObject.TelemartOrderPageHelpers;
import TestTelemar.PageObject.TelemartProductPageHelpers;
import org.junit.Assert;
import org.junit.Test;

import org.openqa.selenium.interactions.Actions;


public class TelemartTest extends TestInit {
    @Test
    public void TelemartTestr() {
        TelemartMainPageHelpers telemart = new TelemartMainPageHelpers(driver);

        telemart.goTo();
        implicitlyWait();
        telemart.close().click();
        waitForElementToBeDisplayed(telemart.topSearchLine());
        telemart.search();
        telemart.product().click();


        TelemartProductPageHelpers telemartPrPage = new TelemartProductPageHelpers(driver);

        telemartPrPage.buyProduct().click();
        telemart.waitForElementToBeClickable(telemartPrPage.orderProduct());
        waitForElementToBeDisplayed(telemartPrPage.orderProduct());
        telemartPrPage.orderProduct().click();


        TelemartOrderPageHelpers telemartOrderPE = new TelemartOrderPageHelpers(driver);

       telemartOrderPE.takeMore().click();
       telemartOrderPE.testLabel().click();
        Assert.assertTrue("checkbox",telemartOrderPE.testipute().isSelected());


        telemart.goTo();
        Actions action = new Actions(driver);
        action.moveToElement(telemart.baskeLabel()).build().perform();
        waitForElementToBeDisplayed(telemart.GoToBasket());
        telemart.basket().click();

        String str1= telemartOrderPE.priceTest();
        String str2 = telemartOrderPE.totalPriceTest();
        boolean i = str1.equals(str2);
        Assert.assertFalse("the price does not match",i);






















    }

}
