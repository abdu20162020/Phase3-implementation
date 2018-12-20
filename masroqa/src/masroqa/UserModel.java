package masroqa;

import java.io.BufferedInputStream;

import java.util.*;


/**
 *
 */
public class UserModel{

    /**
     * Default constructor
     */
    public UserModel() {
    }

    /**
     *
     */
    public Vector<User> users_db = new Vector<User>();

    /**
     * @param user
     */
    public void insertUser(User user) {
        // TODO implement here
        users_db.add(user);
    }

    /**
     * @param userID
     */
    public void deleteUser(int userID) {
        // TODO implement here
        for (int i = 0; i < users_db.size(); i++) {
            User u = new User();
            u = users_db.get(i);
            if (u.getUserId() == userID) {
                users_db.remove(i);
                System.out.println("Delete successful ");
                break;

            }

        }
        

    }

    /**
     * @param email
     * @param password
     */
    public User reteriveUser(String email, String password) {
        // TODO implement here
        for (User temp : users_db) {
            if (temp.getEmail().equals(email) && temp.getPassword().equals(password)) {
                return temp;

            }

        }

        return null;
    }

    public void readAllUser() {
      
    }

    public void WriteAllUser() {
   

    }
}
