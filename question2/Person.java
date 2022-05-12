
public class Person {
	
	String id;
	String address;
	
	
	
	Person(){}
	
	Person(String id, String address){
		this.id=id;
		this.address=address;
	}


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public String getStaffId() {
		return id;
	}
	
	public String toString() {
		return "ID : "+id+" Address : "+address;
	}
	

}
