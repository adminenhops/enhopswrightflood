package WebTestCases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import TestNGListeners.SuiteEvent;
import TestNGListeners.WebEvent;
import WebPages.InsuredWebSite;

@Listeners({ SuiteEvent.class, WebEvent.class })
public class TC_025_InsuredWebSiteGuestSignIn {
	
	@Test(description = "Guest sign in", groups = { "smoke", "regression",
	"Web Application" })
	public void TC_025_guestSignIn() throws Exception {
		
	    InsuredWebSite insuredWebSite = new InsuredWebSite();
		insuredWebSite.guestSignInAndSignOut();
	}

}
