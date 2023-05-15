package mainday35;

/*Given an int array, return a new array with double the length where its last element is the same as the original array, and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.

makeLast({4, 5, 6}) → {0, 0, 0, 0, 0, 6}
makeLast({1, 2}) → {0, 0, 0, 2}
makeLast({3}) → {0, 3}
*/

public class Code13 {
    public int[] makeLast(int[] nums) {

        int ArraySize = nums.length;
        int[] arr = new int[ArraySize * 2];

        arr[arr.length - 1] = nums[nums.length - 1];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = 0;
        }
        return arr;
    }

    public static void main(String[] args) {
        Code13 aobj = new Code13();
        int[] nums1 = { 4, 5, 6 };
        // int[] nums2 = { 1, 2 };
        // int[] nums3 = { 3 };
        int[] arr = aobj.makeLast(nums1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// Output => 0 0 0 0 0 6
