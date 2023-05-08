package com.luma.pages;

import com.aventstack.extentreports.Status;
import com.luma.customlisteners.CustomListeners;
import com.luma.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShoppingCartPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement shoppingCart;
    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement cronusYogaPant;
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement size;

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement color;

    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Overnight Duffle']")
    WebElement overNightDuffleTextProduct;

    @CacheLookup
    @FindBy(css = ".input-text.qty")
    WebElement QTYText;

    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']")
    WebElement productPrice;

    @CacheLookup
    @FindBy(css = ".input-text.qty")
    WebElement QTY;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Update Shopping Cart']")
    WebElement updateShoppingCart;

    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']")
    WebElement updateProductPrice;

  /*  By shoppingCart = By.xpath("//span[@class='base']");
    By cronusYogaPant = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
    By size = By.xpath("//dd[contains(text(),'32')]");
    By color = By.xpath("//dd[contains(text(),'Black')]");

    By overNightDuffleTextProduct = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");

    By QTYText = By.cssSelector(".input-text.qty");
    By productPrice =By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']");

    By QTY = By.cssSelector(".input-text.qty");
    By updateShoppingCart = By.xpath("//span[normalize-space()='Update Shopping Cart']");

    By updateProductPrice =By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']");
*/

    public String getShoppingCart(){
        CustomListeners.test.log(Status.PASS,"verify shoppingCart text"+shoppingCart);
        Reporter.log("verify shoppingCart text"+shoppingCart.toString());
        return getTextFromElement(shoppingCart);
    }
    public String getCronusYogaPant(){
        CustomListeners.test.log(Status.PASS,"verify CronusYogaPant text"+cronusYogaPant);
        Reporter.log("verify Cronus Yoga Pant text"+cronusYogaPant.toString());
        return getTextFromElement(cronusYogaPant);

    }
    public String getSize(){
        CustomListeners.test.log(Status.PASS,"verify size text"+size);
        Reporter.log("verify size text"+size.toString());
        return getTextFromElement(size);

    }
    public String getColor(){
        CustomListeners.test.log(Status.PASS,"verify color text"+color);
        Reporter.log("verify color text"+color.toString());
        return getTextFromElement(color);

    }

    public String getOverNightDuffle(){
        CustomListeners.test.log(Status.PASS,"verify overnightduffle text"+overNightDuffleTextProduct);
        Reporter.log("verify overnightDuffle text"+overNightDuffleTextProduct.toString());
        return getTextFromElement(overNightDuffleTextProduct);
    }

    public String getQTYText(){
        CustomListeners.test.log(Status.PASS,"verify qyt text"+QTYText);
        Reporter.log("verify qty text"+QTYText.toString());
        String q = QTYText.getAttribute("value");
        return q;
    }

    public String getProductPrice(){
        CustomListeners.test.log(Status.PASS,"Verify product price "+productPrice);
        Reporter.log("Verify Product Price"+productPrice.toString());
        return getTextFromElement(productPrice);
    }

    public void changeQTYOfOverNightDuffle(String newQTY){
        CustomListeners.test.log(Status.PASS,"changeQTYOverNightDuffle"+QTY);
        Reporter.log("changeQTYOverNightDuffle"+QTY.toString());
        QTY.clear();
        sendTextToElement(QTY,newQTY);

    }

    public void clickOnUpdateShoppingCart(){
        CustomListeners.test.log(Status.PASS,"mouseHoverAndClickOnShoppingCart"+updateShoppingCart);
        Reporter.log("mouseHoverAndClickShoppingCart"+updateShoppingCart.toString());
        clickOnElement(updateShoppingCart);

    }



    public String getUpdateProductPrice(){
        CustomListeners.test.log(Status.PASS,"mouseHoverAndClickOnAddToCart"+updateProductPrice);
        Reporter.log("mouseHoverAndClickAddToCart"+updateProductPrice.toString());
        return getTextFromElement(updateProductPrice);
    }



}
