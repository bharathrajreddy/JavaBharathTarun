package Examples;

import java.util.Arrays;

public class LittlePonyAndMaximumElement {
    public static int solve(int[] A, int B) {
        Arrays.sort(A);
        int counter = 0;
        for(int i=0;i<A.length; i++){
            if(A[i] == B){
                for(int j=0; j<A.length; j++){
                    if(B<A[j]){
                        counter++;
                    }
                }
                break;
            }
        }
        if(counter <= 0){
            counter = -1;
        }
        return counter;
    }
    public static void main(String[] args) {
        int[] A = {24,33,13,11,30,28,19,8,30,25,42,6,30,49,3,49,24,13,3,50};
        System.out.println(solve(A, 13));
    }
}
