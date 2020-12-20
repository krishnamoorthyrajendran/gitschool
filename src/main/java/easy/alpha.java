package easy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class alpha {
	private static Logger log=LogManager.getLogger(alpha.class.getName());
	@Test
	public void newl() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\krishnamoorthy\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		log.info("info");
		log.info("info");
		log.info("info");
		
		
	}

}
