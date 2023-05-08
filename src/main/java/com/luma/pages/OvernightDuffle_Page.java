package com.luma.pages;

import com.aventstack.extentreports.Status;
import com.luma.customlisteners.CustomListeners;
import com.luma.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class OvernightDuffle_Page extends Utility{

    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement overnightDuffleText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement QTY;

    @CacheLookup
    @FindBy(xpath = "//button[@id='product-addtocart-button']")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement addToCartText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCart;

    public String getTextOvernightDuffle() {
        CustomListeners.test.log(Status.PASS,"verify message that product is displayed"+overnightDuffleText);
        Reporter.log("verify message that product is displayed"+overnightDuffleText.toString());
        return getTextFromElement(overnightDuffleText);
    }

    public void changeQTY(String updateQTY) {
        CustomListeners.test.log(Status.PASS,"changeQTY"+QTY);
        Reporter.log("Change QTY"+QTY.toString());
        QTY.clear();
        sendTextToElement(QTY,updateQTY);

    }

    public void clickOnAddToCart() {
        CustomListeners.test.log(Status.PASS,"mouseHoverAndClickOnAddToCart"+addToCart);
        Reporter.log("mouseHoverAndClickAddToCart"+addToCart.toString());
        clickOnElement(addToCart);

    }
    public String getAddToCart() {
        CustomListeners.test.log(Status.PASS,"verify message that product is displayed"+addToCartText);
        Reporter.log("mouseHoverAndClick"+addToCartText.toString());
        return getTextFromElement(addToCartText);
    }

    public void clickOnShoppingCart(){
        CustomListeners.test.log(Status.PASS,"mouseHoverAndClickShoppingCart"+shoppingCart);
        Reporter.log("mouseHoverAndClickShoppingCart"+shoppingCart.toString());
        clickOnElement(shoppingCart);

    }
}


