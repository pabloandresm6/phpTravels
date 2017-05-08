package Steps;

import Utils.BaseUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Created by Pablo Andres on 06/05/2017.
 */
public class Hook extends BaseUtil
{
    private BaseUtil base;

    public Hook(BaseUtil base)
    {
        this.base = base;
    }

    @Before
    public void InitializeTest()
    {
        String key ="";
        String value = "";

        try
        {
            /*** Initialize test with Firefox **/
            System.out.println("Opening the browser..");
            Properties prop = new Properties();
            InputStream in = getClass().getClassLoader().getResourceAsStream("config.properties");
            prop.load(in);

            System.setProperty(prop.getProperty("FirefoxDriverKey"),prop.getProperty("FirefoxDriverValue"));
            System.setProperty(prop.getProperty("GeckoDriverKey"),prop.getProperty("GeckoDriverValue"));

            base.driver = new FirefoxDriver();

            base.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            in.close();

            /***End Initialize test with Firefox **/

            /*** Initialize test with Chrome **/

            //System.setProperty(prop.getProperty("GoogleDriverKey"),prop.getProperty("GoogleDriverValue"));

            //base.driver = new ChromeDriver();

           // base.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

           // in.close();

            /*** End Initialize test with Chrome **/

            /***End Initialize test with Firefox **/

            /*** Initialize test with IExplore **/

            //System.setProperty(prop.getProperty("IEDriverKey"),prop.getProperty("IEDriverValue"));

            //base.driver = new InternetExplorerDriver();

            //base.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            //in.close();

            /*** End Initialize test with IExplore **/


        }
        catch(Exception e)
        {
            System.out.println("Could not initialize properties or browser. Details: "+e.toString());
        }
    }

    @After
    public void TearDownTest()
    {
        System.out.println("Closing the browser..");
    }
}
