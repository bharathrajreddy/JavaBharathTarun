package arrays.assignment;

import java.util.Scanner;

public class FinfMaximumAndMinimumElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }

            if(arr[i]< min){
                min = arr[i];
            }
        }
        System.out.println("Minimum number is "+ min);
        System.out.println("Maximum number is "+ max);
    }
}
