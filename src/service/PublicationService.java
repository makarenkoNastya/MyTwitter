package service;

import entity.Publication;
import entity.User;

import java.util.List;
import java.util.Scanner;

/**
 * Created by Nastya on 08.08.2016.
 */
public class PublicationService {
    User user = new User();
    Scanner sc = new Scanner(System.in);

    public Publication createNewPublication(){
        String text;
        System.out.println("Please, enter text of publication: ");
        text = sc.nextLine();
        return new Publication(text);
    }

    public void addPublication(User user, Publication publication){
        user.getPublications().add(publication);
    }

    public void showAllPublications(User user){
        List<Publication> publications = user.getPublications();
        for(Publication thisPublication : publications){
            System.out.println("Text: " + thisPublication.getText());
            System.out.println("Date: " + thisPublication.getDate());
        }
    }
}
