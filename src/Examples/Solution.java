package Examples;

public class Solution {
    public static int solve(char[] A) {
        int result = 0;
        for(int i=0; i<=A.length-1;i++){
            if((A[i]<= 122 && A[i]>=97)||(A[i]<=90 && A[i]>=65)||(A[i]<=57&&A[i]>=48)){
                result = 1;
            }else{
                result = 0;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[] A = {'S','c','a','l','e','r','#','2','0','2','0'};
        solve(A);
    }
}
