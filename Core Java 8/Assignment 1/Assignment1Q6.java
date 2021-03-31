import java.util.*;
class Login{
    String userId = "Ajay",password = "password";
    Scanner ob = new Scanner(System.in);
    public String loginUser(String user, String pass) {
    	int i = 1;
    	while( i < 3)
    	{
    		if(user.equals(userId) && pass.equals(password))
    		{
    			return "Welcome Ajay";	
    		}
    		else
    		{
    			System.out.println("You have entered wrong credentials ,please enter the right credentials.");
    			++i;
    			user = ob.nextLine();
    			pass = ob.nextLine();
    		}
    	}
        ob.close();
    	System.out.println("You have entered wrong credentials 3 times");
    	return "Contact Admin";

    }

}
public class Assignment1Q6 {
    public static void main(String[] args) {
    	Scanner ob = new Scanner(System.in);
    	String user, password, result;
    	System.out.println("Enter userId");
    	user = ob.nextLine();
    	System.out.println("Enter password");
    	password = ob.nextLine();
    	Login obj = new Login();
    	result = obj.loginUser(user, password);
    	System.out.println(result);
    	ob.close();
    }
}
