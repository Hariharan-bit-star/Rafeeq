import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCases {

    private WebDriver driver;

    public TestCases(WebDriver driver) {
        this.driver = driver;
    }

    public void testCase1() {
        System.out.println("Executing Test Case 1: Open Google");
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        if (title.contains("Google")) {
            System.out.println("Test Case 1 Passed");
        } else {
            System.out.println("Test Case 1 Failed");
        }
    }

    public void testCase2() {
        System.out.println("Executing Test Case 2: Open Example.com");
        driver.get("https://example.com");
        String title = driver.getTitle();
        if (title.contains("Example")) {
            System.out.println("Test Case 2 Passed");
        } else {
            System.out.println("Test Case 2 Failed");
        }
    }

    public void testCase3() {
        System.out.println("Executing Test Case 3: Navigation Test");
        driver.navigate().to("https://www.selenium.dev");
        System.out.println("Navigated to Selenium.dev: " + driver.getTitle());
        driver.navigate().back();
        System.out.println("Navigated back");
        System.out.println("Test Case 3 Passed");
    }
}
