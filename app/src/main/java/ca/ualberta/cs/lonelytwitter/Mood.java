package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class Mood {

    protected Date date;
    protected String moodMsg;

    public Mood(){

        this.date=date;
        this.moodMsg="I have no mood - I AM ROBOT";

    }
    public abstract Date getDate();
    public abstract void setDate();

}
