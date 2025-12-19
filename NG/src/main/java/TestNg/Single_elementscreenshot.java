package TestNg;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Single_elementscreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stubo

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get(
				"https://www.5movierulz.condos/the-family-man-2025-hdrip-season-3-telugu-tamil-hindi-eng-watch-online-free/");
		Thread.sleep(1500);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(1500);
		
		WebElement movierulz = driver
				.findElement(By.xpath("//img[@class=\"attachment-post-thumbnail size-post-thumbnail wp-post-image\"]"));
		Thread.sleep(1500);

		File a = movierulz.getScreenshotAs(OutputType.FILE);

		File b = new File("C:\\Users\\saina.000\\OneDrive\\Pictures\\movie.jpg");
		FileUtils.copyFile(a, b);

		System.out.println("take screen shot:" + a.getAbsolutePath());
	}

}
