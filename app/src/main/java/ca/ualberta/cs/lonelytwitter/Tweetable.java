package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * interfeace implemented by Tweet
 *
 * @author Walker Peters
 * @version 1.0
 * @since 1.0
 */

public interface Tweetable {

    public String getMessage();
    public Date getDate();

    public String toString();
}
