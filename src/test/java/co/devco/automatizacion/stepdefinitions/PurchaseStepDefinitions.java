package co.devco.automatizacion.stepdefinitions;

import co.devco.automatizacion.exceptions.AuthenticationError;
import co.devco.automatizacion.model.Product;
import co.devco.automatizacion.model.Purchaser;
import co.devco.automatizacion.task.Add;
import co.devco.automatizacion.userinterface.DemoBlazeHomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.devco.automatizacion.exceptions.AuthenticationError.MESSAGE_FAILED_AUTHENTICATION;
import static co.devco.automatizacion.model.Purchaser.PURCHASER_INFORMATION;
import static co.devco.automatizacion.model.PurchaserFactory.createByName;
import static co.devco.automatizacion.questions.PurchaseSuccessful.thePurchaseIsSuccessful;
import static co.devco.automatizacion.task.Authenticate.authenticate;
import static co.devco.automatizacion.task.Buy.buy;
import static co.devco.automatizacion.userinterface.MenuPage.LOG_OUT_MENU;
import static co.devco.automatizacion.userinterface.PlaceOrderPage.MESSAGE_SUCCESS_PURCHASE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class PurchaseStepDefinitions {

    private DemoBlazeHomePage homePage;

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) is authenticated$")
    public void authenticateActor(String actorName) {
        Purchaser aPurchaser = createByName(actorName);
        theActorCalled(aPurchaser.getName()).attemptsTo(
                Open.browserOn(homePage),
                authenticate(aPurchaser.getCredentials())
        );
        theActorInTheSpotlight().remember(PURCHASER_INFORMATION, aPurchaser);
    }

    @Given("^add from (.*) [a-z]{1,2} (.*)$")
    public void addToCart(String category, String product) {
        Product aProduct = Product.builder().category(category).name(product).build();

        theActorInTheSpotlight().wasAbleTo(
                Add.toCart(aProduct)
        );
    }

    @When("^[a-zA-Z]{3,50} makes the purchase$")
    public void purchase() {
        theActorInTheSpotlight().attemptsTo(
                buy()
        );
    }

    @Then("should see the message Thank you for your purchase")
    public void shouldSeeTheMessageThankYouForYourPurchase() {
        // theActorInTheSpotlight().should(seeThat(the(MESSAGE_SUCCESS_PURCHASE), isVisible()));
        theActorInTheSpotlight().should(seeThat(thePurchaseIsSuccessful()));
    }
}