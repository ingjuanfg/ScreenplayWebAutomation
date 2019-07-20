package co.com.ingjuanfg.stepdefinitions.google;

import co.com.ingjuanfg.interactions.AbrirNavegador;
import co.com.ingjuanfg.interactions.SeleccionarOpcion;
import co.com.ingjuanfg.tasks.IniciarSesion;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EnviarCorreoGmailStepDefinition {

    @Dado("^(.*) se encuentra en la pagina de Gmail$")
    public void juanSeEncuentraEnLaPaginaDeGmail(String nombreActor) {
        theActorCalled(nombreActor).attemptsTo(
                AbrirNavegador.enPaginaGoogle(),
                SeleccionarOpcion.gmail()
        );
    }

    @Cuando("^El envia un correo electronico a (.*)$")
    public void elEnviaUnCorreoElectronicoAPruebavalidacionchGmailCom(String correoDestinatario) {
        theActorInTheSpotlight().attemptsTo(
                IniciarSesion.conCredenciales()
        );
    }

    @Entonces("^Deberia de ver un mensaje de confirmacion$")
    public void deberiaDeVerUnMensajeDeConfirmacion() {

    }

}
