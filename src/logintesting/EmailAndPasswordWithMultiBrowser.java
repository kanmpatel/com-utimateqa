package logintesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class EmailAndPasswordWithMultiBrowser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the brower name : ");
        String browser = scanner.next();
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        if(browser.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            //launch URL method
            driver.get(baseUrl);
            //print currentUrl
            System.out.println("Current Url = "+ driver.getCurrentUrl());
            //get the title of browser
            String title = driver.getTitle();
            System.out.println("my title is = "+title);
            //find the email field element
            WebElement emailField = driver.findElement(By.id("user[email]"));
            //sending email to email field elements
            emailField.sendKeys("abc1234@gmail.com");
            //find the password field element
            WebElement passwordField = driver.findElement(By.name("user[password]"));
            //sending password to password field elements
            passwordField.sendKeys("abcd1234");
            //print the page source
            System.out.println(driver.getPageSource());
            //close the browser
            driver.close();
        } else if(browser.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");
            WebDriver driver = new EdgeDriver();
            //launch URL method
            driver.get(baseUrl);
            //print currentUrl
            System.out.println("Current Url = "+ driver.getCurrentUrl());
            //get the title of browser
            String title = driver.getTitle();
            System.out.println("my title is = "+title);
            //find the email field element
            WebElement emailField = driver.findElement(By.id("user[email]"));
            //sending email to email field elements
            emailField.sendKeys("abc1234@gmail.com");
            //find the password field element
            WebElement passwordField = driver.findElement(By.name("user[password]"));
            //sending password to password field elements
            passwordField.sendKeys("abcd1234");
            //print the page source
            System.out.println(driver.getPageSource());
            //close the browser
            driver.close();
        } else if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
            WebDriver driver = new FirefoxDriver();
            //launch URL method
            driver.get(baseUrl);
            //print currentUrl
            System.out.println("Current Url = "+ driver.getCurrentUrl());
            //get the title of browser
            String title = driver.getTitle();
            System.out.println("my title is = "+title);
            //find the email field element
            WebElement emailField = driver.findElement(By.id("user[email]"));
            //sending email to email field elements
            emailField.sendKeys("abc1234@gmail.com");
            //find the password field element
            WebElement passwordField = driver.findElement(By.name("user[password]"));
            //sending password to password field elements
            passwordField.sendKeys("abcd1234");
            //print the page source
            System.out.println(driver.getPageSource());
            //close the browser
            driver.close();
        } else {
            System.out.println("invalid browser");
        }
    }
}
