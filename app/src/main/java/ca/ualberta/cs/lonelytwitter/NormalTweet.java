package ca.ualberta.cs.lonelytwitter;

/**
 * Represents a normal Tweet
 *
 * @author Walker Peters
 * @version 1.0
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 */

public class NormalTweet extends Tweet {

    /**
     * Constructs normal Tweet objects
     *
     */
    NormalTweet() {
        super();
    }

    /**
     * Constructs  normal Tweet objects
     *
     * @param message normal Tweet
     */
    NormalTweet(String message) {
        super(message);
    }

    /**
     * Says if a tweet is normal
     *
     */
    @Override
    public Boolean isImportant() {
        return false;
    }
}
