package masroqa;
import java.util.*;


/**
 * 
 */
public class UserView {

    /**
     * Default constructor
     */
    public UserView() {
    }
    /**
     * 
     */
    Scanner read=new Scanner(System.in);
    public User login(UserModel usres) {
        // TODO implement here
        User_Controller c=new User_Controller();
        User u=new User();
         System.out.println("Enter your email ");
        String email=read.next();
          System.out.println("Enter your password");
        String password=read.next();
        u=c.checkLogin(email, password,usres);
        return u;
    }

    /**
     * 
     */
    public void regesteration(int user_id,UserModel users) {
        // TODO implement here
        
          System.out.println("Enter your name ");
        String name=read.next();
          System.out.println("Enter your email");
        String email=read.next();
          System.out.println("Enter your type (admin or normal user)");
        String Type=read.next(); 
          while ((!(Type.equals("A")) && !(Type.equals("N")))) {
             System.out.println("Please enter correct information (specify your type)");
                 Type=read.next(); 
            }
           System.out.println("Enter passwoed");
        String password=read.next();
          System.out.println("Enter your phone number");
        String phone=read.next();
          System.out.println("Enter your gender");
        String Gender=read.next();
         
        if(name.equals(" ")||email.equals(" ")||Type.equals(" ")||password.equals(" ")||phone.equals(" ")|name.equals(" ")){
        System.out.println("Enter write information");
        regesteration(user_id,users);
        }
       
        else{
         User_Controller c=new User_Controller();
       c.checkRegesteration(name,email,password,Type,Gender,user_id,users);
        System.out.println("Reqestration OK");
        }
    }

}