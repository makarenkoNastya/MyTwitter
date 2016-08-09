package service;

import entity.User;

import java.util.Scanner;

/**
 * Created by Nastya on 05.08.2016.
 */
public class UserService {

    public final int adultAge = 18;
    Scanner sc = new Scanner(System.in);

    public User registerNewUser (){

        String login = "";
        String password = "";
        String name = "";
        String surname = "";
        int age = 0;
        int counter = 0;

        while(counter == 0){
            System.out.println("Please, enter login: ");
            login = sc.nextLine();
            System.out.println("Please, enter password: ");
            password = sc.nextLine();
            System.out.println("Please, enter name: ");
            name = sc.nextLine();
            System.out.println("Please, enter surname: ");
            surname = sc.nextLine();
            System.out.println("Please, enter your age: ");
            age = sc.nextInt();

            if (age < adultAge){
                System.out.println("Sorry:(  This website is only for those, who are older then 18");
            }else if(password.length() > 9 || password.length() < 5) {
                System.out.println("Wrong password format;(");
            }else{
                counter = 1;
            }


        }

        return new User(login, password, name, surname, age);

    }

    public void showUser(User user){
        System.out.println("Login: " + user.getLogin());
        System.out.println("Status: " + user.getStatus());
        System.out.println("Name: " + user.getName());
        System.out.println("Surname: " + user.getSurname());
        System.out.println("Age: " + user.getAge());
    }
}
