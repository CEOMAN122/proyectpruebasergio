package org.example.tasks;

import org.example.userinterface.UserInterfaceElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchForBook implements Task {
    private final String bookTitle;

    public SearchForBook(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public static SearchForBook withTitle(String bookTitle) {
        return instrumented(SearchForBook.class, bookTitle);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(bookTitle).into(UserInterfaceElements.SEARCH_INPUT),
                Click.on(UserInterfaceElements.SEARCH_BUTTON)
        );
    }
}
