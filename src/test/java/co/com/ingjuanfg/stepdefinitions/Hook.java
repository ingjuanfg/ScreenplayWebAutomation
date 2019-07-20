package co.com.ingjuanfg.stepdefinitions;


import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {

    @Before("@Unico")
    public void imprimirCualquierCosa(){
        System.out.println("Estoy con la anotacion Before");
    }

    @Before("@Otro")
    public void otraCosa(){
        System.out.println("No tiene Unico");
    }

    @After("@Final")
    public void imprimirAfter(){
        System.out.println("Estoy en el After");
    }

}
