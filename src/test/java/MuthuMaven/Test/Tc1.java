package MuthuMaven.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.TestCase;

public class Tc1  {
	
	@Test
	public void muthu()
	{
		System.out.println("Muthu");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Muthukumar\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.quit();
	}
}
