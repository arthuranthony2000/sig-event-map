package main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import acceptance_tests.Driver;

public class Main {
 public static WebDriver driver;
 
 public static void main(String args[]) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "/home/ufrn/Downloads/chromedriver_linux64/chromedriver");
	 driver = new ChromeDriver();
	 
	 Driver.viewCards();	 
 }
}
