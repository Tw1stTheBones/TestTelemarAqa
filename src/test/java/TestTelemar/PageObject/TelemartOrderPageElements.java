package TestTelemar.PageObject;

import TestTelemar.Helpers.DriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TelemartOrderPageElements extends DriverHolder {
    public TelemartOrderPageElements(WebDriver driver) {
        super(driver);
    }
        public WebElement takeMore(){

            return driver.findElement(By.xpath("//a[@class='b-quant-inc quantity_up']"));
    }
    public WebElement testLabel(){
        return driver.findElement(By.xpath("//label[@for='idNoCall']"));
    }
    public WebElement testipute(){
        return driver.findElement(By.xpath("//input[@id='idNoCall']"));
    }

    public WebElement testPrice(){
        return driver.findElement(By.xpath("//div[@class='b-obsp-prices']"));
    }
    public WebElement testTotalPrice(){
        return  driver.findElement(By.xpath("(//div[contains(@class,'b-price total_delivery')])[2]"));
    }
}
