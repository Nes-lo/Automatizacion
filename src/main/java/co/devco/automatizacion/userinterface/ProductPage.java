package co.devco.automatizacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductPage {


   public static final Target ADD_TO_CART_BUTTON = Target.the("Add to cart button")
           .located(By.linkText("Add to cart"));

}
