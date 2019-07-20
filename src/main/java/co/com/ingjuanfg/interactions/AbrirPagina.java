package co.com.ingjuanfg.interactions;

import co.com.ingjuanfg.user_interface.GooglePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirPagina implements Interaction {

    private GooglePage googlePage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(googlePage)
        );
    }

    public static Performable deGoogle() {
        return instrumented(AbrirPagina.class);
    }
}
