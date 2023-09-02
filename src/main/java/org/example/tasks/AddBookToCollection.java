package org.example.tasks;

import org.example.userinterface.UserInterfaceElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddBookToCollection implements Task {
    public static AddBookToCollection fromRandomBooks() {
        return instrumented(AddBookToCollection.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UserInterfaceElements.ADD_TO_COLLECTION_BUTTON)
        );
    }
}
