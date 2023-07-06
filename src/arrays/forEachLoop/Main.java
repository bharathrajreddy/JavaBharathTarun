package arrays.forEachLoop;

public class Main {
    public static void main(String[] args) {
//        for-each loop it is an enhanced for loop
        int[] arr = {5,4,3,2,1};
        for(int x:arr){
            System.out.print(x*x+" ") ;
        }
        int key = 7;
//        check whether the value is present inside my array
        boolean found = false;
        for(int num:arr){
            if(num == key){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println(key+ " is present in the Array");
        }else
            System.out.println(key+" is not present in the Array");

    }
}
