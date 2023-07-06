package arrays.assignment;

import java.util.Scanner;

public class SquaresOfNumbersFrom1TillN {
    public static void main(String[] args) {
        Scanner ssc = new Scanner(System.in);
        int n = ssc.nextInt();
        int[] SqrArr = new int[n];
        int num =1;
        for(int i=0; i<n; i++){
            SqrArr[i] = num*num;
            num++;
        }
        for(int x:SqrArr){
            System.out.print(x+" ");
        }
    }
}
