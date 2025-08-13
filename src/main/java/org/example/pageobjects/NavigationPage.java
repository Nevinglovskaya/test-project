package org.example.pageobjects;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.WaitUntilState;
import io.github.uchagani.stagehand.annotations.PageObject;

@PageObject
public class NavigationPage {

    private final Page page;

    public NavigationPage(Page page) {
        this.page = page;
    }

    public void openUrl(String url) {
        page.navigate(url, (new Page.NavigateOptions()).setWaitUntil(WaitUntilState.DOMCONTENTLOADED));
    }

}
