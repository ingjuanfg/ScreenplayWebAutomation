package co.com.ingjuanfg.user_interface;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaGooglePage extends PageObject {

    public static final Target INICIO_GOOGLE = Target.the("Pagina de inicio de Google").locatedBy("//a[@class='gb_x gb_Vb']");
    public static final Target OPCIONES_GOOGLE = Target.the("Opcion Gmail").locatedBy("//span[contains(.,'{0}')]");

    @FindBy(xpath = "//span[contains(.,'{0}')]")
    public WebElementFacade inicioGoogle;

    @AndroidFindBy(xpath = "1231312")
    @iOSFindBy(xpath = "scsdsfsdf")
    public WebElementFacade inicioGmail;

}
