
public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Sinem");
		student1.setLastName("Coşkun");
		student1.setEmail("example@gmail.com");
		student1.setPassword("12345");
		student1.setTelNo("05355355155");
		student1.setUniversity("İstanbul Gelişim Üniversitesi");
		
		
		Student student2 = new Student();
		student2.setId(2);
		student2.setFirstName("Esila");
		student2.setLastName("Arslantürk");
		student2.setEmail("example@gmail.com");
		student2.setPassword("78910");
		student2.setTelNo("05348967524");
		student2.setUniversity("İstanbul Kültür Üniversitesi");
		
		
		StudentManager studentManager = new StudentManager();
		
		Student[] students = { student1, student2 };
		studentManager.addMultiple(students);
		
		Instructor instructor = new Instructor();
		instructor.setId(3);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setEmail("endindemirog@gmail.com");
		instructor.setPassword("568978");
		instructor.setExperience("20 year");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.delete(instructor);
		
		UserManager userManager = new UserManager();
		User[] users = { student1, student2, instructor};
		userManager.addMultiple(users);

		
	} 

}
