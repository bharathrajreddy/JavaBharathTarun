package Refresher.whileLoop;

import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();
//        for(int i=0; i<T; i++) {
            int fNum = 0;
            int lNum = 0;
            int N = 6531;
            lNum = N;
            fNum = N;
            while (fNum>10){
                fNum = fNum/10;

            }
            System.out.print(fNum+" ");
            while (lNum>10){
                lNum = lNum%10;
            }
            System.out.print(lNum);

        }
//    }
}
