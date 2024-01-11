package seleniumPractice;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class pgm1 {

//	public static void main(String[] args) {
	// TODO Auto-generated method stub

	@Test
	public void sub() {
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\vijay\\Documents\\Automation\\chromedriver.exe");
		// driver = new ChromeDriver();

		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\vijay\\Documents\\Automation\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/?gws_rd=ssl");

		System.out.println("Test NG run by Vijay");
	}

}
}
