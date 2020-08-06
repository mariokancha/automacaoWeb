package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    private static WebDriver driver;

    public static void openBrowser(){
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void fechaNavegador(){   
        driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setUrl(String url){
        driver.get(url);
    }
    
}