package Naveen;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Applescrrenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	driver.get("https://www.apple.com/in/store?afid=p240%7Cgo~cmp-11141176048~adg-112258962467~ad-780589622291_kwd-10778630~dev-c~ext-~prd-~mca-~nt-search&cid=aos-in-kwgo-brand--");
	Thread.sleep(1500);
	File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	Files.copy(f.toPath(), new File("C:\\Users\\saina.000\\OneDrive\\Pictures\\selenium screen shot\\apple.jpg").toPath());
	
	System.out.println("your screen shot has taken");
	
	Thread.sleep(1500);
	
	
	
	
	
	
	
	
	
	}

}
