package masroqa;
import java.util.*;

/**
 * 
 */
public class AdminController {

    /**
     * Default constructor
     */
    public AdminController() {
    }
Scanner read=new Scanner(System.in);




    /**
     * @param PostID
     */
    public void deletePost(int PostID,int CTid,PostModel posts) {
        // TODO implement here
        posts.deletePost(PostID,CTid);
    }

    /**
     * @param userid
     */
    public void checkDeleteU(String email,String Passwor,UserModel users) {
        // TODO implement here
        
        
        User u=new User();
        u=users.reteriveUser(email, Passwor);
        if(u==null){
        System.out.println("Deleted fail");
        }
        else{
        users.deleteUser(u.getUserId());}
    }

    /**
     * @param categoryid
     */
    public  Set<Post>  checkCategoryID(int categoryid,PostModel post) {
        // TODO implement here
            while (categoryid < 1 && categoryid > 4) {
            System.out.println("Warning");
            System.out.println("Enter the number of category that u want to add ur post in it ");
            System.out.println("Enter 1 to choose laptop&mobile category");
            System.out.println("Enter 2 to choose personal_document category");
            System.out.println("Enter 3 to choose personalthing category");
            System.out.println("Enter 4 to choose jewelry category");
            categoryid = read.nextInt();
        }
            Set<Post> postCT =new HashSet();
            postCT=post.reteriveallPost(categoryid);
            return postCT;
    }

    /**
     * 
     */
    public void desplayPosts() {
        // TODO implement here
    }

}