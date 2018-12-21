package masroqa;

import java.util.*;

/**
 *
 */
public class Postview {

    /**
     * Default constructor
     */
    public Postview() {
    }

    Scanner read = new Scanner(System.in);

    /**
     *
     */
    public void reportMissingItem(PostModel posts, int CTid) {
        // TODO implement here
        System.out.println("Enter the id of the post that u want to report to it ");
        int post_id = read.nextInt();
        PostController Pc = new PostController();
        int index = Pc.checkCategoryID(CTid, post_id, posts);
        int type = CTid;
        String location = "";
        String phone = "";
        String name = "";
        String serNum = "";
        String Color = "";
        String Description = "";
        String Golde_Caliber = "";
        String Gram = "";
        String Moele = "";
        String Document_number = "";
        String additionl_information = "";
        if (index == -1) {

            System.out.println("There is no post has this num");
            return;

        } else {

            System.out.println("Enter specefic location");
            location = read.next();
            System.out.println("Enter ur phone number");
            phone = read.next();
            System.out.println("Enter ur name");
            name = read.next();

            if (CTid == 1) {

                System.out.println("Enter the serNum ");
                serNum = read.next();
                System.out.println("Enter the Color ");
                Color = read.next();
                System.out.println("Enter the Moele ");
                Moele = read.next();

            } else if (CTid == 2) {
                System.out.println("Enter the Document_number ");
                Document_number = read.next();

            } else if (CTid == 3) {
                System.out.println("Enter Description ");
                Description = read.next();

            } else if (CTid == 4) {
                System.out.println("Enter the Golde_Caliber ");
                Golde_Caliber = read.next();
                System.out.println("Enter the Gram ");
                Gram = read.next();

            }
        }
        Answer Ans = new Answer();
        System.out.println("Do u want to add additionl_information");
        String choose_ad = read.next();
        if (choose_ad.equals("Y")) {
            System.out.println("Enter ur additionl_information");
            additionl_information = read.next();
            Ans.additional_info = additionl_information;
        }
        if (type == 1) {
            Ans.user_name = name;
            Ans.PhoneNum = phone;
            Ans.spac_location = location;
            Ans.type = type;
            Ans.serialNo = serNum;
            Ans.color = Color;
            Ans.model = Moele;
            Pc.ckeckAnswer(index, Ans, posts);
        } else if (type == 2) {
            Ans.user_name = name;
            Ans.PhoneNum = phone;
            Ans.spac_location = location;
            Ans.type = type;
            Ans.documentNum = Document_number;
            Pc.ckeckAnswer(index, Ans, posts);
        } else if (type == 3) {

            Ans.user_name = name;
            Ans.PhoneNum = phone;
            Ans.spac_location = location;
            Ans.type = type;
            Ans.Description = Description;
            Pc.ckeckAnswer(index, Ans, posts);
        } else if (type == 4) {

            Ans.user_name = name;
            Ans.PhoneNum = phone;
            Ans.spac_location = location;
            Ans.type = type;
            Ans.goldCaliber = Golde_Caliber;
            Ans.gram = Gram;
            Pc.ckeckAnswer(index, Ans, posts);
        }

    }

    /**
     *
     */
    public void addPost(PostModel posts, int postId, int userid, int choose_cat) {
        // TODO implement here
       
        System.out.println("Enter your Location ");
        String Location = read.next();
        System.out.println("Enter your Description");
        String Description = read.next();
        PostController Pc = new PostController();
        Pc.checkPost(Description, userid, Location, postId, choose_cat, posts);

    }

    /**
     *
     */
    public void deletePost(int userID,PostModel posts) {
        // TODO implement here
        System.out.println("Enter the ID of the post that u want to delete it ");
        int post_id=read.nextInt();
        PostController UserPost = new PostController();
        UserPost.checkDelete(post_id, userID,posts);
    }

    /**
     *
     */
    public Set<Post>listPostCategory(int CTid, PostModel posts) {
        // TODO implement here
        Set<Post> ps=new HashSet();
        ps = posts.reteriveallPost(CTid);

        return ps;

    }

    /**
     *
     */
    public void myPost(int userID, PostModel posts) {
        // TODO implement here
        PostController UserPost = new PostController();
        Set<Post> mypost=new HashSet(); 
        mypost.clear();
        mypost = UserPost.desplayMyPosts(userID, posts);
        if (mypost.size() == 0) {
            System.out.println("U have not any post");

        } else {

            for (Post temp :mypost) {
                
                System.out.println("-------------------------------------------");
                System.out.print("The description is ");
                System.out.println(temp.description);
                System.out.print("The location is ");
                System.out.println(temp.location);
                System.out.print("The post id is ");
                System.out.println(temp.postID);
                for (Answer temp1 : temp.answer) {
                   
                    System.out.println("The answers are :");

                    if (temp1.type == 1) {

                        System.out.print("The specefic location");
                        System.out.println(" " + temp1.spac_location);
                        System.out.print("The ur phone number");
                        System.out.println(" " + temp1.PhoneNum);
                        System.out.print("The ur name");
                        System.out.println(" " + temp1.user_name);
                        System.out.print("The the serNum ");
                        System.out.println(" " + temp1.serialNo);
                        System.out.print("The the Color ");
                        System.out.println(" " + temp1.color);
                        System.out.print("The the Moele ");
                        System.out.println(" " + temp1.model);
                        System.out.print("The additional info");
                        System.out.println(" " + temp1.additional_info);
                    }
                    if (temp1.type == 2) {
                        System.out.print("Where do you think you lost your thing ");
                        System.out.println(" " + temp1.spac_location);
                        System.out.print("The  phone number");
                        System.out.println(" " + temp1.PhoneNum);
                        System.out.print("The  name");
                        System.out.println(" " + temp1.user_name);
                        System.out.print("The  Document_number");
                        System.out.println(" " + temp1.documentNum);
                        System.out.print("The additional info");
                        System.out.println(" " + temp1.additional_info);
                    }
                    if (temp1.type == 3) {
                        System.out.print("The specefic location");
                        System.out.println(" " + temp1.spac_location);
                        System.out.print("The ur phone number");
                        System.out.println(" " + temp1.PhoneNum);
                        System.out.print("The ur name");
                        System.out.println(" " + temp1.user_name);
                        System.out.print("The Description");
                        System.out.println(" " + temp1.Description);
                        System.out.print("The additional info");
                        System.out.println(" " + temp1.additional_info);

                    }
                    if (temp1.type == 4) {
                        System.out.print("The specefic location");
                        System.out.println(" " + temp1.spac_location);
                        System.out.print("The ur phone number");
                        System.out.println(" " + temp1.PhoneNum);
                        System.out.print("The ur name");
                        System.out.println(" " + temp1.user_name);
                        System.out.print("The the Golde_Caliber");
                        System.out.println(" " + temp1.goldCaliber);
                        System.out.print("The the Gram ");
                        System.out.println(" " + temp1.gram);
                        System.out.print("The additional info");
                        System.out.println(" " + temp1.additional_info);
                    }
                    
                }
                

            }

        }

    }

    /**
     *
     */
    public void desplayPosts() {
        // TODO implement here
    }

}
