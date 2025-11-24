import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainAutomation {

    public static void main(String[] args) {
        // Set path to your chromedriver if necessary
        // System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        // Initialize WebDriver (Assuming Chrome for this example)
        WebDriver driver = new ChromeDriver();

        try {
            // Maximize browser window
            driver.manage().window().maximize();

            // Initialize TestCases class
            TestCases tests = new TestCases(driver);

            // Execute Test Cases
            tests.testCase1();
            tests.testCase2();
            tests.testCase3();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            System.out.println("Closing browser...");
            driver.quit();
        }
    }
}
