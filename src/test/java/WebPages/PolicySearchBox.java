package WebPages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import Utilities.ReportManager;
import WebUtil.WebActions;

public class PolicySearchBox {

	// ==========================Objects==================================
	WebActions webActions = new WebActions();
	

	// ==========================Locators==================================
	public static By searchBox = By.xpath("//input[@id='quickSearchText']");
	public static By openaClaim = By.xpath("//a[@id='InquiryOpnClm']");

	/**
	 * =============================================================================
	 * Method: searchPolicyFromSearchBox | Author: Sunil | Date:27 jan 2021 |
	 * Description: opening policy from search Box | Parameters: None |
	 * Return: None
	 * =============================================================================
	 * @throws InterruptedException 
	 * 
	 * @throws Exception
	 */

	public void searchPolicyFromSearchBox() throws Exception {

		webActions.sendKeys(searchBox, "09900003587000");
		Robot robot = new Robot();
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		ReportManager.logScreenshotInfo();
		Thread.sleep(4000);
	}
	
	/**
	 * =============================================================================
	 * Method: searchPolicyFromSearchBoxwithName | Author: Sunil | Date:27 jan 2021 |
	 * Description: open policy from search Box with policy name | Parameters: None |
	 * Return: None
	 * =============================================================================
	 * @throws InterruptedException 
	 * 
	 * @throws Exception
	 */

	public void searchPolicyFromSearchBoxwithName() throws Exception {

		webActions.sendKeys(searchBox, "test");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		ReportManager.logScreenshotInfo();
		Thread.sleep(4000);
	}
	
	
	/**
	 * =============================================================================
	 * Method: claimInfrmtnPageFromSearchBox | Author: Sunil | Date:27 jan 2021 |
	 * Description: opening Claim information page after opening the policy from search box | Parameters: None |
	 * Return: None
	 * =============================================================================
	 * @throws InterruptedException 
	 * 
	 * @throws Exception
	 */

	public void claimInfrmtnPageFromSearchBox() throws Exception {
		webActions.sendKeys(searchBox, "099000033469 00");
		Robot robot1 = new Robot();
		robot1.keyPress(KeyEvent.VK_ENTER);
		robot1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		webActions.Click(openaClaim, "click on open a claim");
		ReportManager.logScreenshotInfo();
		Thread.sleep(4000);
	}

}
