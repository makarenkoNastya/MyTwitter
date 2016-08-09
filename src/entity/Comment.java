package entity;

import java.util.Calendar;

/**
 * Created by Nastya on 05.08.2016.
 */
public class Comment {
    private Long id;
    private String text;
    private Calendar date;

    public Comment(){
        this.date = Calendar.getInstance();
    }

    public Comment(String text){
        this();
        this.text = text;
    }
}
