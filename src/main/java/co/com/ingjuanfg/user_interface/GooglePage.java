package co.com.ingjuanfg.user_interface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GooglePage extends PageObject {
    public static final Target CAJONES_APPS_GOOGLE = Target.the("Cajones de Apps de Google").located(By.xpath("//a[@class='gb_x gb_Vb']"));
    public static final Target OPCION_APP_GOOGLE = Target.the("Apps de Google").locatedBy("//span[contains(.,'{0}')]");
}