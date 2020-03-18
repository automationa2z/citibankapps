package com.citi.bank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Jenkins_demo {
    @Test
    public void verifyGooglePage() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "/Users/mdhossain/Documents/consumerbanking/src/main/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        // TO open gmail
        driver.get("http://www.gmail.com");
        //isDisplayed() method returns boolean value either True or False
        Boolean Displayed = driver.findElement(By.xpath("//*[@id='identifierNext']")).isDisplayed();
        //TO print value
        System.out.println("Element displayed is : + Display");
        //isEnable() method returns boolean value either true or false
        Boolean Enable = driver.findElement(By.xpath("//*[@id='identifierNext']")).isEnabled();
        System.out.println("Element enabled is : "+ Enable);
        //passing value as "softwaretestingmaterial" in the email field
        driver.findElement(By.xpath("//*[@class='whsOnd zHQkBf']")).sendKeys("softwaretestingmaterial");
        //to click on next button
        driver.findElement(By.xpath("//*[@id='identifierNext']")).click();
        // isSelected() method returns boolean value either true or false
        driver.close();
    }






}
