package drivermanager;

import org.openqa.selenium.WebDriver;

import pages.HomePage;
import pages.SearchPage;

public class PageFactoryManager {

	public 	HomePage homepage;
	public 	SearchPage searchPage;

	public  HomePage getHomePageObject(WebDriver driver) {
		if (homepage == null) {
			return homepage = new HomePage(driver);
		} else {
			return homepage;
		}
	}
	
	public   SearchPage getSearchPageObject(WebDriver driver) {
		if (searchPage == null) {
			return searchPage = new SearchPage(driver);
		} else {
			return searchPage;
		}
	}
}