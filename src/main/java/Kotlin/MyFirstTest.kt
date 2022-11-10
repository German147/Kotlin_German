package Kotlin

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.testng.Assert
import org.testng.annotations.Test

class MyFirstTest {

    @Test
    fun openWebPage(){
        System.getProperty("webdriver.chome.driver","src/main/java/drivers/chromedriver.exe")
        //here : WebDriver we are saying what type of variable we state.
        val driver:WebDriver = ChromeDriver()
        //we can omit the : String annotation that follow
        val url: String = "https://mvnrepository.com/artifact/org.testng/testng/7.6.1"
        //avoid the dry pattern!!
        driver.get(url)

        Assert.assertEquals(driver.currentUrl,url,"The web page url did not match its value.")

        driver.quit();

    }
}