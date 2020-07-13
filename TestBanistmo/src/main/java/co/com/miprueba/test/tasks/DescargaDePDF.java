package co.com.miprueba.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.miprueba.test.userinterfaces.PaginaPrincipal.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DescargaDePDF implements Task {
    private String tarifario;

    public DescargaDePDF(String tarifario) {
        this.tarifario = tarifario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(TARIFARIO),
                Click.on(DOCUMENTO_PDF.of(tarifario))
        );
    }

    public static Performable delBanco(String tarifario) {
        return instrumented(DescargaDePDF.class, tarifario);
    }
}
