package co.ingDanielZabala.runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        features = "src/test/resources/features/libreria.feature",
        glue = "co.ingDanielZabala.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class LibreriaRunner {
}
