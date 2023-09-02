package org.example.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class UserInterfaceElements {
    public static final Target SEARCH_INPUT = Target.the("Search input").locatedBy("//*[@id=\"searchBox\"]");
    public static final Target SEARCH_BUTTON = Target.the("Search button").locatedBy("//*[@id=\"basic-addon2\"]/span/svg");
    public static final Target ADD_TO_COLLECTION_BUTTON = Target.the("Add to collection button").locatedBy("//*[@id=\"see-book-Git Pocket Guide\"]/a");
    public static final Target PROFILE_LINK = Target.the("Profile link").locatedBy("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div/div[4]/div[1]");
    public static final Target COLLECTION_TAB = Target.the("Collection tab").locatedBy("#collectionTab");
    public static final Target DELETE_BOOK_BUTTON = Target.the("Delete book button").locatedBy(".delete-record");
}