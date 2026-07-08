package web.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(

        features = "src/test/resources/features/web",
        glue = {
                "web.stepdefinitions",
                "hooks"
        },

        plugin = {
                "pretty",
                "html:reports/web-report.html",
                "json:reports/web-report.json"
        },

        tags = "@web"

)

public class WebRunner {
}
