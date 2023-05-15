package mainday35;

import java.util.Arrays;

public class Code01 {
    // int[] meth1() {
    // System.out.println("meth1 called");
    // return new int[] { 1, 2, 3 };
    // }

    // int meth2(int arr[]) {
    // System.out.println("meth2 called");
    // return arr[0];
    // }

    // public static void main(String[] args) {
    // System.out.println(new ClassA().meth2(new ClassA().meth1()));

    // }

    int[] meth1() {
        System.out.println("meth1() called");
        int arr1[] = { 11, 22, 33 };
        return arr1;
    }

    int meth2(int arr[]) {
        System.out.println("meth2() Called");
        System.out.println(Arrays.toString(arr));
        return arr.length;
    }

    public static void main(String[] args) {
        Code01 aobj = new Code01();
        int result[] = aobj.meth1();
        int x = aobj.meth2(result);
        System.out.println(x);
    }
}
