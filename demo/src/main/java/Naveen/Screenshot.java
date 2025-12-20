package Naveen;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.amazon.in/");

		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		//Files.copy(f.toPath(),new File ("C:\\Users\\saina.000\\OneDrive\\Pictures\\amzo.png"));

		Files.copy(f.toPath(), new File("C:\\Users\\saina.000\\OneDrive\\Pictures\\face.png").toPath());
		
		
		
	}

}
