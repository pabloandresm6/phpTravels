package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Pablo Andres on 06/05/2017.
 */
public class SearchPage
{
    @FindBy(how = How.ID, using = "citiesInput")
    public WebElement txtLocation;

    @FindBy(how = How.NAME, using = "checkin")
    public WebElement txtCheckInDate;

    @FindBy(how = How.NAME, using = "checkout")
    public WebElement txtCheckOutDate;

    @FindBy(how = How.NAME, using = "adults")
    public WebElement txtAdults;

    @FindBy(how = How.NAME, using = "child")
    public WebElement txtChild;

    @FindBy(how = How.XPATH, using = ".//*[@id='ages']/div/div/div[2]/div/div[1]/select")
    public WebElement txtAgeChild;

    @FindBy(how = How.XPATH, using = "//button[@type = 'button' and text()='Done']")
    public WebElement btnDone;

    @FindBy(how = How.XPATH, using = "//button[@type = 'submit' and text()='Search']")
    public WebElement btnSearch;


    public static WebDriver wdriver;

    public SearchPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);

        wdriver = driver;

    }

    public void Search(String txtlocation, String txtcheckInDate, String txtcheckOutDate, String txtadults, String txtchild)
    {
        txtLocation.sendKeys(txtlocation);
        txtCheckInDate.sendKeys(txtcheckInDate);
        txtCheckOutDate.sendKeys(txtcheckOutDate);
        txtAdults.sendKeys(txtadults);
        txtChild.sendKeys(txtchild);
    }

    public void Search(String txtlocation, String txtcheckInDate, String txtcheckOutDate, String txtadults, String txtchild, String txtageChild)
    {
        txtLocation.sendKeys(txtlocation);
        txtCheckInDate.sendKeys(txtcheckInDate);
        txtCheckOutDate.sendKeys(txtcheckOutDate);
        txtAdults.sendKeys(txtadults);
        txtChild.sendKeys(txtchild);
        txtAgeChild.sendKeys(txtageChild);
    }

    public void setLocation(String location)
    {
       try
       {
           txtLocation.sendKeys(""+location);
       }
       catch(Exception e)
       {
           System.out.println("location cannot be setted. Details: "+e.toString());
       }
    }

    public void setCheckInDate(String checkindate)
    {
        try
        {
            txtCheckInDate.clear();
            txtCheckInDate.sendKeys(""+checkindate);
        }
        catch(Exception e)
        {
            System.out.println("check in date cannot be setted. Details: "+e.toString());
        }
    }

    public void setCheckOutDate(String checkoutdate)
    {
        try
        {
            txtCheckOutDate.clear();
            txtCheckOutDate.sendKeys(""+checkoutdate);
        }
        catch(Exception e)
        {
            System.out.println("check out date cannot be setted. Details: "+e.toString());
        }
    }

    public void setAdults(String adults)
    {
        try
        {
            txtAdults.sendKeys(adults);
        }
        catch(Exception e)
        {
            System.out.println("adults cannot be setted. Details: "+e.toString());
        }
    }

    public void setChild(String child)
    {
        try
        {
            txtChild.sendKeys(child);
        }
        catch(Exception e)
        {
            System.out.println("child cannot be setted. Details: "+e.toString());
        }
    }

    public void setAgeChild(String agechild)
    {
        Integer count = 1;

        try
        {
            String split[] = agechild.split(",");

            for(String age : split)
            {
                System.out.println("Age: "+age);
                if(age.equalsIgnoreCase("Under 1"))
                {
                    System.out.println("Count: "+count);
                    wdriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                    WebElement select = wdriver.findElement(By.xpath("//div[@class='form-horizontal ageselect']/div[1]/select"));
                    select.sendKeys("0");
                    count++;

                }
                else
                {
                    System.out.println("Count: "+count);
                    wdriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                    WebElement select = wdriver.findElement(By.xpath("//div[@class='form-horizontal ageselect']/div[" +count+ "]/select"));
                    select.sendKeys(age);
                    count++;

                }
            }

        }
        catch(Exception e)
        {
            System.out.println("age child cannot be setted. Details: "+e.toString());
        }
    }

    public void modalButtonClickEvent()
    {
        try
        {
            wdriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            btnDone.findElement(By.xpath("//button[@type = 'button' and text()='Done']"));
             btnDone.click();
        }
        catch(Exception e)
        {
            System.out.println("Button 'Done' cannot be clicked. Details: "+e.toString());
        }
    }

    public void searchClickEvent()
    {
        try
        {
             btnSearch.click();
        }
        catch(Exception e)
        {
            System.out.println("Button 'Search' cannot be clicked. Details: "+e.toString());
        }
    }




}
