package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class OrangeHRMSteps {
   WebDriver driver;

    @Given("I launch the chrome browser")
    public void i_launch_the_chrome_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        System.out.println("I launch the chrome browser");
    }
    @When("I open OrangeHRM home page")
    public void i_open_orange_hrm_home_page() {
        driver.get("https://www.orangehrm.com/");
        System.out.println("I open OrangeHRM home page");
    }
    @Then("I verify that the logo present on page")
    public void i_verify_that_the_logo_present_on_page() {
   boolean status=driver.findElement(By.xpath("//div[@class='container-fluid']/a/img")).isDisplayed();
        Assert.assertEquals(true,status);

        System.out.println("I verify that the logo present on page");
    }
    @Then("close browser")
    public void close_browser() {
       driver.quit();
        System.out.println("close browser");
    }
}
