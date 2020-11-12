package co.com.miprueba.test.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/revision_politica_datos_personales.feature",
        glue = {"co/com/miprueba/test/stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)
public class DescargaDeContrato {
}
