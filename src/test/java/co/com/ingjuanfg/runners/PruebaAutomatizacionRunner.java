package co.com.ingjuanfg.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/prueba_automatizacion.feature",
        glue = "co.com.todo1.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class PruebaAutomatizacionRunner {
}
