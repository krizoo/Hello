import java.util.ArrayList;
import java.util.Scanner;


public class Driver {

     private static User currentUser;
     
     private static ArrayList<User> userList;
  private static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
     currentUser = new User("Columbus", "12345678");
    System.out.println(currentUser);
    
    for (int i=0; i<5 ; i++){
    	userList= new ArrayList<>();
    	String holder = "";
     String pass ="";
    	
    	System.out.println("Enter Username " + i);
    	 holder = keyboard.next();
    	 if(holder!=""){
    			 System.out.println("Enter " + holder + " Password ");
    			
    			   pass=keyboard.next();
    	 }
    	  userList.add(new User(holder, pass));
    	 
    }
     
    
		
	}

}
