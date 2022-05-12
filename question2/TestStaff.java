import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestStaff {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Person> Staff;
		Staff = AddObj();
		
		Display(Staff);
		
		ArrayList<Staff> Staff2;
		Staff2 = Addlist(Staff);
		
		Staff SS = new Staff();
		
		System.out.println("enter the Staff Id for the staff : ");
		
		SS.setStaffId(scan.next());

		int x = (Staff.size()) - 1;
		for(int j = 0; j<Staff.size();j++) {
			if((Staff2).get(j).equals(SS)) {
				System.out.println(Staff.get(j).getClass().getName());
				System.out.println(Staff.get(j));
				break;
			}
			if(j==x) {
				System.out.println("Staff with ID "+SS.getStaffId()+" is not found!");
			}
			
		}
		
		Checks();
		
		try {
			
		}
		finally {
			System.out.println("done exception");
		}
			
		
			
	}
	
	//create objects in arraylist
		public static ArrayList<Person> AddObj(){
			ArrayList<Person> Staff = new ArrayList<>();
			
			
			Staff.add(new Staff("AB001","Mahmud Yanam","Mahmud@gmail.com","D4S54"));
			Staff.add(new Academic("AA002","Suzilah MdNor","Suzilah@gmail.com","F2E54","Associate Professor Dr."));
			Staff.add(new NonAcademic("AN003","Jamilah Jamal","Jamilah@gmail.com","J1S53","Secretary"));
			Staff.add(new Academic("AA041","Faizul Hanafi","PejolKiyut@gmail.com","A2S54","Senior Lecturer"));
			Staff.add(new Staff("AB111","Mahmud Yanam","Mahmud@gmail.com","D4S54"));
			Staff.add(new Academic("BD002","Suzilah MdNor","Suzilah@gmail.com","F2E54","Associate Professor Dr."));
			Staff.add(new NonAcademic("AN333","Jamilah Jamal","Jamilah@gmail.com","J1S53","Secretary"));
			Staff.add(new Academic("AA431","Faizul Hanafi","PejolKiyut@gmail.com","A2S54","Senior Lecturer"));
			Staff.add(new Staff("AB541","Mahmud Yanam","Mahmud@gmail.com","D4S54"));
			Staff.add(new Academic("AA4242","Suzilah MdNor","Suzilah@gmail.com","F2E54","Associate Professor Dr."));
			Staff.add(new NonAcademic("ANAD3","Jamilah Jamal","Jamilah@gmail.com","J1S53","Secretary"));
			Staff.add(new Academic("AASS1","Faizul Hanafi","PejolKiyut@gmail.com","A2S54","Senior Lecturer"));
			Staff.add(new Staff("ABASD1","Mahmud Yanam","Mahmud@gmail.com","D4S54"));
			Staff.add((new Person("23423","under da bridge")));
			return Staff;
		}
		
		public static void DisplayDetailsInformation(Object obj) {
			
			if(obj instanceof Academic) {
				System.out.println("|Academic Staff| : ");
				System.out.println((obj).toString()+"\n"+((Academic)obj).title);
				}
			else if(obj instanceof NonAcademic) {
				System.out.println("|Non Academic Staff| : ");
				System.out.println(((NonAcademic)obj).toString());
				}
			else if(obj instanceof Staff) {
				System.out.println("|Staff| : ");
				System.out.println(((Staff)obj).toString());
			}
			else if(obj instanceof Person) {
				System.out.println("|Person| : " );
				System.out.println(((Person)obj).toString());
			}
			
		}
		//create a placeholder for comparing
		public static ArrayList<Staff> Addlist (ArrayList<Person> Staff){
			ArrayList<Staff> Staff2 = new ArrayList<>();
			for(int y = 0; y<Staff.size();y++) {
				Staff2.add(new Staff(Staff.get(y).getStaffId()));
			}
			return Staff2;
		}
		//display method to call DisplayDetailsInformation() method
		public static void Display(ArrayList<Person> Staff) {
			
			//display
			for(int i = 0; i<Staff.size();i++) {
				DisplayDetailsInformation(Staff.get(i));
				System.out.println("\n");
				System.out.println("-------------------------------------------");
				System.out.println("\n");
				} 
			
		}

	
	public static void Checks() {
		Scanner scan = new Scanner(System.in);
		Staff s = new Staff("AB001","Mahmud Yanam","Mahmud@gmail.com","D4S54");
		STAFFID(s);
		Grades(s);
		
		System.out.println(s);
	}
	
	public static void STAFFID (Staff s) {
		boolean c = true;
		boolean cont = true;
		Scanner scan = new Scanner(System.in);
		int StaffInt = 0;
		while(cont) {
			
			
		while(c) {	
		try {
		System.out.println("Enter Id for Staff");
		
		s.setStaffId(scan.next());
		StaffInt = Integer.parseInt(s.getStaffId());
		c=false;
		}catch(InputMismatchException r) {
		System.out.println("integer only"+r);	
		}catch(NumberFormatException n) {
			System.out.println("integer only "+n);
		}
		}
		
		
		try {
			s.Validate(StaffInt);
			cont = false;
		} 
		
		catch (StaffException e ) {
			// TODO Auto-generated catch block
			System.out.println("Id cannot be negative");
			
			continue;
		}
		catch(NumberFormatException f) {
			System.out.println("Id "+StaffInt+ " is out of bound");
			continue;
		}
	
	
			
		}
	
		
		
	}
	
	public static void Grades(Staff s) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean cont = true;
		while(cont) {
			System.out.println("enter grade");
			s.setGrade(scan.next());
			
			try {
			Integer.parseInt(s.getGrade());
			throw new InputMismatchException("CANNOT LA CHA"); 
			}
			catch(InputMismatchException a) {
				System.out.println( "Grade must String value (example DS52/DS58)");
				continue;
			}
			catch (NumberFormatException f) {
				
				System.out.println(s.getGrade()+" is valid");
				cont= false;
				continue;
			}
		}
	}
}
		
		
		
	
		
	
	



