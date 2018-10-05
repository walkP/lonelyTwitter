/*
 * Copyright (c) Team X, CMPUT301, University of Alberta - All Rights Reserved. You may use, distribute,
 * or modify this code under terms and conditions of the Code of Students Behavior at University of Alberta
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;


/**
 * Represents a Tweet
 *
 * @author Walker Peters
 * @version 1.0
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 */

public abstract class Tweet implements Tweetable {

    private Date date;
    private String message;
    private static final Integer MAX_CHARS = 140;

    /**
     * Constructs Tweet objects
     *
     */
    Tweet() {
        //Must use the 'this' keyword in order to specify the current object message = message does nothing!
        this.date = new Date();
        this.message = "I am default message schwa!";
    }

    /**
     * Constructs Tweet objects
     *
     * @param message tweet message
     */
    Tweet(String message) {
        this.date = new Date();
        this.message = message;
    }

    /**
     * Method for getting message
     *
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Sets a Tweet message
     *
     * @param message tweet message
     * @throws TweetTooLongException
     */
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() <= this.MAX_CHARS) {
            this.message = message;
        } else {
            throw new TweetTooLongException();
        }
    }

    /**
     * Gets a Tweet date
     *
     */
    public Date getDate() {
        return this.date;
    }

    /**
     * Says if a tweet is important
     *
     */
    public abstract Boolean isImportant();

    ArrayList<Mood> moods = new ArrayList<Mood>();

    /**
     * toString method for a Tweet
     *
     */
    public String toString() {

        return date.toString() + " | " + message;
    }
}
