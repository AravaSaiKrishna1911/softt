package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;import org.openqa.selenium.chrome.ChromeDriver;
public class staticlocators
{    public static void main(String[] args)
{        WebDriver driver;
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.get("https://www.amazon.in");
    System.out.println("Working on locator");
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
    driver.findElement(By.id("nav-search-submit-text")).submit();
}
} 