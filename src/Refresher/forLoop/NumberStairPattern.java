package Refresher.forLoop;
import java.util.Scanner;

public class NumberStairPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
                if(j>=1 && j!=i){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
