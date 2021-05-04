
public class StudentManager extends UserManager{
    
	
	public void add(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName()+ " isimli öğrencimiz başarıyla sisteme eklendi.");
	}
	
	public void delete(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName()+ " isimli öğrencimiz başarıyla sistemden silinmiştir.");
	}
	
	public void addMultiple(Student[] students) {
		for (Student student : students) {
			add(student);
		}
	}
	
	
}
