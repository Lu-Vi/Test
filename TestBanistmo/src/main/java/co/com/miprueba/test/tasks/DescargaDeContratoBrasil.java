package co.com.miprueba.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebElement;

import static co.com.miprueba.test.userinterfaces.PaginaPrincipalLatam.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class DescargaDeContratoBrasil implements Task {
    private String politicaDeDatos;

    public DescargaDeContratoBrasil(String politicaDeDatos) {
        this.politicaDeDatos = politicaDeDatos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(TRANSPARENCIA),
                WaitUntil.the(ANEXO_BRASIL, isEnabled()),
                Click.on(ANEXO_BRASIL),
                Scroll.to((WebElement) Click.on(POLITICA_DE_PROTECCION_DE_DATOS.of(politicaDeDatos)))
        );
    }

    public static Performable sobreLa(String politicaDeDatos) {
        return instrumented(DescargaDeContratoBrasil.class, politicaDeDatos);
    }
}
