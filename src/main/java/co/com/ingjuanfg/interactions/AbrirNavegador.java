package co.com.ingjuanfg.interactions;

import co.com.ingjuanfg.user_interface.PaginaGooglePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirNavegador implements Interaction {

    private PaginaGooglePage paginaGooglePage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(paginaGooglePage)
        );
    }

    public static Performable enPaginaGoogle() {
        return instrumented(AbrirPagina.class);
    }
}
