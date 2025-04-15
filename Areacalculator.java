import java.util.Scanner;

public class Areacalculator
{
	public double area(double radius)
	{
		return Math.PI * radius * radius;
	}
	
	public double area(double length,double breadth)
	{
		return length * breadth;
	}
	
	public double area(double base,double height,boolean isTriangle)
	{
		if(isTriangle)
		{
			return 0.5 * base * height;
		}
		else
		{
			return -1;
		}
	}
	
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	Areacalculator calc=new Areacalculator();
	int choice;
	
	do
	{
		System.out.println("Choose shape to calculate area:");
		System.out.println("1. Circle");
		System.out.println("2. Rectangle");
		System.out.println("3. Triangle");
		System.out.println("4. Exit");
		System.out.println("Enter your choice:");
		choice=sc.nextInt();
	
		switch(choice)
		{
			case 1: System.out.println("Enter radius of the circle:");
				double radius=sc.nextDouble();
				System.out.println("Area of circle:" + calc.area(radius));
				break;
				
			case 2: System.out.println("Enter length of the rectangle:");
				double length=sc.nextDouble();
				System.out.println("Enter breadth of the rectangle:");
				double breadth=sc.nextDouble();
				System.out.println("Area of rectangle:" + calc.area(length,breadth));
				break;
				
			case 3: System.out.println("Enter base of the triangle:");
				double base=sc.nextDouble();
				System.out.println("Enter height of triangle:");
				double height=sc.nextDouble();
				System.out.println("Area of Triangle:" + calc.area(base,height,true));
				break;
			
			case 4: System.out.println("Exiting...");
				break;
				
			default:System.out.println("Invalid choice!");
		}
	}
	while(choice != 4);
	sc.close();
}
}  

