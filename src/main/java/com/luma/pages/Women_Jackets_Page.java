package com.luma.pages;

import com.aventstack.extentreports.Status;
import com.luma.customlisteners.CustomListeners;
import com.luma.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.List;

public class Women_Jackets_Page extends Utility {

    @CacheLookup
    @FindBy(xpath = "//div[2]//div[3]//select[1]")
    WebElement productName;

   // By productName = By.xpath("//div[2]//div[3]//select[1]");
    By productList = By.xpath("//strong[@class='product name product-item-name']");
    By sort = By.xpath("//strong[@class='product name product-item-name']");

    By productPriceList = By.xpath("//span[@class='price-wrapper ']");

    By productPriceList2 =By.xpath("//span[@class='price-wrapper ']");

    @CacheLookup
            @FindBy(xpath = "//div[2]//div[3]//select[1]")
            WebElement priceSelect;

  //  By priceSelect = By.xpath("//div[2]//div[3]//select[1]");


    public ArrayList<String> getProductsDisplay1() {
        List<WebElement> beforeProductList = driver.findElements(productList);
        ArrayList<String> beforeSelectElementList1 = new ArrayList<>();
        for (WebElement product : beforeProductList) {
            beforeSelectElementList1.add(String.valueOf(product.getText()));
        }
                return beforeSelectElementList1;
    }
    public void selectProductNameFilter(String filter) {
        //  waitUntilVisibilityOfElementLocated(productName,20);
        CustomListeners.test.log(Status.PASS,"select ProductNameFilter"+productName);
        Reporter.log("select productNameFilter"+productName.toString());
        selectByVisibleTextFromDropDown(productName, filter);

    }

    public ArrayList<String> getProductsDisplay2() {
        List<WebElement> afterProductList = driver.findElements(sort);
        ArrayList<String> afterSelectElementList1 = new ArrayList<>();
        for (WebElement list : afterProductList) {
            afterSelectElementList1.add(String.valueOf(list.getText()));
        }
        return afterSelectElementList1;
    }


    /*****************for Price ********************************/


    public ArrayList<String> getProductsPriceDisplay1() {
        List<WebElement> beforeProductPriceList = driver.findElements(productPriceList);
        ArrayList<String> beforeProductPriceList1 = new ArrayList<>();
        for (WebElement price : beforeProductPriceList) {
            beforeProductPriceList1.add(String.valueOf(price.getText()));
        }
        return beforeProductPriceList1;
    }
    public void selectProductPriceFilter(String filter) {
        //  waitUntilVisibilityOfElementLocated(productName,20);
        CustomListeners.test.log(Status.PASS,"select productPriceFilter"+priceSelect);
        Reporter.log("select productPriceFilter"+priceSelect.toString());
        selectByVisibleTextFromDropDown(priceSelect, filter);

    }

    public ArrayList<String> getProductsPriceDisplay2() {
        List<WebElement>afterProductPriceList= driver.findElements(productPriceList2);
        ArrayList<String>afterProductPriceList1  = new ArrayList<>();
        for (WebElement list : afterProductPriceList) {
            afterProductPriceList1.add(String.valueOf(list.getText()));
        }
        return afterProductPriceList1;
    }


}



