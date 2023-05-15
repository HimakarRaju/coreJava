package mainday35;

/*
Given an array of ints length 3, figure out which is larger between the first and last elements in the array, and set all the other elements to be that value. Return the changed array.

maxEnd3({1, 2, 3}) → {3, 3, 3}
maxEnd3({11, 5, 9}) → {11, 11, 11}
maxEnd3({2, 11, 20}) → {20, 20, 20}
*/

public class Code10 {
    public int[] maxEnd3(int[] nums) {
        int[] arr = new int[3];

        arr[0] = nums[0];
        if (nums[2] >= arr[0]) {
            arr[0] = nums[2];
        }
        arr[1] = arr[0];
        arr[2] = arr[0];
        return arr;
    }

    public static void main(String[] args) {
        Code10 aobj = new Code10();

        // int[] nums1 = { 1, 2, 3 };
        // int[] nums2 = { 11, 5, 9 };
        int[] nums3 = { 2, 11, 20 };

        int[] arr = aobj.maxEnd3(nums3);

        for (int i = 0; i < 3; i++) {

            System.out.print(arr[i] + " ");

        }
    }
}

// Output => 20 20 20
