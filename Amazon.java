package example;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
                // *task 1 = to open amazon website//*
	public static void main(String[] args)throws InterruptedException{
		// TODO Auto-generated method stub
    WebDriverManager.chromedriver().setup();
    ChromeDriver driver = new ChromeDriver();
    driver.get("https://www.amazon.com");
                // task 2 = to find the search box
                // task 3 = to type laptop
                // task 4 = click on search button 
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
    driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	}
//nav-search-submit-button
}
