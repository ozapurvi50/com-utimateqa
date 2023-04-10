package comutimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {

    public static void main(String[] args) {

        String BaseUrl = "https://courses.ultimateqa.com/users/sign_in";

        //Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();

        //2. Open url : open the Url into browser
        driver.get(BaseUrl);

        //3. Print the title of page
        System.out.println("Title is : " + driver.getTitle());

        //4. Print the current URL
        System.out.println("Current URL is : " + driver.getCurrentUrl());

        //Full Screen
        driver.manage().window().fullscreen();

        //5. Print page source
        System.out.println("Page source is: " + driver.getPageSource());

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //6. Enter the email to email field
        WebElement email = driver.findElement(By.id("user[email]"));
        //Type the Email address to email field element
        email.sendKeys("ozapur123@gmail.com");

        //7. Enter the password to password field
        WebElement password = driver.findElement(By.name("user[password]"));
        // Type the Password to password field
        password.sendKeys("oza123");

        //Close driver
        driver.close();
    }



}
