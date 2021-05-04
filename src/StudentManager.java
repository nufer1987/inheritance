
public class StudentManager extends UserManager{
    
	
	public void add(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName()+ " isimli ��rencimiz ba�ar�yla sisteme eklendi.");
	}
	
	public void delete(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName()+ " isimli ��rencimiz ba�ar�yla sistemden silinmi�tir.");
	}
	
	public void addMultiple(Student[] students) {
		for (Student student : students) {
			add(student);
		}
	}
	
	
}
