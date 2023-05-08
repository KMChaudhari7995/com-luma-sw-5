package com.luma.testsuite;

import com.luma.customlisteners.CustomListeners;
import com.luma.pages.GearPage;
import com.luma.pages.HomePage;
import com.luma.pages.OvernightDuffle_Page;
import com.luma.pages.ShoppingCartPage;
import com.luma.testBase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class GearTest extends BaseTest {


    HomePage homePage;

    GearPage gearPage;
    OvernightDuffle_Page overNightDufflePage;

    ShoppingCartPage shoppingCartPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage= new HomePage();
       gearPage= new GearPage();
       overNightDufflePage = new OvernightDuffle_Page();
       shoppingCartPage= new ShoppingCartPage();
    }

    @Test(groups = {"sanity","regression"})
    public void userShouldAddProductSuccessfullyToShoppingCart()throws InterruptedException{
        Thread.sleep(2000);
        homePage.mouseHoverToGearMenu();
        homePage.clickOnBags();
        gearPage.clickOnProductGear();
        Assert.assertEquals(overNightDufflePage.getTextOvernightDuffle(),"Overnight Duffle");
        overNightDufflePage.changeQTY("3");
        overNightDufflePage.clickOnAddToCart();
        Assert.assertEquals(overNightDufflePage.getAddToCart(),"You added Overnight Duffle to your shopping cart.");
        overNightDufflePage.clickOnShoppingCart();
        Assert.assertEquals(shoppingCartPage.getOverNightDuffle(),"Overnight Duffle");
        Assert.assertEquals(shoppingCartPage.getQTYText(),"3");
        Assert.assertEquals(shoppingCartPage.getProductPrice(),"$135.00");
        shoppingCartPage.changeQTYOfOverNightDuffle("5");
        shoppingCartPage.clickOnUpdateShoppingCart();
        Assert.assertEquals(shoppingCartPage.getUpdateProductPrice(),"$225.00");



    }


}
