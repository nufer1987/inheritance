
public class UserManager{
   
	  public void add(User user) {
		  
		  System.out.println("Baþarýyla eklendi : "+ user.getFirstName() + " " + user.getLastName());  
	  }
	  
	  public void delete(User user) {
		  System.out.println("Baþarýyla silindi : "+user.getFirstName() + " " + user.getLastName());
	  }
	  
	  public void addMultiple(User[] users) {
			for (User user : users) {
				add(user);
			}
		}
}
