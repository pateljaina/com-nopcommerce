package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2";//Launch the Chrome browser
        WebDriver driver = new ChromeDriver();//Open URL into browser
        driver.get(baseUrl);//places URL to browser(using the get method to open the URL
        System.out.println("The title of the page is: " + driver.getTitle());//print title directly without storing
        System.out.println("The current URL is: " + driver.getCurrentUrl());//print current url directly without storing
        System.out.println("The page source is: " + driver.getPageSource());//print page source directly without storing
        driver.manage().window().maximize();//maximise window
        driver.findElement(By.id("Email")).sendKeys("Prime123@gmail.com");//Find email field element and add email
        driver.findElement(By.name("Password")).sendKeys("Prime123");//Find password element and enter password
        driver.close();//closing the browser
    }
}
