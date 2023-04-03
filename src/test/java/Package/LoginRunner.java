package Package;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
				 features=".//Feature//Login.feature",// please run filter.feature
                  glue= {"stepDefination"}, 
                  dryRun=false,
                  monochrome=true, 
                  plugin = {"pretty","html:target/test-output","json:abc/cucumber.json","junit:cucumber-report/cucumber.xml" }
                  )



public class LoginRunner {

}
