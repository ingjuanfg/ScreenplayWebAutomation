package co.com.ingjuanfg.stepdefinitions;


import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {

    @Before("@Unico")
    public void tagUnicoGherkin(){
        System.out.println("Estoy con la anotacion Before y tag UNICO");
    }

    @Before("@Otro")
    public void tagOtroGherkin(){
        System.out.println("Estoy con el Tag OTRO");
    }

    @After("@Final")
    public void tagFinalGherkin(){
        System.out.println("Estoy con el tag FINAL");
    }
}
