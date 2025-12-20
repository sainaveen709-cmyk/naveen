package Naveen;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookscreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.5movierulz.condos/");
		Thread.sleep(1500);

		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		Files.copy(f.toPath(),
				new File("C:\\Users\\saina.000\\OneDrive\\Pictures\\selenium screen shot\\movierulz.png").toPath());

	}

}
