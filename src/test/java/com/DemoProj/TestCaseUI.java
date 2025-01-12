package com.DemoProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestCaseUI {

    public static WebDriver driver;

    @BeforeMethod
    public static void launchDriver() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3999));
        driver.manage().window().maximize();
    }

    @Test
    public void Test1() {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        wait.until(ExpectedConditions.urlMatches("https://demo.guru99.com/test/drag_drop.html"));
        Actions builder = new Actions(driver);
        WebElement source = driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
        WebElement des = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
        builder.clickAndHold(source).moveToElement(des).release(des).perform();
    }

    @Test
    public void Test2() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        wait.until(ExpectedConditions.urlMatches("https://demo.guru99.com/test/drag_drop.html"));
        Actions builder = new Actions(driver);
        WebElement source = driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
        WebElement des = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
        Thread.sleep(2000);
        builder.dragAndDrop(source, des).perform();
    }

    @Test
    public void Test3() {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.get("https://www.rediff.com/");
        wait.until(ExpectedConditions.urlMatches("https://www.rediff.com/"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//a[contains(@title,'Sign in')]")).click();
    }

    @AfterMethod
    public void close(){
        driver.close();
        driver.quit();
    }

}
