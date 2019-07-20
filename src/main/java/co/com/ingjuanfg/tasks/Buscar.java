package co.com.ingjuanfg.tasks;

import co.com.ingjuanfg.model.Video;
import co.com.ingjuanfg.model.builders.VideoBuilder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.ingjuanfg.user_interface.YoutubePage.BOTON_BUSQUEDA_YOUTUBE;
import static co.com.ingjuanfg.user_interface.YoutubePage.CAMPO_BUSQUEDA_YOUTUBE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Buscar implements Task {

    Video video;

    public Buscar(Video video){
        this.video = video;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CAMPO_BUSQUEDA_YOUTUBE),
                Enter.theValue(video.getNombreVideo() + " " + video.getArtista()).into(CAMPO_BUSQUEDA_YOUTUBE),
                Click.on(BOTON_BUSQUEDA_YOUTUBE)
        );
    }

    public static Performable el(VideoBuilder videoBuilder) {
        return instrumented(Buscar.class, videoBuilder.build());
    }
}