package co.com.ingjuanfg.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.ingjuanfg.user_interface.GmailPage.ACCEDER_GMAIL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IniciarSesion implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ACCEDER_GMAIL)
        );
    }

    public static Performable conCredenciales() {
        return instrumented(IniciarSesion.class);
    }
}
