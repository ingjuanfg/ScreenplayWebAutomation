package co.com.ingjuanfg.interactions;

import co.com.ingjuanfg.user_interface.PaginaGooglePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.ingjuanfg.user_interface.PaginaGooglePage.INICIO_GOOGLE;
import static co.com.ingjuanfg.user_interface.PaginaGooglePage.OPCIONES_GOOGLE;
import static co.com.ingjuanfg.utils.MenuConstantes.GMAIL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarOpcion implements Interaction {

    PaginaGooglePage paginaGooglePage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INICIO_GOOGLE),
                Click.on(OPCIONES_GOOGLE.of(GMAIL))
        );
    }

    public static Performable gmail() {
        return instrumented(SeleccionarOpcion.class);
    }
}
