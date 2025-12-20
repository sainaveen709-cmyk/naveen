package Moviemaker;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Netflix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.netflix.com/in/");
	String url = driver.getCurrentUrl();
	System.out.println(url);
	String Pgsrc = driver.getPageSource();
	System.out.println(Pgsrc);
	String title = driver.getTitle();
	System.out.println(title);
	
	if(title.equals("Netflix")) {
	System.out.println("netflix page is displayed,test is PASSED");
	}
	else {
	System.err.println("Netflix page is not displayed,test is FAILD");	
	
	
	}

}
}