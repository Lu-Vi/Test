package co.com.miprueba.test.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDeChat {

    public static final Target CHECKBOX = Target.the("Donde aparecen los chats").
            located(By.xpath("//*[@id='app']/div/div/div[2]/div[1]/div/div[3]/label/input"));
    public static final Target IMAGEN = Target.the("Donde aparecen los chats").
            located(By.xpath("//*[@id='side']/header/div[1]/div/img"));

    public static final Target CHAT = Target.the("Donde aparecen los chats").located(By.id("side"));
    public static final Target BARRA = Target.the("Barra de busqueda").
            located(By.xpath("//*[@id='side']/div[1]/div/label/div/div[2]"));
    public static final Target DESTINATARIO = Target.the("selecciona destinatario").
            located(By.xpath("//*[@id='pane-side']/div[1]/div/div/div[14]/div/div/div[2]"));

    public static final Target YOUTUBE = Target.the("Donde aparecen los chats").
            locatedBy("//*[@id='movie_player']/div[32]/div[2]/div[1]/button");

}
