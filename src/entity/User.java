package entity;

import java.util.List;

/**
 * Created by Nastya on 05.08.2016.
 */
public class User {

    private Long id;
    private String login;
    private String pasword;
    private UserStatus status;
    private String name;
    private String surname;
    private int age;
    private List<Publication> publications;

    public User(){
        this.id = (long)Math.random()*100;
        this.status = UserStatus.STATUS_UNREGISTERED;
    }

    public User(String login, String password, String name, String surname, int age){
        this();
        this.status = UserStatus.STATUS_REGISTERED;
        this.login = login;
        this.pasword = password;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getLogin(){
        return this.login;
    }

    public UserStatus getStatus(){
        return this.status;
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

    public int getAge(){
        return this.age;
    }

    public List<Publication> getPublications(){
        return this.publications;
    }
}
