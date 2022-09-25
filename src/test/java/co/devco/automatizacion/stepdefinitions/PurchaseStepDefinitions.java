package co.devco.automatizacion.stepdefinitions;

import co.devco.automatizacion.userinterface.DemoBlazeHomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenAt;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.devco.automatizacion.userinterface.DemoBlazeHomePage.LOG_IN_MENU;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class PurchaseStepDefinitions {

    private DemoBlazeHomePage homePage;

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());


    }



    @Given("^(.*) is authenticated")
    public void authenticated(String actorName) {

        /**
        *Actor-habilidades
        *      Tareas   - Grupo de Interacciones
        *      Interacciones - Interface
         */
        /**
         *  Performable ---- Task
         *              ---- Actions
         *              ---- Interactions
         */
        /**
         * Selenium -WeDriver  by
         *          -WebElement
         *
         *Serenity - WebElementFacade
         *         - Target
         */

        theActorCalled(actorName).attemptsTo(
                Open.browserOn(homePage),
                Click.on(LOG_IN_MENU)//,                //goToMenu("log in"),

              //  authenticatedWithUsername("admin").andPassword("****")


        );

        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("^add from (.*) [a-z]{1,2} (.*)$")
    public void addToCart(String category,String product) {
        // Write code here that turns the phrase above into concrete actions

        theActorInTheSpotlight().wasAbleTo(



        );
        throw new io.cucumber.java.PendingException();
    }

    @When("^[a-zA-Z]{3,50} makes the purchase$")
    public void purchase() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("should see the message thank you for your purchase")
    public void shouldSeeTheMessageThankYouForYourPurchase() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
