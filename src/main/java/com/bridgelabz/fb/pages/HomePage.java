/**
 * @author Rohit Thorawade
 * @Purpose HomePage Class
 *
 */
package com.bridgelabz.fb.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bridgelabz.fb.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//span[@class='_1vp5']")
	WebElement profileicon;

	@FindBy(xpath = "//a[text()='Add Photo']")
	WebElement addphotobutton;

	@FindBy(xpath = "//a[@aria-label='Upload Photo']")
	WebElement upload;

	@FindBy(xpath = "//button[@data-testid='profilePicSaveButton']")
	WebElement save;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void uploadphoto() throws InterruptedException, AWTException {

		Thread.sleep(8000);
		profileicon.click();
		Thread.sleep(5000);
		addphotobutton.click();
		Thread.sleep(3000);
		upload.click();
		Thread.sleep(2000);

		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		StringSelection filepath = new StringSelection("/home/admin-1/Desktop/Test.jpg");
		clipboard.setContents(filepath, null);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		// Simulate Enter key event
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);

		save.click();
		Thread.sleep(5000);
	}

}
