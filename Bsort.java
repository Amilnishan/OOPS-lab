import java.util.*;

class BubblesortGeneric {
    public static <T> T[] bsort(T arr[], int limit) {
        String str, str2;
        int i, j;
        for (i = 0; i < limit - 1; i++) {
            for (j = 0; j < limit - 1 - i; j++) { // Optimized to avoid unnecessary comparisons
                str = arr[j].toString();
                str2 = arr[j + 1].toString();
                if (str.compareTo(str2) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr; // Moved outside the loop
    }
}

class Bsort {
    public static void main(String args[]) {
        int n, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements to be sorted:");
        n = sc.nextInt();
        String arr[] = new String[n];
        System.out.println("Enter the elements:");
        for (i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        BubblesortGeneric bubble = new BubblesortGeneric();
        arr = bubble.<String>bsort(arr, n);
        System.out.println("Sorted elements are:");
        for (i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
