package arrays.assignment;

import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int temp;
        int n = a.length;
        int[] b = new int[5];
        for(int i=0; i<n/2; i++){
            temp = a[i];
            a[i] = a[n-i-1];
            a[n-i-1] = temp;
        }
        for(int x:a){
            System.out.println(x);
        }
    }
}
