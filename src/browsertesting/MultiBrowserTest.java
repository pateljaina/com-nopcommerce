package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {
    static String browser = "Edge";//given browser
    static String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";//base url
    static WebDriver driver;//driver stored

    public static void main(String[] args) {//if statement to open with Chrome, Firefox or Edge
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser Name");//if wrong browser - print statement
        }
        driver.get(baseUrl);//places URL to browser(using the get method to open the URL
        System.out.println("The title of the page is: " + driver.getTitle());//print title directly without storing
        System.out.println("The current URL is: " + driver.getCurrentUrl());//print current url directly without storing
        System.out.println("The page source is: " + driver.getPageSource());//print page source directly without storing
        driver.manage().window().maximize();//maximise window
        driver.findElement(By.id("Email")).sendKeys("Prime123@gmail.com");//Find email field element and add email
        driver.findElement(By.name("Password")).sendKeys("Prime123");//Find password element and enter password
        driver.close();//close driver
    }
}
