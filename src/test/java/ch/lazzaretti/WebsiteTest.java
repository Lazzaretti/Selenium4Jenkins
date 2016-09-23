package ch.lazzaretti; /**
 * Created by flazzare on 23.09.2016.
 */

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;
import static org.junit.Assert.*;

public class WebsiteTest {

    WebDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capability = DesiredCapabilities.chrome();
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
    }

    @Test
    public void startWebsite(){
        driver.get("http://www.google.com/webhp?complete=1&hl=en");
        WebElement query = driver.findElement(By.name("q"));
        assertEquals( "", query.getText() );
    }

}
