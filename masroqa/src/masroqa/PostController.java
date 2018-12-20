package masroqa;
import java.util.*;

/**
 * 
 */
public class PostController {

    /**
     * Default constructor
     */
    public PostController() {
    }
    /**
     * @param description 
     * @param userID 
     * @param image 
     * @param location 
     * @param CTid
     */
    public void checkPost(String description, int userID,  String location,int postId ,int CTid,PostModel posts) {
        // TODO implement here
        Post P=new Post();
        P.location=location;
        P.description=description;
        P.categoryID=CTid;
        P.postID=postId;
        P.userID=userID;
        posts.insertPost(P);       
    }
    /**
     * @param postID 
     * @param userid
     */
    public void checkDelete(int postID, int userid,PostModel posts) {
        // TODO implement here
        posts.reteriveselectedPost(postID,userid);
    }

    /**
     * @param PostID 
     * @param answer
     */
    public void ckeckAnswer(int index, Answer answer,PostModel posts) {
        // TODO implement here
        
        Post p=posts.posts_db.get(index);
        p.answer.add(answer);
        posts.posts_db.add(index, p);
    }

    /**
     * 
     */
    public void desplayPosts(int user_id) {
        // TODO implement here
    }
    /**
     * @param categoryid
     */
    public int checkCategoryID(int categoryid,int post_id,PostModel posts) {
        // TODO implement here
        
        return posts.index(categoryid, post_id);
    }
    /**
     * @param userID
     */
    public Vector<Post> desplayMyPosts(int userID,PostModel posts) {
        // TODO implement here
        Vector<Post> myposts=new Vector<Post>();
      myposts= posts.reterivemyPost(userID);
        return myposts;
    }
}