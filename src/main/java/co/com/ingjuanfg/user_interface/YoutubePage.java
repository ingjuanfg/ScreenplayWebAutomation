package co.com.ingjuanfg.user_interface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class YoutubePage {
    public static final Target CAMPO_BUSQUEDA_YOUTUBE= Target.the("Campo de Busqueda de Video de Youtube").located(By.xpath("//input[@id='search']"));
    public static final Target BOTON_BUSQUEDA_YOUTUBE= Target.the("Botón de Busqueda de Video de Youtube").located(By.id("search-icon-legacy"));
    public static final Target RESULTADOS_YOUTUBE= Target.the("Resultados de Busqueda de Video de Youtube").located(By.xpath("//yt-icon[@class='style-scope ytd-background-promo-renderer']"));
}