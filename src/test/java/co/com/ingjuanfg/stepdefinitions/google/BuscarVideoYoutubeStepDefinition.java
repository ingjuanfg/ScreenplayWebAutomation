package co.com.ingjuanfg.stepdefinitions.google;

import co.com.ingjuanfg.exceptions.NoExisteElVideoBuscadoException;
import co.com.ingjuanfg.interactions.AbrirPagina;
import co.com.ingjuanfg.interactions.Seleccionar;
import co.com.ingjuanfg.questions.ResultadoBusqueda;
import co.com.ingjuanfg.tasks.Buscar;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.ingjuanfg.exceptions.NoExisteElVideoBuscadoException.EXCEPCION_MENSAJE_BUSQUEDA_SIN_RESULTADOS;
import static co.com.ingjuanfg.model.builders.VideoBuilder.video;
import static co.com.ingjuanfg.utils.MenuConstantes.YOUTUBE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BuscarVideoYoutubeStepDefinition {

    @Before
    public void prepararEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que (.*) quiere ver un video$")
    public void queJuanQuiereVerUnVideo(String actor) {
        theActorCalled(actor).attemptsTo(
                AbrirPagina.deGoogle(),
                Seleccionar.opcionGoogle(YOUTUBE)
        );
    }

    @Cuando("^el busca el video (.*) de (.*)$")
    public void elBuscaElVideoPaidInFullSonataArctica(String nombreVideo, String artista) {
        theActorInTheSpotlight().attemptsTo(
                Buscar.el(video()
                        .conNombreVideo(nombreVideo)
                        .conArtista(artista))
        );
    }

    @Entonces("^el deberia de ver al menos un video listado$")
    public void elDeberiaDeVerAlMenosVideoListado() {
        theActorInTheSpotlight().should(seeThat(ResultadoBusqueda.esExitoso())
                .orComplainWith(NoExisteElVideoBuscadoException.class, EXCEPCION_MENSAJE_BUSQUEDA_SIN_RESULTADOS));
    }
}