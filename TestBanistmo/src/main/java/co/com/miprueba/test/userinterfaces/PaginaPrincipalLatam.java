package co.com.miprueba.test.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.latam.com/es_co/")
public class PaginaPrincipalLatam extends PageObject {
    public static final Target TRANSPARENCIA = Target.the("Enlace para revisar el contrato de transporte").
            located(By.xpath("(//*[@class='footer-unorderedItem--links'])[9]"));
    public static final Target ANEXO_COLOMBIA = Target.the("Anexo de contrato de transporte para Colombia").
            locatedBy("#maincontent > section > div > div > div > p:nth-child(5) > a");
    public static final Target ANEXO_BRASIL = Target.the("Anexo de contrato de transporte para Colombia").
            locatedBy("#maincontent > section > div > div > div > p:nth-child(6) > a");
    public static final Target POLITICA_DE_PROTECCION_DE_DATOS = Target.
            the("Archivo para revisar la politica de proteccion de datos personales").
            locatedBy("//*[text()='{0}']");
}
