
public class UserManager{
   
	  public void add(User user) {
		  
		  System.out.println("Ba�ar�yla eklendi : "+ user.getFirstName() + " " + user.getLastName());  
	  }
	  
	  public void delete(User user) {
		  System.out.println("Ba�ar�yla silindi : "+user.getFirstName() + " " + user.getLastName());
	  }
	  
	  public void addMultiple(User[] users) {
			for (User user : users) {
				add(user);
			}
		}
}
