package co.com.ingjuanfg.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.ingjuanfg.user_interface.GooglePage.CAJONES_APPS_GOOGLE;
import static co.com.ingjuanfg.user_interface.GooglePage.OPCION_APP_GOOGLE;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class Seleccionar implements Interaction {

    private String opcion;

    public Seleccionar(String opcion) {
        this.opcion = opcion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CAJONES_APPS_GOOGLE),
                WaitUntil.the(OPCION_APP_GOOGLE.of(opcion), isEnabled()),
                Click.on(OPCION_APP_GOOGLE.of(opcion))
        );
    }

    public static Performable opcionGoogle(String opcion) {
        return instrumented(Seleccionar.class, opcion);
    }
}