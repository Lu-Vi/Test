package co.com.miprueba.test.stepdefinitions;

import co.com.miprueba.test.interactions.ComparacionDePaginas;
import co.com.miprueba.test.tasks.DescargaDePDF;
import co.com.miprueba.test.userinterfaces.PaginaPrincipal;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.DriverTask;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DescargaDeTarifariosStepDefinitions {
    private PaginaPrincipal paginaPrincipal;


    @Before
    public void configuracionInicial() {
        OnStage.setTheStage(new OnlineCast());
    }
    //serenity bdd crea el sted definition sabe que es de tipo pageobject entonces lo instancia inmediatament
    //las que son stage el sabe que
    //serenity bdd instancia automatizamente el pageobject

    //T-> Genericos..

    @Given("^el usuario ingresa a la pagina de Banistmo$")
    public void elUsuarioIngresaALaPaginaDeBanistmo() {
        theActorCalled("Luisa").
                attemptsTo(Open.browserOn(paginaPrincipal));
    }

    @When("^el usuario descarga el pdf (.*)$")
    public void elUsuarioDescargaElPdf(String tarifario) {
        theActorInTheSpotlight().attemptsTo(DescargaDePDF.delBanco(tarifario));
    }

    @Then("^el usuario deberia ver que se descargo correctamente$")
    public void elUsuarioDeberiaVerQueSeDescargoCorrectamente() {
        //String URL = driver.getCurrentUrl();
        //Assert.assertEquals(URL, "https://www.banistmo.com/wps/wcm/connect/aae1f540-6e90-4974-a27b-b8867a5fd2c9/S56_ActualizacionTarifarioDepositos_Dic2019+%281%29+%282%29.pdf?MOD=AJPERES&CVID=n8g171g" );
        theActorInTheSpotlight().attemptsTo(ComparacionDePaginas.actuales());
    }

}
