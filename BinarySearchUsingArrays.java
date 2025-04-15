import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchUsingArrays 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit of array:");
        int limit = sc.nextInt();
        
        int[] array = new int[limit];
        
        System.out.println("Enter the elements into the array:");
        for (int i = 0; i < limit; i++) 
        {
        	array[i] = sc.nextInt();
        }
        
        Arrays.sort(array);
        
        System.out.println("Array after sorting:");
        for (int i = 0; i < limit; i++) 
        {
        	System.out.println(array[i]);
        }
        
        System.out.println("Enter the element to search:");
        int key = sc.nextInt();
        
        int result = Arrays.binarySearch(array, key);
        
        if (result < 0) 
        {
        	System.out.println("Element not found in the array");
        }
        else 
        {
        	System.out.println("Element found at index: " + result);
        }
        
        sc.close();
    }
} 

