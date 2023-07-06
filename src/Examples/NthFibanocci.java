package Examples;

import java.util.Scanner;

public class NthFibanocci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        System.out.println(fib(A));
    }
    public static int fib(int A){
        int a = 1;
        if(A<=1){
            return A;
        }
        return fib(A-1)+fib(A-2);
    }
}


