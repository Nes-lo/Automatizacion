package co.devco.automatizacion.task;

import co.devco.automatizacion.exceptions.AuthenticationError;
import co.devco.automatizacion.model.Credentials;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.devco.automatizacion.exceptions.AuthenticationError.MESSAGE_FAILED_AUTHENTICATION;

import static co.devco.automatizacion.userinterface.DemoBlazeHomePage.CATEGORY_MENU;
import static co.devco.automatizacion.userinterface.LoginPage.*;
import static co.devco.automatizacion.userinterface.MenuPage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class Authenticate implements Task {
    private final Credentials credentials;

    public Authenticate(Credentials credentials) {

        this.credentials = credentials;

    }



    @Override
    @Step("{0} performs an authentication")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                 Click.on(LOG_IN_MENU),
                Enter.theValue(credentials.getUsername()).into(USERNAME),
                Enter.theValue(credentials.getPassword()).into(PASSWORD),
                Click.on(LOG_IN_BUTTON),
                WaitUntil.the(LOG_OUT_MENU, isClickable()).forNoMoreThan(10).seconds()
        );


        actor.should(seeThat(the(LOG_OUT_MENU),isVisible())
                .orComplainWith(AuthenticationError.class,MESSAGE_FAILED_AUTHENTICATION));

    }

    public  static Authenticate authenticate(Credentials credentials){

        return instrumented(Authenticate.class,credentials);

    }


}
