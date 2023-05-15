package mainday35;

import java.util.Arrays;

/*
Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.

middleWay({1, 2, 3}, {4, 5, 6}) → {2, 5}
middleWay({7, 7, 7}, {3, 8, 0}) → {7, 8}
middleWay({5, 2, 9}, {1, 4, 5}) → {2, 4}
*/

public class Code11 {

    public int[] middleWay(int[] a, int[] b) {
        int[] arr = new int[2];
        arr[0] = a[1];
        arr[1] = b[1];
        return arr;
    }

    public static void main(String[] args) {
        Code11 classA = new Code11();
        // int[] a = { 1, 2, 3 };
        // int[] b = { 4, 5, 6 };

        int[] c = { 7, 7, 7 };
        int[] d = { 3, 8, 0 };

        // int[] e = { 5, 2, 9 };
        // int[] f = { 1, 4, 5 };

        int[] result = classA.middleWay(c, d);
        System.out.println(Arrays.toString(result));
    }
}

// Output => [7, 8]
