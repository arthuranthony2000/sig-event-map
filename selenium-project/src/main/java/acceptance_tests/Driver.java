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
	
	public static void viewMap() throws InterruptedException {
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
		Main.driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/a[2]")).click();

		Thread.sleep(5000);
		Main.driver.findElement(By.xpath("//*[@id=\"react-select-3-input\"]"))
				.sendKeys("Caicó, Rio Grande do Norte, Brazil");
		Thread.sleep(3000);
		Main.driver.findElement(By.xpath("//*[@id=\"react-select-3-input\"]")).sendKeys(Keys.ENTER);
	}
	
	public static void registerEvent() throws InterruptedException {
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
		Main.driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/a[3]")).click();
		
		Thread.sleep(3000);
		Main.driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Festinha dos web devs");
		
		Main.driver.findElement(By.xpath("//*[@id=\"react-select-3-input\"]")).sendKeys("Caicó, Rio Grande do Norte, Brazil");
		Thread.sleep(3000);
		Main.driver.findElement(By.xpath("//*[@id=\"react-select-3-input\"]")).sendKeys(Keys.ENTER);
		Main.driver.findElement(By.xpath("//*[@id=\"datetime-local\"]")).sendKeys("02082022", Keys.TAB, "0600P");
		
		Main.driver.findElement(By.xpath("//*[@id=\"price\"]")).sendKeys("150");
		Main.driver.findElement(By.xpath("//*[@id=\"tickets\"]")).sendKeys("100");
		Main.driver.findElement(By.xpath("//*[@id=\"imgUri\"]")).sendKeys("https://classic.exame.com/wp-content/uploads/2017/09/programac3a7c3a3o.jpg?quality=70&strip=info&w=1024");
		Main.driver.findElement(By.xpath("//*[@id=\"description\"]")).sendKeys("Festa dos devs");
		Thread.sleep(3000);
		Main.driver.findElement(By.xpath("//*[@id=\"page-map\"]/main/form/button")).click();
	}
}
