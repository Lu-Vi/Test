package co.com.miprueba.test.interactions;

import io.vavr.collection.Set;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class ComparacionDePaginas implements Interaction {
    private String ventanaPrincial;
    private Set<String> ventanas;

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
       //     ventanaPrincial = BrowseTheWeb.as(actor).getDriver().getWindowHandles();
         //   ventanas = BrowseTheWeb.as(actor).getDriver().getWindowHandles();
            for (String ventanaActual : ventanas) {
                if (!ventanaActual.equals(ventanaPrincial)) {
                    BrowseTheWeb.as(actor).getDriver().switchTo().window(ventanaActual);
                }
            }
        } catch (Exception e) {
            System.out.println("No se pudo validar la comparacion de las ventanas");
        }
    }

    public static ComparacionDePaginas actuales() {
        return new ComparacionDePaginas();
    }
}
