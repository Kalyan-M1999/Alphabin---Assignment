package Step_Defination_BookMyShow;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ticket_BookMyShow {
    WebDriver driver;  
    @Given("I am on the BookMyShow homepage")
    public void i_am_on_the_book_my_show_homepage() {
        // Initialize the driver at the class level
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://in.bookmyshow.com/");
    }

    @When("I search for the city")
    public void i_search_for_the_city() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//input[@placeholder='Search for your city']")).sendKeys("Surat");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//li[@class='bwc__sc-1iyhybo-9 fMpEag']")).click();
        Thread.sleep(9000);
    }

    @When("I search for the movie")
    public void i_search_for_the_movie() throws InterruptedException {
        WebElement searchBox = driver.findElement(By.xpath("//span[@id='4']"));
        searchBox.click();
        WebElement searchBox1 = driver.findElement(By.xpath("//input[@class='search-box typeahead tt-input']"));
        searchBox1.sendKeys("Kalki");
        searchBox1.sendKeys(Keys.ENTER);
        
    }
    @Then("the booking should be successful")
    public void the_booking_should_be_successful() throws InterruptedException {
    	
    	WebElement searchBox2 = driver.findElement(By.xpath("//img[@alt='Kalki 2898 AD']"));
    	searchBox2.click();
    	Thread.sleep(5000);
    	driver.findElement(By.xpath("//div[@class='sc-qswwm9-8 goilWl']//span[contains(text(),'Book tickets')]")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//li[2]//section[2]//div[1]")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//div[normalize-space()='Filter Show Timings']")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//label[@for='filter-evening']")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//li[@data-id='INVR']//div[@class='__text'][normalize-space()='06:15 PM']")).click();
       
        driver.quit();
    }
}

