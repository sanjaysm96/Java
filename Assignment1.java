package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;

public class Assignment1 {
    public static void main(String[] args) {
        // Setup WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open the application
        driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");

        // Get and print the page title
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);

        // Locate the "Last Name" and "Hidden Text Box"
        WebElement lastName = driver.findElement(By.xpath("//input[@name='lname']"));
        WebElement hiddenTextBox = driver.findElement(By.xpath("//input[@name='Hidden']"));

        // Print visibility & enabled state
        System.out.println("Last Name Displayed: " + lastName.isDisplayed());
        System.out.println("Last Name Enabled: " + lastName.isEnabled());

        System.out.println("Hidden Text Box Displayed: " + hiddenTextBox.isDisplayed());
        System.out.println("Hidden Text Box Enabled: " + hiddenTextBox.isEnabled());

        // Use JavaScript to enable the Last Name field if disabled
        JavascriptExecutor js = (JavascriptExecutor) driver;
        if (!lastName.isEnabled()) {
            js.executeScript("arguments[0].removeAttribute('disabled');", lastName);
        }
        lastName.sendKeys("Test Last Name");

        // Use JavaScript to enter text into the hidden field
        js.executeScript("arguments[0].value='Hidden Text';", hiddenTextBox);

        // Close the browser
        driver.quit();
    }
}
