package co.devco.automatizacion.userinterface;



import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://www.demoblaze.com/")
public class DemoBlazeHomePage extends PageObject {

    public static final Target LOG_IN_MENU =Target.the("Log in menu").located(By.id("login2"));


    public static final Target CATEGORIES_MONITORS =Target.the("Monitors")
            .located(By.linkText("byCat('monitor')"));


    public static final Target CART =Target.the("Cart").located(By.id("cartur"));

    public static final Target PLACE_ORDER =Target.the("Place Order")
            .located(By.className("btn btn-success"));


}
