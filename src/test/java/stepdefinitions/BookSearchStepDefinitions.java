package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.questions.BookAddedToCollection;

import org.example.questions.NoBooksInCollection;
import org.example.tasks.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class BookSearchStepDefinitions {

    @Given("^I am on the demoqa.com/books page$")
    public void iAmOnTheDemoqaComBooksPage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("^I search for a book with title \"([^\"]*)\"$")
    public void iSearchForABookWithTitle(String bookTitle) {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchForBook.withTitle(bookTitle));
    }

    @When("^I search for a non-existent book with title \"([^\"]*)\"$")
    public void iSearchForANonExistentBookWithTitle(String bookTitle) {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchForNonExistentBook.withTitle(bookTitle));
    }

    @When("^I add a book to my collection$")
    public void iAddABookToMyCollection() {
        OnStage.theActorInTheSpotlight().attemptsTo(AddBookToCollection.fromRandomBooks());
    }

    @When("^I delete the book from my collection$")
    public void iDeleteTheBookFromMyCollection() {
        OnStage.theActorInTheSpotlight().attemptsTo(DeleteBook.fromCollection());
    }

    @Then("^I should see the book added to my collection$")
    public void iShouldSeeTheBookAddedToMyCollection() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(BookAddedToCollection.successfully(), is(true))
        );
    }

    @Then("^I should see an error message$")
    public void iShouldSeeAnErrorMessage() {
        // Implementar la verificación del mensaje de error si es necesario
    }

    @Then("^I should see no books in my collection$")
    public void iShouldSeeNoBooksInMyCollection() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(NoBooksInCollection.successfully(), is(true))
        );
    }
}
