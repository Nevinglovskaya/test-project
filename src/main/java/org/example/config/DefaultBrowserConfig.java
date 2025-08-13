package org.example.config;

import io.github.uchagani.jp.BrowserConfig;
import io.github.uchagani.jp.PlaywrightBrowserConfig;

public class DefaultBrowserConfig implements PlaywrightBrowserConfig {

    @Override
    public BrowserConfig getBrowserConfig() {
        return new BrowserConfig()
                .chromium()
                .launch();
    }

}
