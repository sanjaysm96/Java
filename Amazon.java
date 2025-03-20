package org.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;  // Import for new Duration API

public class Amazon {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup(); // WebDriverManager auto-handles driver setup
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void loginToAmazon() {
        driver.get("https://www.amazon.com/");
        driver.findElement(By.id("nav-link-accountList")).click();

        WebElement email = driver.findElement(By.id("ap_email"));
        email.sendKeys("your-email@example.com"); // Replace with email
        driver.findElement(By.id("continue")).click();

        WebElement password = driver.findElement(By.id("ap_password"));
        password.sendKeys("your-password"); // Replace with password
        driver.findElement(By.id("signInSubmit")).click();
    }

    @Test(priority = 2)
    public void searchProduct() {
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Laptop");
        searchBox.submit();

        WebElement firstProduct = driver.findElement(By.cssSelector(".s-title-instructions-style"));
        System.out.println("First Product: " + firstProduct.getText());
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
