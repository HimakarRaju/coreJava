package mainday35;

/**
 *
 * Given an array of ints length 3,
 * return the sum of all the elements.
 * 
 * sum3([1, 2, 3]) → 6
 * sum3([5, 11, 2]) → 18
 * sum3([7, 0, 0]) → 7
 */

public class Code08 {

    public int sum3(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Code08 aobj = new Code08();
        // int[] arr1 = { 1, 2, 3 };
        // int[] arr2 = { 5, 11, 2 };
        int[] arr3 = { 7, 0, 0 };
        System.out.println(aobj.sum3(arr3));
    }
}