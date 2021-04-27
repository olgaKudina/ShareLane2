package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShareLaneTest {

    @Test
    public void fillZipcodeFieldTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py"); //открыть браузер
        driver.findElement(By.name("zip_code")).sendKeys("222222");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();
   /* }
    @Test
    public void signUpTest(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=222222"); */
        driver.findElement(By.name("first_name")).sendKeys("James");
        driver.findElement(By.name("last_name")).sendKeys("Brown");
        driver.findElement(By.name("email")).sendKeys("james@corp.rom");
        driver.findElement(By.name("password1")).sendKeys("1111");
        driver.findElement(By.name("password2")).sendKeys("1111");
        driver.findElement(By.xpath("//*[@value='Register']")).click();

    }

}
