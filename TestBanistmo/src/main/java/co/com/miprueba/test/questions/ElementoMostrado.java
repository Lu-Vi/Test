package co.com.miprueba.test.questions;

import com.google.common.annotations.VisibleForTesting;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.temporal.ChronoUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ElementoMostrado extends PageObject implements Question<Boolean> {

    private final Target elemento;
    @VisibleForTesting
    private
    Logger logger = Logger.getLogger(
            ElementoMostrado.class.getName());

    public ElementoMostrado(Target elemento) {
        this.elemento = elemento;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            WaitUntil.angularRequestsHaveFinished();
            WaitUntil.the(elemento, isVisible());
            this.waitForWithRefresh();
            setWaitForElementTimeout(9000);
            boolean isVisible = elemento.resolveFor(actor).waitUntilVisible().withTimeoutOf(50,
                    ChronoUnit.SECONDS) != null;
            this.waitFor((elemento.resolveFor(actor))).withTimeoutOf(20, ChronoUnit.SECONDS);
            this.waitForWithRefresh();
            resetImplicitTimeout();
            return isVisible;
        } catch (Exception e) {
            logger.log(Level.WARNING, "Error para visibilidad de elemento");
            return false;
        }
    }

    public static Question<Boolean> es(Target elemento) {
        return new ElementoMostrado(elemento);
    }
}

