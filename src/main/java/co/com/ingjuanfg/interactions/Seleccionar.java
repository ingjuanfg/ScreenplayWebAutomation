package co.com.ingjuanfg.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.conditions.Check;
import org.awaitility.Awaitility;
import org.awaitility.Duration;

import static co.com.ingjuanfg.user_interface.GooglePage.CAJONES_APPS_GOOGLE;
import static co.com.ingjuanfg.user_interface.GooglePage.OPCION_APP_GOOGLE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Seleccionar implements Interaction {

    private String opcion;

    public Seleccionar(String opcion){
        this.opcion = opcion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CAJONES_APPS_GOOGLE));
                Awaitility.await().atLeast(Duration.FIVE_SECONDS);
                actor.attemptsTo(Check.whether(OPCION_APP_GOOGLE.of(opcion).resolveFor(actor).isVisible()).andIfSo(
                        Click.on(OPCION_APP_GOOGLE.of(opcion))
                ).otherwise(
                        Scroll.to(OPCION_APP_GOOGLE.of(opcion)),
                        Click.on(OPCION_APP_GOOGLE.of(opcion))
                )
        );
    }

    public static Performable opcionGoogle(String opcion){
        return instrumented(Seleccionar.class, opcion);
    }
}