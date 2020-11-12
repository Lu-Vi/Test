package co.com.miprueba.test.stepdefinitions;

import co.com.miprueba.test.interactions.ComparacionDePaginas;
import co.com.miprueba.test.tasks.DescargaDeContratoBrasil;
import co.com.miprueba.test.tasks.DescargaDeContratoColombia;
import co.com.miprueba.test.userinterfaces.PaginaPrincipalLatam;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DescargaDePoliticaDeDatosPersonalesStepDefinition {
    private PaginaPrincipalLatam paginaPrincipalLatam;


    @Before
    public void configuracionInicial() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^el usuario ingresa a la pagina de LATAM$")
    public void elUsuarioIngresaALaPaginaDeLATAM() {
        theActorCalled("Marta").
                attemptsTo(Open.browserOn(paginaPrincipalLatam));
    }

    @When("^el usuario descarga el contrato para Colombia(.*)$")
    public void elUsuarioDescargaElContratoParaColombia(String politicaDeDatos) {
        theActorInTheSpotlight().attemptsTo(DescargaDeContratoColombia.sobreLa(politicaDeDatos));
    }
 @When("^el usuario descarga el contrato para Brasil(.*)$")
    public void elUsuarioDescargaElContratoParaBrasil(String politicaDeDatos) {
        theActorInTheSpotlight().attemptsTo(DescargaDeContratoBrasil.sobreLa(politicaDeDatos));
    }

    @Then("^el usuario deberia ver que el contrato se descargo correctamente$")
    public void elUsuarioDeberiaVerQueElContratoSeDescargoCorrectamente() {
        theActorInTheSpotlight().attemptsTo(ComparacionDePaginas.actuales());
    }
}
