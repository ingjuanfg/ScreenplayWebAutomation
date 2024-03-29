package co.com.ingjuanfg.stepdefinitions;

import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Entonces;
import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class PruebaAutomatizacionStepDefinition {

    @Cuando("(.*) hace lo que sea")
    public void juanImprime(String nombre) {
        theActorCalled(nombre);
    }


    @Cuando("^Juan imprime la info del datatable$")
    public void juanImprime(DataTable infoUsuario) {
        List<Map<String, String>> informacion = infoUsuario.asMaps(String.class, String.class);
        for (int i = 0; i < informacion.size(); i++) {
            System.out.println(informacion.get(i).get("apellido"));
            System.out.println(informacion.get(i).get("direccion"));
            System.out.println(informacion.get(i).get("telefono"));
            System.out.println(informacion.get(i).get("marca"));
        }
    }

    @Entonces("^el deberia de ver la info$")
    public void elDeberiaDeVerSuApellidoEnConsola() {
        System.out.println("Estoy en el entonces");
    }
}