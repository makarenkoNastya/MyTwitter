package entity;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Nastya on 05.08.2016.
 */
public class Publication {

    private Long id;
    private String text;
    private int likes;
    private int dislikes;
    private Calendar date;
    private List<Comment> comments;

    public Publication(){
        this.date = Calendar.getInstance();
    }

    public Publication(String text){
        this();
        this.text = text;
    }

    public String getText(){
        return this.text;
    }

    public Date getDate(){
        return this.date.getTime();
    }
}
