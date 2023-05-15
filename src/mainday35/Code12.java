package mainday35;

/*
Given an array of ints, return a new array length 2 containing the first and last elements from the original array. The original array will be length 1 or more.

makeEnds({1, 2, 3}) → {1, 3}
makeEnds({1, 2, 3, 4}) → {1, 4}
makeEnds({7, 4, 6, 2}) → {7, 2}
*/

public class Code12 {
    public int[] makeEnds(int[] nums) {
        int[] arr = new int[2];
        arr[0] = nums[0];
        arr[1] = nums[nums.length - 1];
        return arr;
    }

    public static void main(String[] args) {
        Code12 code = new Code12();

        // int[] nums1 = { 1, 2, 3 };
        // int[] nums2 = { 1, 2, 3, 4 };

        int[] nums3 = { 7, 4, 6, 2 };
        int[] arr = code.makeEnds(nums3);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
