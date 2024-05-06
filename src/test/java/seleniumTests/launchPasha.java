package seleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class launchPasha {

	@Test
	public void launchTest()
	{
//		System.out.println("launch is successful");
		String path = "C:\\MyDevelopment\\geckodriver.exe";
		path = path.replace("\\", "/");
		System.setProperty("webdriver.firefox.driver", path);
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com/");
		System.out.println(driver.getTitle());
		driver.close();

	}
}
