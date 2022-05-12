import java.util.InputMismatchException;

public class Staff extends Person{
	String staffId;
	String name;
	String email;
	String Grade;
	
	Staff(){
		
	}
	
	Staff(String staffId){
		this.staffId=staffId;
	}
	
	Staff(String staffId,String name,String email,String Grade){
		
		this.staffId=staffId;
		this.name=name;
		this.email=email;
		this.Grade=Grade;
		
	}
	
	
	Staff(String id, String address,String staffId,String name,String email,String Grade){
		super(id,address);
		this.staffId=staffId;
		this.name=name;
		this.email=email;
		this.Grade=Grade;
		
	}
	
	
	public String getStaffId() {
		return staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}
	public String toString() {
		return "Staff ID : "+staffId+", Name : "+name+"\nE-mail : "+email+
				", Grade : "+Grade;
	}
	

	@Override
	public boolean equals(Object o) {
		if(o instanceof Staff) {
		
		
		return staffId.equals(((Staff)o).staffId);
		}
		else
			
		return false;
	}
	

	
	
	public void Validate(int StaffId) throws StaffException {
		if(StaffId>9999) {
			
			throw new NumberFormatException("Id "+StaffId+ " is out of bound");
		}
		else if(StaffId<0) {
			
			
			throw new StaffException("Id cannot be negative");
			
		}
		else {
			System.out.println("ID "+StaffId+ " is valid");
		}
	}
	
	
	
	
}
