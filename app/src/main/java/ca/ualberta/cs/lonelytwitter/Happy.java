package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class Happy extends Mood {

    @Override
    public void setDate(){
        this.date=date;
    }
    @Override
    public Date getDate(){
        return this.date;
    }
    public Happy(){

        this.date=date;
        this.moodMsg="I am Happy";
    }
    public Happy(Date date2){

        this.date=date2;
        this.moodMsg="I am Happy";
    }
}
