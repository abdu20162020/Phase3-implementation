package masroqa;

import java.util.*;

/**
 *
 */
public class AdminView {

    /**
     * Default constructor
     */
    Scanner read = new Scanner(System.in);

    public AdminView() {
    }

    /**
     *
     */
    int choose_cat ;
    public void listPostCategory(PostModel posts) {
        // TODO implement here
        System.out.println("Enter the number of category that u want to add ur post in it ");
        System.out.println("Enter 1 to choose laptop&mobile category");
        System.out.println("Enter 2 to choose personal_document category");
        System.out.println("Enter 3 to choose personal_thing category");
        System.out.println("Enter 4 to choose jewelry category");
        choose_cat = read.nextInt();
        AdminController Ac = new AdminController();
        Vector<Post> postCT = new Vector<Post>();
        postCT = Ac.checkCategoryID(choose_cat, posts);
        for (Post temp : postCT) {
            System.out.println("\t" + "-------------------------------------------");
            System.out.print("The description is ");
            System.out.println(temp.description);
            System.out.print("The location is ");
            System.out.println(temp.location);
            System.out.print("The post id is ");
            System.out.println(temp.postID);
            System.out.println("\t" + "-------------------------------------------");

        }

    }

    /**
     *
     */
    public void deleteUserInformation(UserModel users) {
        System.out.println("Enter the email of user that u want to delete");
        String email = read.next();
        System.out.println("Enter the password of user that u want to delete");
        String password = read.next();
        AdminController Acont = new AdminController();
        Acont.checkDeleteU(email, password, users);
        // TODO implement here
    }

    /**
     *
     */
    public void deletePostbyid(PostModel posts) {
        // TODO implement here
        System.out.print("Enter the Post ID that u want to delete ");
        int postid=read.nextInt();
        System.out.println();
         AdminController Ac = new AdminController();
         Ac.deletePost(postid,choose_cat,posts);
        
    }

}
