package org.example.pageobjects;

import com.microsoft.playwright.Locator;
import io.github.uchagani.stagehand.annotations.Find;
import io.github.uchagani.stagehand.annotations.PageObject;

@PageObject
public class TopBarMenuPage {

    @Find("a[class=site-nav__title]")
    public Locator menuItem;

    @Find("li[class=site-nav__item]")
    public Locator subMenuItem;

    public void hoverOverMenuItem(String menuItemName) {
        menuItem.getByText(menuItemName).hover();
    }

    public void clickOnSubMenuItem(String subMenuItemName) {
        subMenuItem.getByText(subMenuItemName).click();
    }

}
