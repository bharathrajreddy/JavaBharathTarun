package arrays.inputandOutputArrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        //Method 1
        for(int i=0; i<arr.length; i++){
            System.out.println("at index = "+i+" value "+arr[i]+" ");
        }

        //Method 2

    }
}
