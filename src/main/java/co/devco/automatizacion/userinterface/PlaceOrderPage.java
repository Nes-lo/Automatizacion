package co.devco.automatizacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PlaceOrderPage {

    public static final Target NAME=Target.the("name")
            .located(By.id("name"));

    public static final Target COUNTRY=Target.the("country")
            .located(By.id("country"));

    public static final Target CITY=Target.the("city")
            .located(By.id("city"));

    public static final Target CREDIT_CARD=Target.the("card")
            .located(By.id("card"));

    public static final Target MONTH=Target.the("month")
            .located(By.id("month"));

    public static final Target YEAR=Target.the("year")
            .located(By.id("year"));




    public static final Target PURCHASE_ORDER =Target.the("Purcharse button")
            .located(By.linkText("purchaseOrder()"));


}
