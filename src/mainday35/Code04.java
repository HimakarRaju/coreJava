package mainday35;

/*
Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.

firstLast6({1, 2, 6}) → true
firstLast6({6, 1, 2, 3}) → true
firstLast6({13, 6, 1, 2, 3}) → false
*/

public class Code04 {
    public boolean firstLast6(int[] num) {
        if (num[0] == 6 || num[num.length - 1] == 6) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Code04 aobj = new Code04();
        int input[] = { 10, 20, 30, 40, 50, 6 };
        boolean result = aobj.firstLast6(input);
        System.out.println(result);
    }
}
