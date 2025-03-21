import java.util.Scanner;

public class Linearsearch
{
	public static void main(String args[])
	{
		int i,limit,result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit of array:");
		limit=sc.nextInt();
		
		int array[]=new int[limit];
		
		System.out.println("Enter the elements into the array:");
		for(i=0;i<limit;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("Enter the element to search:");
		result=sc.nextInt();
		
		boolean found=false;
		
		for(i=0;i<limit;i++)
		{
			if(result==array[i])
			{
				System.out.println("Element found");
				found=true;
				break;
			}
		}
		if(!found)
		{
			System.out.println("Element not found");
		}
	}
}
