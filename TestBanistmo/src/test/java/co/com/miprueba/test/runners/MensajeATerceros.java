package co.com.miprueba.test.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/mensajes_a_terceros.feature",
        glue = {"co/com/miprueba/test/stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)
public class MensajeATerceros {
}
