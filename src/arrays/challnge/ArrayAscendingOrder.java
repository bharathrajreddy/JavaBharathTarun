package arrays.challnge;

public class ArrayAscendingOrder {
    public static void main(String[] args) {
        int [] A = {1, 2, 1, 3, 4, 5};
//        System.out.println(solve(A));
        System.out.println(check(A));
    }

    static boolean check(int[]arr) {
        int n = arr.length;
        for(int i=0; i < n-1;i++) {
            if(arr[i+1] <= arr[i]) {
                return false;
            }
        }
        return true;
    }

    public static int solve(int[] A) {
        int num=0;
        int n = A.length;
        System.out.println(5%5);
        if(n-1>n-2){
            for(int i=0; i<n-2; i++){
                if(A[i]<=A[i+1]){
                    num = 1;
                }else{
                    num =0;
                    break;
                }
            }
        }
        return num;
    }
}
