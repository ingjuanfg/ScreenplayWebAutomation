package co.com.ingjuanfg.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.ingjuanfg.user_interface.YoutubePage.RESULTADOS_YOUTUBE;

public class ResultadoBusqueda implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        if(!RESULTADOS_YOUTUBE.resolveFor(actor).isVisible())
            return true;
        return null;
    }

    public static ResultadoBusqueda esExitoso() {
        return new ResultadoBusqueda();
    }
}