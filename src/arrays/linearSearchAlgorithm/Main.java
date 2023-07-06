package arrays.linearSearchAlgorithm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();

        int ans = -1;

//        Iterate over the array and update ans if key is found
//        for(int i=0; i<arr.length; i++){
//            if(key == arr[i]){
//                ans = i;
//                break;
//            }
//        }

//        Iterates right to left and returns the last occurence
        for(int i=n-1;i>=0; i--){
            if(key == arr[i]){
                ans = i;
                break;

            }
        }

        System.out.println(ans);

    }
}
