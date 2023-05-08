package com.luma.testsuite;

import com.luma.customlisteners.CustomListeners;
import com.luma.pages.HomePage;
import com.luma.pages.Women_Jackets_Page;
import com.luma.testBase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class Women_Jackets_Test extends BaseTest {

    HomePage homePage ;
    Women_Jackets_Page womenPage;

    @BeforeMethod(alwaysRun = true)
    public void InIt(){
        homePage = new HomePage();
        womenPage = new Women_Jackets_Page();
    }
    @Test(groups = {"sanity","regression"})
    public void verifyTheSortByProductNameFilter()throws InterruptedException
    {
        Thread.sleep(2000);
        homePage.mouseHoverToElementToWomenMenu();
        homePage.mouseHoverToElementToTopMenu();
        homePage.clickOnJacket();
        womenPage.selectProductNameFilter("Product Name");
        Assert.assertEquals(womenPage.getProductsDisplay1(),womenPage.getProductsDisplay2());
    }

    @Test(groups = {"smoke","regression"})
    public void verifyTheSortByPriceFilter()throws InterruptedException{
        Thread.sleep(2000);
        homePage.mouseHoverToElementToWomenMenu();
        homePage.mouseHoverToElementToTopMenu();
        homePage.clickOnJacket();
        womenPage.selectProductNameFilter("Price");
        Assert.assertEquals(womenPage.getProductsPriceDisplay1(),womenPage.getProductsPriceDisplay2());
    }


}

