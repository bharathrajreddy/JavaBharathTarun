package Refresher.whileLoop;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0; i<T; i++){
            int count = 0;
            int N = sc.nextInt();
            if(N>0){
                while (N>=1){
                    int M = N%10;
                    count = count+M;
                    N= N/10;
                }
            }else{
                count =0;
            }
            System.out.println(count);
        }
    }
}
