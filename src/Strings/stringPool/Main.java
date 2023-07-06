package Strings.stringPool;

public class Main {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        if(s1== s3)
            System.out.println("equal");
        else
            System.out.println("not Equal");
    }
}
