import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Oues1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

        driver.findElement(By.tagName("a"));
        driver.findElement(By.tagName("a")).click();

        WebElement emailAddress = driver.findElement(By.id("email_create"));
        emailAddress.sendKeys("im.piyushkrjha@gmail.com");

        driver.findElement(By.id("SubmitCreate")).click();

        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name='id_gender']")).click();

        // Filling the registration form

        WebElement firstName = driver.findElement(By.id("customer_firstname"));
        firstName.sendKeys("Piyush");

        WebElement lastName = driver.findElement(By.id("customer_lastname"));
        lastName.sendKeys("Kumar");

        WebElement password = driver.findElement(By.id("passwd"));
        password.sendKeys("Qwerty");

//		Selecting DOB from Dropdown
        Select dropDownDays = new Select(driver.findElement(By.id("days")));
        dropDownDays.selectByVisibleText("14  ");

        Select dropDownMonths = new Select(driver.findElement(By.id("months")));
        dropDownMonths.selectByVisibleText("January ");

        Select dropDownYears = new Select(driver.findElement(By.id("years")));
        dropDownYears.selectByVisibleText("2000  ");

        WebElement firstNameAddress = driver.findElement(By.id("firstname"));
        firstNameAddress.sendKeys("Piyush");

        WebElement lastNameAddress = driver.findElement(By.id("firstname"));
        lastNameAddress.sendKeys("Jha");

        WebElement company = driver.findElement(By.id("company"));
        company.sendKeys("To The New");

        WebElement companyAddress = driver.findElement(By.id("address1"));
        companyAddress.sendKeys("NSL Techzone IT SEZ, Noida");

        WebElement city = driver.findElement(By.id("city"));
        city.sendKeys("Noida");

        // Selecting State and country via Dropdown
        Select country = new Select(driver.findElement(By.id("id_country")));
        country.selectByVisibleText("United States");
        Thread.sleep(3000);

        Select state = new Select(driver.findElement(By.id("id_state")));
        state.selectByVisibleText("Idaho");

        WebElement postcode = driver.findElement(By.id("postcode"));
        postcode.sendKeys("00000");

        WebElement contact = driver.findElement(By.id("phone_mobile"));
        contact.sendKeys("8112258130");

        WebElement aliasAddress = driver.findElement(By.id("alias"));
        aliasAddress.sendKeys("New Delhi");

        driver.findElement(By.id("submitAccount")).click();
    }

}