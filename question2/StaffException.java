
public class StaffException extends Exception {
	
	int staffId;
	String Gradex;
	
	StaffException(String str){
		super(str);
	}
	
	StaffException(String StaffId, String Grade){
		
		this.staffId=Integer.parseInt(StaffId);
		this.Gradex=Grade;
		
		
	}

	public int getStaffId() {
		
		return staffId;
	}

	public String getGradex() {
		return Gradex;
	}
	
	

}
