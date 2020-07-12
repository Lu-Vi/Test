package co.com.miprueba.test.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class EnvioDeTextos {

    public static final Target BARRA_DE_CHAT = Target.the("Barra para mensajes").
            locatedBy("//*[@id='main']/footer/div[1]/div[2]/div/div[2]");
    public static final Target MENSAJE = Target.the("mensaje enviado").
            locatedBy("//*[(@id='main']/div[3]/div/div/div[3]/div[12]/div/div/div/div[1]/div)and(contains(text(),'{0}'))]");
}
