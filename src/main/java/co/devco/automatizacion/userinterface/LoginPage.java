package co.devco.automatizacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target USERNAME=Target.the("username")
            .located(By.id("loginusername"))
            .containingTextIgnoringCase("admin");
    public static final Target PASSWORD =Target.the("password")
            .located(By.id("loginpassword"))
            .containingText("admin");


    public static final Target LOG_IN_BUTTON =Target.the("Log in button").located(By.linkText("logIn()"));
    //campo username
    //campo de password
    //Boton


    //menu
    //mapear carro





}
