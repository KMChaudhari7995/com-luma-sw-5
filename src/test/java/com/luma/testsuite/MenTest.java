package com.luma.testsuite;

import com.luma.customlisteners.CustomListeners;
import com.luma.pages.HomePage;
import com.luma.pages.Men_Page;
import com.luma.pages.ShoppingCartPage;
import com.luma.testBase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class MenTest extends BaseTest {

    HomePage homePage;
    Men_Page menPage;
    ShoppingCartPage shoppingCartPage;

    @BeforeMethod(alwaysRun = true)
    public void inIT(){
       homePage = new HomePage();
       menPage = new Men_Page();
       shoppingCartPage= new ShoppingCartPage();
    }


    @Test(groups = {"smoke","regression"})
    public void userShouldAddProductSuccessfullyToShoppingCart()throws InterruptedException{
        homePage.mouseHoverToElementToMenMenu();
        homePage.mouseHoverToElementBottomsMenu();
        homePage.clickOnPants();
        menPage.mouseHoverOnCronusYogaPant();
        menPage.clickOnSize();
        menPage.clickOnBlackColor();
        Thread.sleep(2000);
        menPage.clickOnAddCart();
        Thread.sleep(2000);
        Assert.assertEquals(menPage.getTextAfterAddtoCart(),"You added Cronus Yoga Pant to your shopping cart.");
        menPage.clickOnShoppingCart();
        Assert.assertEquals(shoppingCartPage.getShoppingCart(),"Shopping Cart");
        Assert.assertEquals(shoppingCartPage.getCronusYogaPant(),"Cronus Yoga Pant");
        Assert.assertEquals(shoppingCartPage.getSize(),"32");
        Assert.assertEquals(shoppingCartPage.getColor(),"Black");

    }

}
