package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
             "html:target/default-cucumber-reports",
              "json:target/cucumber.json"
        },
        features = {"C:\\Users\\vt\\workspaceForEclipseNewerVersions\\bankOfAmerica\\src\\test\\resources\\features"},
        glue = "stepDefs"
        , tags = "@apply"
        , dryRun = false
        
        
)
public class Runner {
}
