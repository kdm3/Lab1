//Kaitlin
//06/06/2016
//LAB 1-GC Bootcamp

import java.util.Scanner;

public class PerimeterAreaVolume {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		String input2="y";
				
		while (input2.equalsIgnoreCase("y")){
			System.out.print("Enter room length: ");
			double l= input.nextDouble();
			System.out.print("Enter room width: ");
			double w=input.nextDouble();
			System.out.println("Enter room height: ");
			double h=input.nextDouble();
		
		if((l<= 0) || (w<=0) || (h<=0)){							//Check for positive ints
			System.out.println("Please enter length/width/height in positive integers.");
		}
		else{
			double area=(l * w); 											//calculate area
			System.out.println("The area of the classroom is " + area + ".");
			
			double per= ((2*l)+(2*w)); 										//calculate perimeter
			System.out.println("The perimeter of the classroom is "+ per + ".");
		
			double vol=(l*h*w); 											//calculate volume
			System.out.println("The volume of he classroom is " + vol + ".");
		}
		
		System.out.print("Do you want to continue (y/n)?");
		String garbage=input.nextLine();
		input2= input.nextLine();
				
		}
		System.out.println("BUHBYE!");

		input.close();
	}		
}
	


