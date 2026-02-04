package example;
import java.awt.Dimension;
import java.awt.Point;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

public static void main(String[] args)throws InterruptedException {
Scanner sc= new Scanner(System.in);
System.out.println("Enter the browser name: ");
String browser=sc.nextLine();
WebDriver driver = null;

if(browser.equals("Edge")) {
WebDriverManager.edgedriver().setup();

driver = new EdgeDriver();
}
else if(browser.equals("chrome")) {
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
}
else if(browser.equals("firefox")) {
WebDriverManager.firefoxdriver().setup();
driver = new FirefoxDriver();
}
else {
System.out.println("invalid browser");
}
driver.manage().deleteAllCookies();
driver.get("https://www.google.com/");
driver.navigate().to("https://www.amazon.in/");
Thread.sleep(1000);
driver.navigate().back();
Thread.sleep(1000);
driver.navigate().forward();
Thread.sleep(1000);
driver.navigate().refresh();

//Dimension d= new Dimension(500,500);
//((Dimension) driver.manage()).setSize(d);
//Thread.sleep(2000);
//Point p = new Point(250,250);
//driver.manage().window().setPosition(p);
//Thread.sleep(2000);
//driver.manage().window().maximize();
String title = driver.getTitle();


System.out.println("Title: " +title);
String url = driver.getCurrentUrl();
System.out.println("URL is: " +url);

Thread.sleep(2000);
driver.close();
}

}
