package co.com.miprueba.test.tasks;

import co.com.miprueba.test.userinterfaces.EnvioDeTextos;
import co.com.miprueba.test.userinterfaces.PaginaDeChat;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.miprueba.test.userinterfaces.PaginaDeChat.YOUTUBE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnvioDeTexto implements Task {

    private String tercero;
    private String mensaje;

    public EnvioDeTexto(String tercero, String mensaje) {
        this.tercero = tercero;
        this.mensaje = mensaje;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(YOUTUBE),
                Click.on(PaginaDeChat.BARRA),
                Enter.theValue(tercero).into(PaginaDeChat.BARRA),
                Click.on(PaginaDeChat.DESTINATARIO),
                Enter.theValue(mensaje).into(EnvioDeTextos.BARRA_DE_CHAT));
    }

    public static Performable aDestinatario(String tercero, String mensaje) {
        return instrumented(co.com.miprueba.test.tasks.EnvioDeTexto.class, tercero, mensaje);
    }
}

