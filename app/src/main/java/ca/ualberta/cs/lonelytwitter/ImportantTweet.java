package ca.ualberta.cs.lonelytwitter;

/**
 * Represents an important Tweet
 *
 * @author Walker Peters
 * @version 1.0
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 */

public class ImportantTweet extends Tweet {


    /**
     * Constructs important Tweet objects
     *
     */
    ImportantTweet() {
        //Call the parent constructor to: avoid duplication!
        super();
    }

    /**
     * Constructs important Tweet objects
     *
     * @param message importantr Tweet message
     */
    ImportantTweet(String message) {
        super(message);
    }

    /**
     * Says if a tweet is important
     *
     */
    @Override
    public Boolean isImportant() {
        return true;
    }
}
