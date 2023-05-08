package com.luma.pages;

import com.aventstack.extentreports.Status;
import com.luma.customlisteners.CustomListeners;
import com.luma.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-4']//span[contains(text(),'Women')]")
    WebElement womenMenu;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-9']")
    WebElement topMenu;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-11']//span[contains(text(),'Jackets')]")
    WebElement jacket;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-5']")
    WebElement menMenu;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]")
    WebElement bottoms;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement pants;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-6']//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']")
    WebElement gearMenu;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Bags']")
    WebElement bags;

 /*
   By womenMenu = By.xpath("//a[@id='ui-id-4']//span[contains(text(),'Women')]");
    By topMenu =By.xpath("//a[@id='ui-id-9']");
    By jacket =By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");
    By menMenu =By.xpath("//a[@id='ui-id-5']");
    By bottoms = By.xpath("//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]");
    By pants = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
  By gearMenu = By.xpath("//a[@id='ui-id-6']//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']");
    By bags = By.xpath("//span[normalize-space()='Bags']");*/

    public void mouseHoverToElementToWomenMenu() {
        CustomListeners.test.log(Status.PASS, "mouseHoverWomenMenu" + womenMenu);
        Reporter.log("mouseHoverOnWomenMenu" + womenMenu.toString());
        mouseHoverToElement(womenMenu);
    }

    public void mouseHoverToElementToTopMenu() {
        CustomListeners.test.log(Status.PASS, "mouseHoverOnTopMenu" + topMenu);
        Reporter.log("mouseHoverOnenMenu" + topMenu.toString());
        mouseHoverToElement(topMenu);

    }

    public void clickOnJacket() {
        CustomListeners.test.log(Status.PASS, "clickOnJacket" + jacket);
        Reporter.log("clickOnJacket" + jacket.toString());
        clickOnElement(jacket);

    }


    public void mouseHoverToElementToMenMenu() {
        CustomListeners.test.log(Status.PASS, "mouseHoverOnMenMenu" + menMenu);
        Reporter.log("mouseHoverOnMenMenu" + menMenu.toString());
        mouseHoverToElement(menMenu);

    }

    public void mouseHoverToElementBottomsMenu() {
        CustomListeners.test.log(Status.PASS, "mouseHoverBottoms" + bottoms);
        Reporter.log("mouseHoverOnBottomsMenu" + bottoms.toString());
        mouseHoverToElement(bottoms);

    }

    public void clickOnPants() {
        CustomListeners.test.log(Status.PASS, "clickOnPants" + pants);
        Reporter.log("clickOnPants" + pants.toString());
        clickOnElement(pants);

    }

    public void mouseHoverToGearMenu() {
        CustomListeners.test.log(Status.PASS, "mouseHoverToGearMenu" + gearMenu);
        Reporter.log("mouseHoverOnGearMenu" + gearMenu.toString());
        mouseHoverToElement(gearMenu);

    }

    public void clickOnBags() {
        CustomListeners.test.log(Status.PASS, "clickOnBags" + bags);
        Reporter.log("clickOnBags" + bags.toString());
        clickOnElement(bags);

    }

}


