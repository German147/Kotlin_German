package Kotlin

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.testng.Assert
import org.testng.annotations.AfterTest
import org.testng.annotations.BeforeTest
import org.testng.annotations.Test

class MyFirstTest {

    private var driver: WebDriver? = null

    @BeforeTest
    fun createDriver(){
        System.getProperty("webdriver.chome.driver","src/main/java/drivers/chromedriver.exe")
        //here : WebDriver we are saying what type of variable we state.
        // val means this is a final variable immutable
        driver = ChromeDriver()

    }

    @AfterTest
    fun tearDownDriver(){
        //double exclamation marks means check first if is null(if it isn't, proceed), this is call the lazy way
        driver!!.quit()
    }


    @Test
    fun openWebPage(){

        //we can omit the : String annotation that follow
        val url: String = "https://mvnrepository.com/artifact/org.testng/testng/7.6.1"
        //avoid the dry pattern!!
        driver!!.get(url)

        Assert.assertEquals(driver!!.currentUrl,url,"The web page url did not match its value.")



    }
}