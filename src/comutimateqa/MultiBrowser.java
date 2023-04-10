package comutimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class MultiBrowser {

    static String browser = "Chrome";
    static WebDriver driver;
    static String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
    //defining static variable to store URL
    public static void main(String[] args) {

        if(browser.equalsIgnoreCase("Safari")){
            driver = new SafariDriver();
        } else if (browser.equalsIgnoreCase("Firefox")){
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if(browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong browser name.");
        }

        //1. Open URL : open the Url into browser
        driver.get(baseUrl);

        //Browser full screen
        driver.manage().window().fullscreen();

        //2. Print the title of page
        System.out.println("Page title : " + driver.getTitle());

        //3. Print current Url
        System.out.println("Current Url : " + driver.getCurrentUrl());

        //4. Print the page source
        System.out.println("Page source :" + driver.getPageSource());

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //5. Enter the email to email field
        WebElement email = driver.findElement(By.id("user[email]"));
        //Type the Email address to email field element
        email.sendKeys("ozapur123@gmail.com");

        //6. Enter the password to password field
        WebElement password = driver.findElement(By.name("user[password]"));
        // Type the Password to password field
        password.sendKeys("oza123");

        //7. Close driver
        driver.close();


    }
}
