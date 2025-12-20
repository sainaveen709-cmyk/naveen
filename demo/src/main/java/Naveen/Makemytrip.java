package Naveen;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Makemytrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://www.flipkart.com/clothing-and-accessories/bottomwear/pr?sid=clo,vua&p[]=facets.ideal_for%255B%255D%3DMen&p[]=facets.ideal_for%255B%255D%3Dmen&otracker=categorytree&fm=neo%2Fmerchandising&iid=M_83fe7df7-57e3-428e-ad72-fc8fc3989d06_1_X1NCR146KC29_MC.VYPCNOF36AXL&cid=VYPCNOF36AXL");
		Thread.sleep(3000);
//driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']")).sendKeys("8919134873");
//Thread.sleep(1500);
//driver.findElement(By.xpath("//button[@class='QqFHMw twnTnD _7Pd1Fp']")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int i = 0; i < 5; i++) {

		

		js.executeScript("window.scrollBy (0,500)");
		}
	}

}
