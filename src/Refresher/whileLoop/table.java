package Refresher.whileLoop;

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int i =1;
        while(i<=10){
            System.out.println(A+" "+"*"+" "+i+ " = "+A*i);
            i++;

        }
    }
}
