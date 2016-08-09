package service;

import entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * Created by Nastya on 05.08.2016.
 */
public class MenuService {

    Scanner sc = new Scanner(System.in);
    User user = new User();
    UserService userService = new UserService();
    List<User> users = new ArrayList<User>();

    public void showMenu(){

        System.out.println("_____________________M E N U____________________");
        System.out.println("1 -> Register new user");
        System.out.println("2 -> Show users");

        int choice = sc.nextInt();

        switch (choice){
            case 1 : register();
                break;
            case 2 : show();
                break;
            default :
                System.out.println("Input error:(");
                break;
        }
    }

    public void register(){
       user = userService.registerNewUser();
       users.add(user);
       System.out.println("Success;)");
       showMenu();
    }

    public void show(){
        for (User thisUser : users){
            userService.showUser(thisUser);
        }
        showMenu();
    }



}
