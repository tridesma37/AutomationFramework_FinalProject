package api.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(

        features = "src/test/resources/features/api",

        glue = {
                "api.stepdefinitions"
        },

        plugin = {
                "pretty",
                "html:reports/api-report.html",
                "json:reports/api-report.json"
        },

        tags = "@api"

)

public class ApiRunner {
}