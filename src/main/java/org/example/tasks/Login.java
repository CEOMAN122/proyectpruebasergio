package org.example.tasks;

import org.example.userinterface.UserInterfaceElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {
    private final String username;

    public Login(String username) {
        this.username = username;
    }

    public static Login withUsername(String username) {
        return instrumented(Login.class, username);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UserInterfaceElements.PROFILE_LINK),
                Enter.theValue(username).into(UserInterfaceElements.SEARCH_INPUT),
                Click.on(UserInterfaceElements.SEARCH_BUTTON)
        );
    }
}
