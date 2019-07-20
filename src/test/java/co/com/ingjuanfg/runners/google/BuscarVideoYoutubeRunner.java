package co.com.ingjuanfg.runners.google;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/buscar_video_youtube.feature",
        glue = "co.com.todo1.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class BuscarVideoYoutubeRunner {
}