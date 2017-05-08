package Pages;

import Utils.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Pablo Andres on 07/05/2017.
 */
public class FilterPage
{
    private BaseUtil base;

    public WebElement radioStarGrade;

    public WebElement sliderHandleRound1;

    public WebElement sliderHandleRound2;

    @FindBy(how = How.ID, using = "searchform")
    public WebElement btnSearchFilter;

    public static WebDriver Wdriver;

    public FilterPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        Wdriver = driver;
    }

    public void setStarGrade(String stargrade)
    {
        try
        {
            radioStarGrade = Wdriver.findElement(By.id(stargrade));
            radioStarGrade.click();
        }
        catch(Exception e)
        {
            System.out.println("star grade cannot be setted. Details: "+e.toString());
        }
    }

    public void setSpnPriceRange(String slide1, String slide2)
    {
        int  sld1 = 0;
        int sld2 = 0;

        try
        {
            sld1 = Integer.parseInt(slide1);
            sld2 = Integer.parseInt(slide2);

            double left1;
            double left2;

            JavascriptExecutor js = (JavascriptExecutor) Wdriver;

            getSliders();

            if(sld1 == 25)
            {
                left1 = 0;
            }
            else
            {
                left1 = sld1 - 25;
                left1 = left1 / 100;
                left1 = (double) (left1 * 5.06329);
            }

            if(sld2 == 25)
            {
                left2 = 0;
            }
            else
            {
                left2 = sld2 - 25;
                left2 = left2 / 100;
                left2 = (double) (left2 * 5.06329);
            }

            js.executeScript("arguments[0].setAttribute('style', 'left:"+left1+"%')",sliderHandleRound1);
            System.out.println("left 1: "+left1);
            System.out.println("left 2: "+left2);
            js.executeScript("arguments[0].setAttribute('style', 'left:"+left2+"%')",sliderHandleRound2);

        }
        catch(Exception e)
        {
            System.out.println("price range cannot be setted. Details: "+e.toString());
        }
    }

    public void getSliders()
    {
        try
        {
            sliderHandleRound1 = Wdriver.findElement(By.xpath("//div[@class='slider-track']/div[2]"));
            sliderHandleRound2 = Wdriver.findElement(By.xpath("//div[@class='slider-track']/div[3]"));
        }
        catch (Exception e)
        {
            System.out.println("Error getting sliders. Details: "+e.toString());
        }
    }

    public void searchFilterClickEvent()
    {
        try
        {
            btnSearchFilter.click();
        }
        catch(Exception e)
        {
            System.out.println("Button 'Search' cannot be clicked. Details: "+e.toString());
        }
    }
}
