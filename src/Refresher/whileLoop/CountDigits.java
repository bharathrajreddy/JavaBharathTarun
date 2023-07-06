package Refresher.whileLoop;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();
//        for(int i=0; i<T; i++){
            int count = 0;
            int N = 10001;
            if(N>0){
                while (N>=1){
                    N = N/10;
                    count++;
                }
            }else{
                count =1;
            }

            System.out.println(count);
        }
//    }
}
