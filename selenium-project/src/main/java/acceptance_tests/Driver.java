package acceptance_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import main.Main;

public class Driver {
	public static void viewCards() throws InterruptedException {
		Main.driver.get("http://localhost:3000/");
		Thread.sleep(5000);
		Main.driver.findElement(By.className("btn_eventos")).click();
		Main.driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/div[2]/button")).click();

		Thread.sleep(8000);
		Main.driver.findElement(By.xpath("//*[@id=\"login_field\"]")).sendKeys("arthur.fmc.2000@gmail.com");
		Main.driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("adasdh1280");
		Main.driver.findElement(By.xpath("//*[@id=\"login\"]/div[3]/form/div/input[12]")).click();

		Thread.sleep(5000);
		Main.driver.findElement(By.xpath("//*[@id=\"root\"]/nav/span/div/button")).click();
		Main.driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/a[1]")).click();
	}
}
