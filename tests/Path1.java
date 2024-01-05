import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Path1 {

    public static void main(String[] args) {
        ChromeDriverManager.getInstance().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://csb-x6dpt1.netlify.app/");

        // Check for network request to SpaceX API and verify response contains information for 4 rockets
        // Your implementation here

        // Search "crs" on the UI search box
        // Your implementation here


        // Check that 3 pages are being founded
        // Your implementation here


        // Go to page 2 and mark CRS-13 as a favorite
        // Your implementation here


        // Go to the Favorite tab and check that CRS-13 is there.
        // Your implementation here


        // Refresh browser and check again for step 5.
        // Your implementation here

        driver.quit();
    }
}