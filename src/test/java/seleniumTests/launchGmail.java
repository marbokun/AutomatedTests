package seleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchGmail {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\MyDevelopment\\geckodriver.exe";
		path = path.replace("\\", "/");
		System.setProperty("webdriver.firefox.driver", path);
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com/");
		System.out.println(driver.getTitle());
		driver.close();
	}

}