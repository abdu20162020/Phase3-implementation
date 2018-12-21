package masroqa;
import java.util.*;

/**
 * 
 */
public class User {

    /**
     * Default constructor
     */
    public User(){
    }

    /**
     * 
     */
    private String Name;

    /**
     * 
     */
    private String Email;

    /**
     * 
     */
    private String Password;

    /**
     * 
     */
    private int User_id;

    /**
     * 
     */
    private String Phone;

    /**
     * 
     */
    private String Type;

    /**
     * 
     */
    private String Gender;
    /**
     * @param name
     */
    public void setName(String name) {
        // TODO implement here
        this.Name=name;
    }
    /**
     * @param email
     */
    public void setEmail(String email) {
        // TODO implement here
        this.Email=email;
    }
    /**
     * @param password
     */
    public void setPassword(String password) {
        // TODO implement here
        this.Password=password;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        // TODO implement here
        this.Type=type;
    }
    public void setUserid(int userid) {
        // TODO implement here
        this.User_id=userid;
    }

    /**
     * @param gender
     */
    public void setGender(String gender) {
        // TODO implement here
        this.Gender=gender;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        // TODO implement here
        this.Phone=phone;
    }

    /**
     * @return
     */
    public String getName() {
        // TODO implement here
        return this.Name;
    }

    /**
     * @return
     */
    public String getEmail() {
        // TODO implement here
        return this.Email;
    }

    /**
     * @return
     */
    public String getPassword() {
        // TODO implement here
        return this.Password;
    }

    /**
     * @return
     */
    public String getType() {
        // TODO implement here
        return this.Type;
    }

    /**
     * @return
     */
    public String getGender() {
        // TODO implement here
        return this.Gender;
    }

    /**
     * @return
     */
    public String getPhone() {
        // TODO implement here
        return this.Phone;
    }
        /**
     * @return
     */
    public int getUserId() {
        // TODO implement here
        return this.User_id;
    }


}