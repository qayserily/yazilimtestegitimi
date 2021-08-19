package com.yazilimtestegitimi.pages;

import com.yazilimtestegitimi.utilities.BrowserUtils;
import com.yazilimtestegitimi.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Map;

public abstract class BasePage {

    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "#menu-item-112 a.menu-link")
    @CacheLookup
    private WebElement blog1;

    @FindBy(css = "#menu-test-egitimi-1 li:nth-of-type(3) a")
    @CacheLookup
    private WebElement blog2;

    @FindBy(css = "#menu-test-egitimi-2 li:nth-of-type(3) a")
    @CacheLookup
    private WebElement blog3;

    @FindBy(css = "#menu-item-115 a.menu-link")
    @CacheLookup
    private WebElement karaKutuTestiNedir1;

    @FindBy(css = "#menu-test-egitimi-1 li:nth-of-type(3) ul.sub-menu li:nth-of-type(3) a")
    @CacheLookup
    private WebElement karaKutuTestiNedir2;

    @FindBy(css = "#menu-test-egitimi-2 li:nth-of-type(3) ul.sub-menu li:nth-of-type(3) a")
    @CacheLookup
    private WebElement karaKutuTestiNedir3;

    @FindBy(css = "#menu-item-39 a.menu-link")
    @CacheLookup
    private WebElement letiim1;

    @FindBy(css = "#menu-test-egitimi-1 li:nth-of-type(4) a")
    @CacheLookup
    private WebElement letiim2;

    @FindBy(css = "#menu-test-egitimi-2 li:nth-of-type(4) a")
    @CacheLookup
    private WebElement letiim3;

    @FindBy(css = "a.mobile-menu")
    @CacheLookup
    private WebElement menuClose;

    @FindBy(css = "#menu-item-74 a.menu-link")
    @CacheLookup
    private WebElement mobilUygulamaTestPratii1;

    @FindBy(css = "#menu-test-egitimi-1 li:nth-of-type(2) ul.sub-menu li:nth-of-type(3) a")
    @CacheLookup
    private WebElement mobilUygulamaTestPratii2;

    @FindBy(css = "#menu-test-egitimi-2 li:nth-of-type(2) ul.sub-menu li:nth-of-type(3) a")
    @CacheLookup
    private WebElement mobilUygulamaTestPratii3;

    @FindBy(id = "ocean-mobile-search-2")
    @CacheLookup
    private WebElement mobilUygulamaTestPratii4;

    private final String pageLoadedText = "Bu kurs ile yazılım testinin temellerini öğrenip kurs sayesinde pratik yapıp IT sektörüne hazırlan";

    private final String pageUrl = "/";

    @FindBy(css = "#menu-item-107 a.menu-link")
    @CacheLookup
    private WebElement regresyonTestiNedir1;

    @FindBy(css = "#menu-test-egitimi-1 li:nth-of-type(3) ul.sub-menu li:nth-of-type(1) a")
    @CacheLookup
    private WebElement regresyonTestiNedir2;

    @FindBy(css = "#menu-test-egitimi-2 li:nth-of-type(3) ul.sub-menu li:nth-of-type(1) a")
    @CacheLookup
    private WebElement regresyonTestiNedir3;

    @FindBy(css = "#menu-item-111 a.menu-link")
    @CacheLookup
    private WebElement riskBazlTestler1;

    @FindBy(css = "#menu-test-egitimi-1 li:nth-of-type(3) ul.sub-menu li:nth-of-type(2) a")
    @CacheLookup
    private WebElement riskBazlTestler2;

    @FindBy(css = "#menu-test-egitimi-2 li:nth-of-type(3) ul.sub-menu li:nth-of-type(2) a")
    @CacheLookup
    private WebElement riskBazlTestler3;

    @FindBy(css = "a.elementor-button-link.elementor-button.elementor-size-lg")
    @CacheLookup
    private WebElement satnAl;

    @FindBy(id = "ocean-search-form-1")
    @CacheLookup
    private WebElement searchThisWebsite;

    @FindBy(css = "a.skip-link.screen-reader-text")
    @CacheLookup
    private WebElement skipToContent;

    @FindBy(css = "#menu-item-73 a.menu-link")
    @CacheLookup
    private WebElement testAltrmaGrevi11;

    @FindBy(css = "#menu-test-egitimi-1 li:nth-of-type(2) ul.sub-menu li:nth-of-type(4) a")
    @CacheLookup
    private WebElement testAltrmaGrevi12;

    @FindBy(css = "#menu-test-egitimi-2 li:nth-of-type(2) ul.sub-menu li:nth-of-type(4) a")
    @CacheLookup
    private WebElement testAltrmaGrevi13;

    @FindBy(css = "#menu-item-34 a.menu-link")
    @CacheLookup
    private WebElement testAltrmalar1;

    @FindBy(css = "#menu-test-egitimi-1 li:nth-of-type(2) a")
    @CacheLookup
    private WebElement testAltrmalar2;

    @FindBy(css = "#menu-test-egitimi-2 li:nth-of-type(2) a")
    @CacheLookup
    private WebElement testAltrmalar3;

    @FindBy(css = "#elementor-tab-title-9273 a.elementor-toggle-title")
    @CacheLookup
    private WebElement testKonusundaTecrbeliyimBuKurstaFarkl;

    @FindBy(css = "#menu-item-133 a.menu-link")
    @CacheLookup
    private WebElement udemyKurslar1;

    @FindBy(css = "#menu-test-egitimi-1 li:nth-of-type(1) a")
    @CacheLookup
    private WebElement udemyKurslar2;

    @FindBy(css = "#menu-test-egitimi-2 li:nth-of-type(1) a")
    @CacheLookup
    private WebElement udemyKurslar3;

    @FindBy(css = "#elementor-tab-title-9272 a.elementor-toggle-title")
    @CacheLookup
    private WebElement udemyKursuDndaEkstraBirHarcama;

    @FindBy(css = "#menu-item-50 a.menu-link")
    @CacheLookup
    private WebElement webUygulamaTesti1;

    @FindBy(css = "#menu-test-egitimi-1 li:nth-of-type(2) ul.sub-menu li:nth-of-type(2) a")
    @CacheLookup
    private WebElement webUygulamaTesti2;

    @FindBy(css = "#menu-test-egitimi-2 li:nth-of-type(2) ul.sub-menu li:nth-of-type(2) a")
    @CacheLookup
    private WebElement webUygulamaTesti3;

    @FindBy(css = "#menu-item-90 a.menu-link")
    @CacheLookup
    private WebElement webUygulamaTestiBaslangic1;

    @FindBy(css = "#menu-test-egitimi-1 li:nth-of-type(2) ul.sub-menu li:nth-of-type(1) a")
    @CacheLookup
    private WebElement webUygulamaTestiBaslangic2;

    @FindBy(css = "#menu-test-egitimi-2 li:nth-of-type(2) ul.sub-menu li:nth-of-type(1) a")
    @CacheLookup
    private WebElement webUygulamaTestiBaslangic3;

    @FindBy(css = "a.site-title.site-logo-text")
    @CacheLookup
    private WebElement pageSubTitle;

    @FindBy(css = "#elementor-tab-title-9271 a.elementor-toggle-title")
    @CacheLookup
    private WebElement yazlmTestUzmanOlmakZorMu;


    public BasePage() {

        PageFactory.initElements(Driver.get(), this);
    }

    public String getPageSubTitle() {
        BrowserUtils.waitForStaleElement(pageSubTitle);
        return pageSubTitle.getText();
    }

    public void navigateToModule(String tab, String module) {
        String tabLocator = "//span[normalize-space()='" + tab + "' and contains(@class, 'title title-level-1')]";
        String moduleLocator = "//span[normalize-space()='" + module + "' and contains(@class, 'title title-level-2')]";
        try {
            BrowserUtils.waitForClickablility(By.xpath(tabLocator), 5);
            WebElement tabElement = Driver.get().findElement(By.xpath(tabLocator));
            new Actions(Driver.get()).moveToElement(tabElement).pause(200).doubleClick(tabElement).build().perform();
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath(tabLocator), 5);
        }
        try {
            BrowserUtils.waitForPresenceOfElement(By.xpath(moduleLocator), 5);
            BrowserUtils.waitForVisibility(By.xpath(moduleLocator), 5);
            BrowserUtils.scrollToElement(Driver.get().findElement(By.xpath(moduleLocator)));
            Driver.get().findElement(By.xpath(moduleLocator)).click();
        } catch (Exception e) {
//            BrowserUtils.waitForStaleElement(Driver.get().findElement(By.xpath(moduleLocator)));
            BrowserUtils.clickWithTimeOut(Driver.get().findElement(By.xpath(moduleLocator)),  5);
        }
    }

}
