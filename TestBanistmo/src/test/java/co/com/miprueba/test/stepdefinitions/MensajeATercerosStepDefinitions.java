package co.com.miprueba.test.stepdefinitions;

import co.com.miprueba.test.questions.ElementoMostrado;
import co.com.miprueba.test.tasks.EnvioDeTexto;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static co.com.miprueba.test.userinterfaces.EnvioDeTextos.MENSAJE;
import static co.com.miprueba.test.userinterfaces.PaginaDeChat.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;


public class MensajeATercerosStepDefinitions {
    private WebDriver driver;

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.aNewActor().can(BrowseTheWeb.with(driver));
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.youtube.com/watch?v=O5kvqVriJdk");
        //driver.manage().window().maximize();
        System.out.println("Estoy en el before");


        //OnStage.setTheStage(new OnlineCast());
        //OnStage.aNewActor().can(BrowseTheWeb.with(driver));
        //System.out.println("Estoy en el before");
        //driver.get("https://web.whatsapp.com/");
       // OnStage.theActorInTheSpotlight().attemptsTo(new OpenPage("https://web.whatsapp.com/"));
    }

    @Given("^el usuario ingresa a la aplicacion$")
    public void elUsuarioIngresaALaAplicacion() {
//        //Open.browserOn(PaginaDeChat.PAGINA);
//        OnStage.setTheStage(new OnlineCast());
//        //Prepara el driver
//        OnStage.aNewActor().can(BrowseTheWeb.with(driver));

        //  OnStage.theActorInTheSpotlight().attemptsTo(Open.url("https://personas.banistmolabs.com/login"));
        System.out.println("Estoy en el given");
        theActorInTheSpotlight().wasAbleTo(WaitUntil.the(CHECKBOX, isClickable()).forNoMoreThan(100).seconds());
        theActorInTheSpotlight().wasAbleTo(WaitUntil.the(BARRA, isCurrentlyEnabled()).forNoMoreThan(200).seconds());
        theActorInTheSpotlight().wasAbleTo(WaitUntil.the(CHAT, isCurrentlyVisible()));
    }

    @When("^el usuario busca (.*) y le escribe (.*)$")
    public void elUsuarioEscribeElTextoEnLaBarra(String tercero, String mensaje) {
        System.out.println("Estoy en el when");
        theActorInTheSpotlight().attemptsTo(EnvioDeTexto.aDestinatario(tercero, mensaje));
    }

    @Then("^el usuario deberia ver su texto (.*) en la pantalla de envio$")
    public void elUsuarioDeberiaVerSuTextoEnLaPantallaDeEnvio(String mensaje_enviado) {
        System.out.println("Estoy en el then");
        theActorInTheSpotlight().should(seeThat(ElementoMostrado.es(MENSAJE.of(mensaje_enviado))));
    }

}
