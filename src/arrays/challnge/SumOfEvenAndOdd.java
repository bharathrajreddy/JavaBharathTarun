package arrays.challnge;

public class SumOfEvenAndOdd {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        System.out.println(even_odd(A));
    }
    public static int even_odd(int[] A) {

        int sumOfEven = 0;
        int sumOfOdd = 0;
        for(int i=0;i<A.length;i++){
            if(A[i]%2 == 0){
                sumOfEven += A[i];
            }else{
                sumOfOdd += A[i];
            }
        }
        return Math.abs(sumOfEven - sumOfOdd);
    }
}
