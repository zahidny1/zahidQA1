package SocialMedia.DemoMaveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FaceBookTest {
	
	@Test
	public void SignUpTest() {
		System.out.println("User succesfully sign up!");
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Md Rashid\\Documents\\Selinium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.findElement(By.name("firstname")).sendKeys("Md");
			driver.findElement(By.name("lastname")).sendKeys("Hossain");
			driver.findElement(By.name("reg_email__")).sendKeys("Mdzahidhossain813@gmail.com");
			driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Mdzahidhossain813@gmail.com");
			driver.findElement(By.name("reg_passwd__")).sendKeys("Abcd123456!");
			Select birthmonth=new Select(driver.findElement(By.name("birthday_month")));
			birthmonth.selectByVisibleText("Oct");
			Select birthday=new Select(driver.findElement(By.name("birthday_day")));
			birthday.selectByVisibleText("10");
			Select birthYear=new Select(driver.findElement(By.name("birthday_year")));
			birthYear.selectByVisibleText("1979");
			driver.findElement(By.xpath("//*[@id=\"u_0_7\"]")).click();
			driver.findElement(By.name("websubmit")).click();
			driver.close();


	}
	}


