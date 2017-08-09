import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    int numSwaps = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        // Write Your Code Here

        for (int i = 0; i < n; i++) {
            // Track number of elements swapped during a single array traversal
            int numberOfSwaps = 0;

            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    swap(a, a[j], a[j + 1]);
                    numberOfSwaps++;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }

        print(a);

    }

    public static int[] swap(int[] a, int n1, int n2) {

        int temp = a[n1];
        a[n1] = a[n2];
        a[n2] = temp;

        return a;
    }

    public static void print(int[] a) {
        int lastElement = a[a.length-1];
        int firstElement = a[0];
        int numSwaps = 0;

        System.out.println("Array is sorted in " + numSwaps + " swaps.");
        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);
    }
}
