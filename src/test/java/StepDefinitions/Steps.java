package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Steps {
    WebDriver driver;
    @Given("the user is on login page")
    public void the_user_is_on_login_page() {
        driver = new ChromeDriver();
        driver.get("http://stage.happilee.io");
        driver.manage().window().maximize();
        System.out.println("In Login page");
    }

    @When("the user enters a valid phone number {string}")
    public void the_user_enters_a_valid_phone_number(String phoneNumber) {
        driver.findElement(By.xpath(".//*[@class='auth__inputNo___svNOM']")).sendKeys(phoneNumber);
        System.out.println("Enter valid phone number: " + phoneNumber);
    }
    @When("hits submit")
    public void hits_submit() {
        driver.findElement(By.xpath(".//*[@class='auth__submitButton___fGklH mt-1 align-self-center button__button___ZQ5nP']")).click();
        System.out.println("Hit submit");
    }
    @When("the user receives OTP")
    public void the_user_receives_otp() {
        System.out.println("user enters OTP");
    }
    @Then("user should be able to login successfully")
    public void user_should_be_able_to_login_successfully() {
        System.out.println("Logged in");
    }
}
