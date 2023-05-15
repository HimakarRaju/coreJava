package mainday33;

import java.util.Arrays;

public class ClassA {
    void meth1() {
        System.out.println("Implementing Java Array");

        int arr1[];
        arr1 = new int[5];

        int arr2[] = new int[6];

        int arr3[] = { 100, 200, 300 };

        int arr4[] = new int[] { 11, 22, 33, 44 };

        String s = "Java";

        System.out.println("s length : " + s.length() + "\n");

        // printing the length of the arrays
        System.out.println("arr1 length : " + arr1.length);
        System.out.println("arr2 length : " + arr2.length);
        System.out.println("arr3 length : " + arr3.length);
        System.out.println("arr4 length : " + arr4.length + "\n");

        // printing the data of an array
        System.out.println("arr1 : " + Arrays.toString(arr1));
        System.out.println("arr2 : " + Arrays.toString(arr2));
        System.out.println("arr3 : " + Arrays.toString(arr3));
        System.out.println("arr4 : " + Arrays.toString(arr4));

        // passing data into an array which is already created
        arr1[1] = 25;
        arr1[3] = 45;

        System.out.println("Retrieving the data from an array");

        System.out.println(arr1[0]);// 0
        System.out.println(arr1[arr1.length - 2]);// [5-2 = 3] => 45
        System.out.println(arr3[arr1.length - arr3.length]);// [5-4 = 1] =>300
        System.out.println(arr2[arr4.length / 2]);// 0
        System.out.println(arr4[arr4.length]);// Generates an ArrayIndexOutOfBounds Exception (AIOBE)

        /*
         * 
         * Index positions of an array is used to pass the values into an array and
         * retrieve the values from an array.
         * If we are trying to access an index position which is not present in our
         * array we will be getting an ArrayOutOfBoundsException
         */
    }

    public static void main(String[] args) {
        new ClassA().meth1();
    }
}
