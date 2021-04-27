package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ErrorSignUp {

   @Test
    public void errorSignUp(){
       System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.sharelane.com/cgi-bin/register.py"); //открыть браузер
       driver.findElement(By.name("zip_code")).sendKeys("222222");
       driver.findElement(By.xpath("//*[@value='Continue']")).click();

       driver.findElement(By.xpath("//*[@value='Register']")).click();
       driver.findElement(By.className("error_message"));
   }
}
