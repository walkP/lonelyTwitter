package ca.ualberta.cs.lonelytwitter;

/**
 * Exception thrown by a tweet
 *
 * @author Walker Peters
 * @version 1.0
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 */

public class TweetTooLongException extends Exception {

    /**
     * Tweet too long Exception
     *
     */
    TweetTooLongException() {
        super("The message is too long! Please keep your tweets within 140 characters.");
    }
}
