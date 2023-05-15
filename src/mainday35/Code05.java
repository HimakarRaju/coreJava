package mainday35;

/*
Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.

sameFirstLast({1, 2, 3}) → false
sameFirstLast({1, 2, 3, 1}) → true
sameFirstLast({1, 2, 1}) → true
*/

public class Code05 {
    public boolean sameFirstLast(int[] nums) {
        if (nums.length >= 1 && (nums[0] == nums[nums.length - 1])) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int input[] = { 10, 20, 30, 40, 10 };
        System.out.println(new Code05().sameFirstLast(input));
    }
}