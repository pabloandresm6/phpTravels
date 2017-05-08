package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Pablo Andres on 07/05/2017.
 */
@RunWith(Cucumber.class)
@CucumberOptions ( features = "src/test/java/Features" ,glue = "Steps", plugin = {"pretty", "html:target/report"})
public class RunFeatures
{
}
