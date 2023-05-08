package com.luma.pages;

import com.aventstack.extentreports.Status;
import com.luma.customlisteners.CustomListeners;
import com.luma.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class Men_Page extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
    WebElement cronusYogaPant;

    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-opt-880']//div[@id='option-label-size-143-item-175']")
    WebElement size;

    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']")
    WebElement color;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/button[1]/span[1]")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement addToCartText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCart;

    public void mouseHoverOnCronusYogaPant(){
        CustomListeners.test.log(Status.PASS,"mouseHoverONCronusPants"+cronusYogaPant);
        Reporter.log("mouseHoverOnCronusYogaPants"+cronusYogaPant.toString());
        mouseHoverToElement(cronusYogaPant);

    }

    public void clickOnSize(){
        CustomListeners.test.log(Status.PASS,"mouseHoverAndClickOnSize"+size);
        Reporter.log("mouseHoverAndClickOnSize"+size.toString());
        mouseHoverToElementAndClick(size);

    }

    public void clickOnBlackColor()
    {
        CustomListeners.test.log(Status.PASS,"mouseHoverAndClickOnBlackColor"+color);
        Reporter.log("mouseHoverAndClickOnBlackColor"+color.toString());
        mouseHoverToElementAndClick(color);

    }

    public void clickOnAddCart()
    {
        CustomListeners.test.log(Status.PASS,"mouseHoverAndClick"+addToCart);
        Reporter.log("mouseHoverAndClick"+addToCart.toString());
        mouseHoverToElementAndClick(addToCart);

    }

    public String getTextAfterAddtoCart()
    {
        Reporter.log("mouseHoverOnWomenMenu"+addToCartText.toString());
        CustomListeners.test.log(Status.PASS,"verify That message is displayed onPage"+addToCartText);
        return getTextFromElement(addToCartText);

    }

    public void clickOnShoppingCart(){
        CustomListeners.test.log(Status.PASS,"clickOnShoppingCart"+shoppingCart);
        Reporter.log("mouseHoverOnWomenMenu"+shoppingCart.toString());
        clickOnElement(shoppingCart);

    }
}


