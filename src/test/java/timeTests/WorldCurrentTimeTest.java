package timeTests;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import io.github.uchagani.jp.UseBrowserConfig;
import io.github.uchagani.stagehand.PageFactory;
import org.example.config.DefaultBrowserConfig;
import org.example.pageobjects.NavigationPage;
import org.example.pageobjects.TopBarMenuPage;
import org.example.pageobjects.WorldClockPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static config.TestData.URL;

@UseBrowserConfig(DefaultBrowserConfig.class)
public class WorldCurrentTimeTest {

    @BeforeEach
    void precondition(Page page) {
        NavigationPage navigationPage = PageFactory.create(NavigationPage.class, page);
        navigationPage.openUrl(URL);
    }

    @AfterEach
    void cleanUp(Browser browser) {
        browser.close();
    }

    @Test
    public void cityNameShouldHaveStarIcon(Page page) {
        WorldClockPage worldClockPage = PageFactory.create(WorldClockPage.class, page);
        TopBarMenuPage topBarMenuPage = PageFactory.create(TopBarMenuPage.class, page);
        String cityName = "Kyiv";

        topBarMenuPage.hoverOverMenuItem("World Clock");
        topBarMenuPage.clickOnSubMenuItem("Main World Clock");
        assertTrue(worldClockPage.hasCityNameStarIcon(cityName), "City " + cityName + " does not have star icon");
    }

}
