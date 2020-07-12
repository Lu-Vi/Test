package co.com.miprueba.test.stepdefinitions;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {

    private WebDriver driver;

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.aNewActor().can(BrowseTheWeb.with(driver));
        OnStage.theActorInTheSpotlight().attemptsTo(Open.url("https://web.whatsapp.com/"));
    }

}
