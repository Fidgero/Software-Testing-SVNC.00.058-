package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class GoogleRegistrationSteps {
    WebDriver driver = new ChromeDriver();

    @Given("I am on the Google sign up page")
    public void iAmOnTheGoogleSignUpPage() {
        driver.get("https://accounts.google.com/SignUp");
    }

    @When("I enter my first name as {string}")
    public void iEnterMyFirstName(String firstName) {
        WebElement firstNameField = driver.findElement(By.id("firstName"));
        firstNameField.sendKeys(firstName);
    }

    @When("I enter my last name as {string}")
    public void iEnterMyLastName(String lastName) {
        WebElement lastNameField = driver.findElement(By.id("lastName"));
        lastNameField.sendKeys(lastName);
    }

    // Similarly, implement other steps...

    @Then("I should be successfully signed up for a new Google account")
    public void iShouldBeSuccessfullySignedUpForANewGoogleAccount() {
        // Add assertion or validation code here
        driver.quit();
    }
}
