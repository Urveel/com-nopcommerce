import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args)  {
        String baseUrl = "https://demo.nopcommerce.com/";
        //Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();
        //Open the URL into Browser
        driver.get(baseUrl);

        driver.manage().window().maximize();
        //Get page source
        System.out.println(driver.getPageSource());
        //Navigate to URL
        String loginUrl = "https://demo.nopcommerce.com/login?returnUrl= %2F";
        //Print the current URL
        System.out.println("The current URL : " + driver.getCurrentUrl());
        //Navigate back to the homepage
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String homepageUrl = "https://nopcommerce.com/";
        driver.navigate().to(homepageUrl);
        //Navigate to login page
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String Loginpage = "href=\"/login?returnUrl=%2F\"";
        driver.navigate().to(loginUrl);
        //Print the current URL
        System.out.println("The current URL :" + driver.getCurrentUrl());
        //Refresh the page
        driver.navigate().refresh();



        //Enter the email address to email address field
        WebElement emailfiled = driver.findElement(By.id("Email"));
        emailfiled.sendKeys("prime111@gmail.com");
        //Enter the password to password field
        WebElement passwordfiled = driver.findElement(By.name("Password"));
        passwordfiled.sendKeys("1111");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Click on login button
        //WebElement loginButton = driver.findElement(By.linkText("Login"));
        //loginButton.click();

        driver.findElement(By.xpath("(//button[@type='submit'])[2]"));



        driver.close();

    }

}
