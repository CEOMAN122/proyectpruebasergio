package org.example.questions;

import org.example.userinterface.UserInterfaceElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class BookAddedToCollection implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return UserInterfaceElements.DELETE_BOOK_BUTTON.resolveFor(actor).isVisible();
    }

    public static BookAddedToCollection successfully() {
        return new BookAddedToCollection();
    }
}
