
public class InstructorManager  extends UserManager{

	
	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName()+ " eğitmenimiz başarıyla eklenmiştir.");
	}
	
	public void delete(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName()+ " eğitmenimiz silinmiştir.");
	}
}
