import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prabhak\\Documents\\selinium training space\\SeliniumBasics\\Filestore\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com");
		driver.manage().window().maximize();
        File img = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//to instruct to take screen of the page my driver pointing to
        File destImg = new File("C:\\Users\\Prabhak\\Documents\\selinium training space\\SeliniumBasics\\Filestore\\binghome.png");
	    FileUtils.copyFile(img, destImg);
	   

	}

}
