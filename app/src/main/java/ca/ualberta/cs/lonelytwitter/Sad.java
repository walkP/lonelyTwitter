package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class Sad extends Mood {

    @Override
    public void setDate(){
        this.date=date;
    }
    @Override
    public Date getDate(){
        return this.date;
    }
    public Sad(){

        this.date=date;
        this.moodMsg="I am sad";
    }
    public Sad(Date date2){

        this.date=date2;
        this.moodMsg="I am sad";
    }
}
