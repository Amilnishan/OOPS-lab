import java.util.Scanner;
import java.util.Arrays;

public class BinarySearchRecursive
{
	public static int binarySearch(int arr[],int left,int right,int target)
	{
	if(left>right)
	{
		return -1;
	}
	
	int mid=left+(right-left)/2;
	
	if(arr[mid]==target)
	{
		return mid;
	}
	else if(arr[mid]>target)
	{
		return binarySearch(arr,left,mid-1,target);
	}
	else
	{
		return binarySearch(arr,mid+1,right,target);
	}
}

public static void main(String args[])
{
	int i,result,target,limit;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the number of elements in the array:");
	limit=sc.nextInt();
	
	int array[]=new int[limit];
	
	System.out.println("Enter the limit:");
	for(i=0;i<limit;i++)
	{
		array[i]=sc.nextInt();
	}
	
	System.out.println("Enter the element to search:");
	target=sc.nextInt();
	
	Arrays.sort(array);
	System.out.println("Sorted array:"+Arrays.toString(array));
	
	result=binarySearch(array,0,array.length-1,target);
	
	if(result!=-1)
	{
		System.out.println("Element found at index:"+result);
	}
	else
	{
		System.out.println("Element not found:");
	}
}
}
