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

        print(a);
        sort(a);
    }

    public static void sort(int[] a) {
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) { //find largest number in the array
                max = a[i];
                maxIndex = i;
                System.out.println("Max num is: " + max);
            }
        }


        swap(a, maxIndex, maxIndex-1);

        for (int array :
                a) {
            System.out.print(array);
        }
    }

    public static int[] swap(int[] num, int n1, int n2) {

        int temp = num[n1];
        num[n1] = num[n2];
        num[n2] = temp;

        return num;
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
