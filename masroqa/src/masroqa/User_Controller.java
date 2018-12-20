package masroqa;
import java.util.*;

/**
 * 
 */
public class User_Controller {

    /**
     * Default constructor
     */
    public User_Controller() {
    }

    /**
     * 
     */
    private User user=new User();

    /**
     * 
     */





    /**
     * @param email 
     * @param password
     */
    public User checkLogin(String email, String password,UserModel usres) {
        // TODO implement here
        User u=new User();
        u=usres.reteriveUser(email, password);
        return u;
    }

    /**
     * @param name 
     * @param email 
     * @param password 
     * @param type 
     * @param gender
     */
    public  void checkRegesteration(String name, String email, String password, String type, String gender,int user_id,UserModel users) {
        // TODO implement here
        user.setName(name);
        user.setEmail(email);
        user.setGender(gender);
        user.setPassword(password);
        user.setPhone(type);
        user.setType(type);
        user.setUserid(user_id);
        users.insertUser(user);
        
    }

}