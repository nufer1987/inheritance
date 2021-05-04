
public class Student extends User {

	
	private String university;
	private String telNo;
	
	public Student () {
		
	}
	 
	public Student (int id, String firstName, String lastName, String email, String password, String university, String telNo) {
		this.university = university;
		this.telNo = telNo;		
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	

	
     
	
}
