package masroqa;

import java.util.*;

/**
 *
 */
public class PostModel {

    /**
     * Default constructor
     */
    public PostModel() {
    }

    /**
     *
     */
    public Vector<Post> posts_db = new Vector<Post>();

    /**
     * @param post
     */
    public void insertPost(Post post) {
        // TODO implement here
        posts_db.add(post);
    }

    /**
     * @param postID
     */
    public void deletePost(int postID, int CTid) {
        // TODO implement here
        int index = -1;
        for (int i = 0; i < posts_db.size(); i++) {

            Post temp = new Post();
            temp = posts_db.get(i);
            if (temp.postID == postID && temp.categoryID == CTid) {
                index = i;
                break;
            }

        }
        if (index == -1) {
            System.out.println("U enter wrong post ID number ");
        } else {
            posts_db.remove(index);
            System.out.println("Delete successful");

        }
    }

    /**
     * @param userid
     */
    public void deletePostuser(int postID, int userid){
        int index = -1;
        Set<Post> set = new HashSet<Post>();
set.addAll(posts_db);
posts_db.clear();
posts_db.addAll(set);
        for (int i = 0; i < posts_db.size(); i++) {

            Post temp = new Post();
            temp = posts_db.get(i);
            if (temp.postID == postID && temp.userID == userid) {
                index = i;
                break;
            }

        }
        if (index == -1) {
            System.out.println("U enter wrong post ID number ");
        } else {
           
            posts_db.remove(index);
            System.out.println("Delete successful");

        }
    }
    public Set<Post> reterivemyPost(int userid) {
        // TODO implement here
        Set<Post> set = new HashSet<Post>();
set.addAll(posts_db);
posts_db.clear();
posts_db.addAll(set);
        Set<Post> mypost=new HashSet(); 
        mypost.clear();
        for (Post temp : this.posts_db) {
            if (temp.userID == userid) {
              
                mypost.add(temp);

            }

        }
        
        return mypost;

    }

    /**
     * @param categoryid
     */
    public Set<Post> reteriveallPost(int categoryid) {
        // TODO implement here
Set<Post> set = new HashSet<Post>();
set.addAll(posts_db);
posts_db.clear();
posts_db.addAll(set);
        Set<Post> post_ct=new HashSet();  ;

        for (Post temp : posts_db) {
            if (temp.categoryID == categoryid) {
                post_ct.add(temp);

            }

        }
        return post_ct;
    }

    /**
     * @param postID
     */
    public void reteriveselectedPost(int postID, int userid) {
        // TODO implement here
       deletePostuser(postID,userid);
    }

    /**
     * @param postID
     * @param answer
     */
    public void insertAnswer(int postID, Answer answer) {
        // TODO implement here
    }

    public int index(int CTid, int post_id) {
        int ind = -1;
        Set<Post> set = new HashSet<Post>();
set.addAll(posts_db);
posts_db.clear();
posts_db.addAll(set);
        for (int i = 0; i < posts_db.size(); i++) {

            Post temp = new Post();
            temp = posts_db.get(i);

            if (temp.categoryID == CTid && temp.postID == post_id) {
                ind = i;
                break;

            }

        }
        return ind;

    }

}
