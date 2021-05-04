
public class InstructorManager  extends UserManager{

	
	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName()+ " eðitmenimiz baþarýyla eklenmiþtir.");
	}
	
	public void delete(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName()+ " eðitmenimiz silinmiþtir.");
	}
}
