package ru.netology.web;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTest {
    private WebDriver driver;

    @BeforeAll
    static void setUpAll(){
        System.setProperty("webdriver.chrome.driver", "./driver/win/chromedriver.exe");
    }


     @BeforeEach
    void setUp() {
         driver = new ChromeDriver();

     }
     @AfterEach
    void tearDown() {
         driver.quit();
         driver = null;
    }

    @Test
    void shouldTestUI(){
        driver.get("http://localhost:9999/");
}

}
