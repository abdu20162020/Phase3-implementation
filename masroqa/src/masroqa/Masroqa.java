/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masroqa;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author dell
 */
public class Masroqa {

    /**
     * @param args the command line arguments
     */
    public void run() {

        Scanner read = new Scanner(System.in);
        int counter = 0;
        int counter1 = 0;
        UserModel usres = new UserModel();
        PostModel posts = new PostModel();
        usres.readAllUser();
      
        while (true) {
            System.out.println("Enter number 1 to log in");
            System.out.println("Enter number 2 to sign up");
            System.out.println("Enter number 3 to close the program");
            int chose = read.nextInt();
            while (chose != 1 && chose != 2 && chose != 3) {
                System.out.println("Warning");
                System.out.println("Enter number 1 to log in");
                System.out.println("Enter number 2 to sign up");
                chose = read.nextInt();
            }

            if (chose == 2) {
                UserView userveiw = new UserView();
                userveiw.regesteration(counter, usres);
                counter++;
                continue;

            }
            if (chose == 3) {
                break;
            }
            User s = new User();
            UserView userveiw = new UserView();
            s = userveiw.login(usres);
            boolean flag = true;
            if (s == null) {
                flag = false;

            }
            if (flag) {
                while (s.getType().equals("A")) {
                    System.out.println("Enter 1 to delet post");
                    System.out.println("Enter 2 delet user");
                    System.out.println("Enter 3 to log out");
                    int choose = read.nextInt();
                    AdminView Aview = new AdminView();
                    if (choose == 1) {
                        Aview.listPostCategory(posts);
                        Aview.deletePostbyid(posts);
                    }
                    if (choose == 2) {
                        Aview.deleteUserInformation(usres);

                    }
                    if (choose == 3) {
                        break;

                    }

                }
                while (s.getType().equals("N")) {
                    System.out.println("Enter 1 to add post");
                    System.out.println("Enter 2 see my post");
                    System.out.println("Enter 3 to report_post ");
                    System.out.println("Enter 4 log out");
                    int choose = read.nextInt();
                    if (choose == 1) {
                        System.out.println("Enter the number of category that u want to add ur post in it ");
                        System.out.println("Enter 1 to choose laptop&mobile category");
                        System.out.println("Enter 2 to choose personal_document category");
                        System.out.println("Enter 3 to choose personal_thing category");
                        System.out.println("Enter 4 to choose jewelry category");
                        int choose_cat = read.nextInt();
                        while (choose_cat < 1 && choose_cat > 4) {
                            System.out.println("Warning");
                            System.out.println("Enter the number of category that u want to add ur post in it ");
                            System.out.println("Enter 1 to choose laptop&mobile category");
                            System.out.println("Enter 2 to choose personal_document category");
                            System.out.println("Enter 3 to choose personalthing category");
                            System.out.println("Enter 4 to choose jewelry category");
                            choose_cat = read.nextInt();
                        }
                        Postview postV = new Postview();
                        postV.addPost(posts, counter1, s.getUserId(), choose_cat);
                        counter1++;

                    }
                    if (choose == 2) {
                        System.out.println("Those are your posts");
                        Postview postV = new Postview();
                        postV.myPost(s.getUserId(), posts);
                        System.out.print("1 to delete post 2 to continue");
                        int delete = read.nextInt();
                        if (delete == 1) {
                            postV.deletePost(s.getUserId(), posts);
                        }

                    }
                    if (choose == 3) {

                        System.out.println("Enter the number of category that u want to search for lost item in it ");
                        System.out.println("Enter 1 to choose laptop&mobile category");
                        System.out.println("Enter 2 to choose personal_document category");
                        System.out.println("Enter 3 to choose personalthing category");
                        System.out.println("Enter 4 to choose jewelry category");
                        int choose_cat = read.nextInt();
                        while (choose_cat < 1 && choose_cat > 4) {
                            System.out.println("Warning");
                            System.out.println("Enter the number of category that u want to search for lost item in it ");
                            System.out.println("Enter 1 to choose laptop&mobile category");
                            System.out.println("Enter 2 to choose personal_document category");
                            System.out.println("Enter 3 to choose personalthing category");
                            System.out.println("Enter 4 to choose jewelry category");
                            choose_cat = read.nextInt();
                        }
                        Postview postV = new Postview();
                        Vector<Post> p = new Vector<Post>();
                        p = postV.listPostCategory(choose_cat, posts);
                        if (p.size() != 0) {
                            for (Post temp : p) {
                                System.out.println("\t" + "-------------------------------------------");
                                System.out.print("The description is ");
                                System.out.println(temp.description);
                                System.out.print("The location is ");
                                System.out.println(temp.location);
                                System.out.print("The post id is ");
                                System.out.println(temp.postID);
                                System.out.println("\t" + "-------------------------------------------");

                            }
                            postV.reportMissingItem(posts, choose_cat);

                        }

                    }
                    if (choose == 4) {
                        break;
                    }

                }

            }

        }
         
       
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Masroqa c = new Masroqa();
        c.run();
    }

}
