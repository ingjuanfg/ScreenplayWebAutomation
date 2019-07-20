package co.com.ingjuanfg.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GmailPage {

    public static final Target ACCEDER_GMAIL = Target.the("Opcion de Gmail").located(By.xpath("//ul[@class='h-c-header__cta-list header__nav--ltr']//a[contains(.,'Acceder')]"));

}
