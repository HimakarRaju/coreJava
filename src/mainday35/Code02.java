package mainday35;

import java.util.Arrays;

//Given an int array of length three, 
//if there is value 2 in array immediately followed by a value 3, 
//change the element 3 to 0, and return the changed array.

public class Code02 {
    int[] meth1() {

        int arr[] = { 1, 2, 3 };
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == 2 && arr[i + 1] == 3) {
                arr[i + 1] = 0;
            }

        }
        return arr;

    }

    public static void main(String[] args) {
        Code02 aobj = new Code02();
        int[] arr = aobj.meth1();
        System.out.println(Arrays.toString(arr));
    }
}
