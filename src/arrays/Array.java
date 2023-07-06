package arrays;

public class Array {
    public static void main(String[] args) {
//        Arrays of primitive variables is possible like int, float, char etc
//        Arrays of non-primitive types like String if we create our own type useing class we can have array of that
//        Array of arrays is also possible
        int[] marks = new int[10];
        marks[0] = 10;
        marks[1] = 20;
        marks[9] = 20;
        marks[5] = 20;


        System.out.println(marks[1]);
        System.out.println(marks);// when we print Array variable we will get the address as an output

        int[] marks1 = {1,2,3,4,5,6,7,8,9};
//        index will start from 0 and will go on. it will be stored in memory contiguously.
        System.out.println(marks1[0]);

        float[] arr = new float[5];
        System.out.println(arr[0]);
        String[] names = {"Anu", "Zoro", "Zuv"};
        System.out.println(names[1]);
    }
}
