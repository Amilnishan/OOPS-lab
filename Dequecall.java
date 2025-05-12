import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Dequecall
{
    static Deque<String> deque = new ArrayDeque<>();

    public static void callFirst()
    {
        if(!deque.isEmpty())
        {
                System.out.println("callFirst removed:" + deque.removeFirst());
        }
        else
        {
            System.out.println("Deque is empty.Nothing to remove.");
        }
    }
    public static void callNext()
    {
        if(!deque.isEmpty())
        {
                System.out.println("callNext removed:" + deque.removeFirst());
        }
        else
        {
            System.out.println("Deque is empty.Nothing to remove.");
        }
    }
    public static void callLast()
    {
        if(!deque.isEmpty())
        {
                System.out.println("callLast removed:" + deque.removeLast());
        }
        else
        {
            System.out.println("Deque is empty.Nothing to remove.");
        }
    }

    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements to add to the deque:");
        int n=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter element " + (i+1) + ":");
            String s=sc.next();
            deque.addLast(s);
        }
        System.out.println("Initial Deque: " + deque);
        callFirst();
        callNext();
        callLast();
        System.out.println("Final Deque: " + deque);
        sc.close();
    }
    
}