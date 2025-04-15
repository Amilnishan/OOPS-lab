import java.util.Scanner;
class Employee
{
	int empid,empsalary;
	String empname,empaddress;
	
	Employee(int id,int salary,String name,String address)
	{
		empid=id;
		empsalary=salary;
		empname=name;
		empaddress=address;
	}
}

	class Teacher extends Employee
	{
		String department,subjects_taught;
		Teacher(int id,int salary,String name,String address,String dept,String sub)
		{
			super(id,salary,name,address);
			department=dept;
			subjects_taught=sub;
		}
		void display()
		{
			System.out.println("Employee id :"+empid);
			System.out.println("Employee name :"+empname);
			System.out.println("Employee salary :"+empsalary);
			System.out.println("Employee address :"+empaddress);
			System.out.println("Department :"+department);
			System.out.println("Subjects taught :"+subjects_taught);
		}
	}
	class Employeesuper
	{
		public static void main(String args[])
		{
			int i,n,empid,salary;
			String name,subj,address,dept;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of employees:");
			n=sc.nextInt();
			
			Teacher teacher[]=new Teacher[n];
			for(i=0;i<n;i++)
			{
				System.out.println("\n Enter the Employee id:");
				empid=sc.nextInt();
				System.out.println("Enter the employee name:");
				name=sc.next();
				System.out.println("Enter the salary:");
				salary=sc.nextInt();
				System.out.println("Enter the address:");
				address=sc.next();
				System.out.println("Enter the department:");
				dept=sc.next();
				System.out.println("Enter the subject taught:");
				subj=sc.next();
				teacher[i]=new Teacher(empid,salary,name,address,dept,subj);
			}
			System.out.println("\n Details of Teachers");
			System.out.println("______________________");
			for(i=0;i<n;i++)
			{
				teacher[i].display();
			}
		}
	}	  
			
				
