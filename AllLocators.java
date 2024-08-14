package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
public class AllLocators{
    public static void main(String args[]) throws IOException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        System.out.println(driver.getTitle());
        driver.get("https://admissions.kluniversity.in/");
//        driver.findElement(By.id("Name")).sendKeys("jai");
        highlight(driver, driver.findElement(By.name("name")));
        driver.findElement(By.name("name")).sendKeys("123");
        // driver.findElement(By.className("form-control widget_input")).sendKeys("456");

//        String linkText = driver.findElement(By.linkText("Login")).getText();
//        System.out.println(linkText);
//        driver.findElement(By.tagName("a")).getClass();
//        System.out.println(driver.findElement(By.tagName("a")).getText());
//        String s=driver.findElement(By.partialLinkText("Log")).getText();
//        System.out.println(s);
//        driver.findElement(By.cssSelector("#Name")).sendKeys("ram");
//        driver.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div[1]/ul/li[2]/a")).click();

        TakesScreenshot ts=(TakesScreenshot)driver;//
        File file=ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("./Screenshots/Image2.png"));
    }
    public static void highlight (WebDriver driver, WebElement element) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
    }
}