package mainday35;

//Given an array of integer, return the sum of the first 2 elements in the array
//If the array length is less than 2, Just sum up the elements that exist, return 0 if the array length is 0

public class Code03 {
    int meth1(int[] arr) {

        if (arr.length >= 2) {
            return arr[0] + arr[1];
        } else if (arr.length >= 2) {
            return arr[0];
        }
        return 0;

    }

    public static void main(String[] args) {
        Code03 aobj = new Code03();
        int input[] = { 10, 20, 30, 40 };
        int output = aobj.meth1(input);
        System.out.println(output);
    }
}
