package org.example.pageobjects;

import com.microsoft.playwright.Page;
import io.github.uchagani.stagehand.annotations.PageObject;

import static com.microsoft.playwright.options.WaitUntilState.DOMCONTENTLOADED;

@PageObject
public class NavigationPage {

    private final Page page;

    public NavigationPage(Page page) {
        this.page = page;
    }

    public void openUrl(String url) {
        page.navigate(url, new Page.NavigateOptions().setWaitUntil(DOMCONTENTLOADED));
    }

}
