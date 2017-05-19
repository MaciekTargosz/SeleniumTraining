package com.selenium.test.pages;

import com.selenium.test.webtestsbase.BasePage;
import org.openqa.selenium.By;

/**
 * Created by SG0943274 on 2017-03-23.
 */
public class ProductsInCategoryListPage extends BasePage {

    public ProductsInCategoryListPage() {
        super(false);
    }

    @Override
    protected void openPage() {
    }

    @Override
    public boolean isPageOpened() {
        return getDriver().findElement(By.cssSelector("div#content h2")).isDisplayed();
    }

    public ProductsInCategoryListPage addItemToCart(String itemName) {
        getDriver().findElement(By.xpath("//div[./div/h4/a[contains(text(),'" + itemName + "')]]/div[contains(@class,'button-group')]/button[contains(@onclick,'cart')]")).click();
        return this;
    }
}
