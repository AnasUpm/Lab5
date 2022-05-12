package pckg;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class testClass {
	
	private static final DecimalFormat df = new DecimalFormat("0.00");
	    public static void main(String[] args)
	        throws Exception
	    {
	        
	        Rectangle[] rectangleArray;
	    	rectangleArray = createRectangleArray();
	    		
	    	try {
	    	printRectArray(rectangleArray);
	    	double averageP = AveragePerimeter(rectangleArray);
	    	double averageA = AverageArea(rectangleArray);
	    	System.out.println("the average perimeter of the rectangles is "+averageP);
	    	System.out.println("the average area of the rectangles is "+averageA);
	    	System.out.println("no of rectangles : "+Rectangle.getNoofObj());
	    	}finally {
	    		System.out.println("\n\nDONE EXCEPTION");
	    	}
	    	
	    }
	    
	    public static Rectangle[] createRectangleArray() throws Exception{
			Rectangle[] rec = new Rectangle[5];
	    	
	    	int i = 0;
	    	double _width = 0;
	    	double _length = 0;
	    	
	    	
	        Scanner scan = new Scanner(System.in);
	      do {
	            try {
	            	System.out.println("Rectangle "+(i+1));
	            	rec[i] = new Rectangle();
	                System.out.println("Please enter a numerical value for the rectangle's width:");
	                _width = scan.nextDouble();
	                rec[i].setWidth(_width);
	                System.out.println("Please enter a numerical value for the rectangle's length:");
	                _length = scan.nextDouble();
	                rec[i].setLength(_length);
	                System.out.println(rec[i].toString()+"\n");
	               
	                i++;
	                }
	            catch (InputMismatchException e){
	                System.out.println("error");;
	                scan.nextLine();
	          
	            }
	            catch(IllegalArgumentException ex) {
	            	System.out.println("width cannot be negative");
	            	scan.nextLine();
	            }
	      }while(i<5);
	      return rec;
	    	}
	    	
	    	
	    		
	    
	    public static void printRectArray(Rectangle[] rectangleArray) {
	    	//print the rectangles and the properties
	    	int j=1;
	    	for(int i = 0; i<rectangleArray.length;i++) {
	    		
	    		System.out.println("rectangle "+j+"\t length : "+df.format(rectangleArray[i].getLength())+"\t width : "+df.format(rectangleArray[i].getWidth())+"\t area : "
	    				+df.format(rectangleArray[i].getArea())+"\t perimeter : "+df.format(rectangleArray[i].getPerimeter()));
	    		j++;
	    	}

	    }
	    
	    public static double AveragePerimeter(Rectangle[] rectangleArray) {
	    	double total = 0;
	    	for(int i = 0; i<rectangleArray.length; i ++) {
	    		total = total + rectangleArray[i].getPerimeter();
	    	}
	    	return (total/rectangleArray.length);
	    }
	    
	    public static double AverageArea(Rectangle[] rectangleArray) {
	    	double total = 0;
	    	for(int i = 0; i<rectangleArray.length; i ++) {
	    		total = total + rectangleArray[i].getArea();
	    	}
	    	return (total/rectangleArray.length);
	    }
}
	    
    


