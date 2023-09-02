package org.example.questions;

import org.example.userinterface.UserInterfaceElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class NoBooksInCollection implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return UserInterfaceElements.DELETE_BOOK_BUTTON.resolveAllFor(actor).isEmpty();
    }

    public static NoBooksInCollection successfully() {
        return new NoBooksInCollection();
    }
}
