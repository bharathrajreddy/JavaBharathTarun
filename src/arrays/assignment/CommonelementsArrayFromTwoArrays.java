package arrays.assignment;

import java.util.Scanner;

public class CommonelementsArrayFromTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index of First Array");
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i=0;i<A.length;i++){
            A[i] = sc.nextInt();
        }
        System.out.println("Enter the index of Second Array");
        int m = sc.nextInt();
        int [] B = new int[m];
        for(int i=0;i<B.length;i++){
            B[i] = sc.nextInt();
        }
        int l ;
        int[] C = new int[A.length+B.length];
        for(int i=0;i<A.length;i++){
            for(int j=0; j<B.length; j++){
                if(A[i] == B[j]){
                    C[j] = B[j];
                    System.out.println(C[j]);
                }
            }
        }
    }
}
