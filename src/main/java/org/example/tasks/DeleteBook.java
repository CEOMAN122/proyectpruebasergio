package org.example.tasks;

import org.example.userinterface.UserInterfaceElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DeleteBook implements Task {
    public static DeleteBook fromCollection() {
        return instrumented(DeleteBook.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UserInterfaceElements.DELETE_BOOK_BUTTON)
        );
    }
}
