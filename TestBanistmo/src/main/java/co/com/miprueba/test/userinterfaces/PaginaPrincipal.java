package co.com.miprueba.test.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.banistmo.com/wps/portal/banistmo/personas/")
public class PaginaPrincipal extends PageObject {
    public static final Target TARIFARIO = Target.the("Enlace a tarifario").
            located(By.xpath("//*[@id='footer-content']/div[2]/div[1]/div/div[2]/div/ul/li[5]/a"));
    public static final Target DOCUMENTO_PDF = Target.the("Nombre del documento a descargar").
            locatedBy("//*[text()='{0}']//following::a[1]");

}
