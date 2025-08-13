package org.example.pageobjects;

import com.microsoft.playwright.Locator;
import io.github.uchagani.stagehand.annotations.Find;
import io.github.uchagani.stagehand.annotations.PageObject;

import static com.microsoft.playwright.options.WaitForSelectorState.VISIBLE;

@PageObject
public class WorldClockPage {

    @Find("table[class*=zebra]")
    public Locator currentLocalTimeTable;

    @Find("~span.wds")
    public Locator starIcon;

    public boolean hasCityNameStarIcon(String cityName) {
        Locator city = currentLocalTimeTable.getByText(cityName);
        city.waitFor(new Locator.WaitForOptions().setState(VISIBLE).setTimeout(5000.0));
        return city.locator(starIcon).isVisible();
    }

}
