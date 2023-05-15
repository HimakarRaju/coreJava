package mainday35;

import java.util.Arrays;

//Return an int array length 3 containing the first 3 digits of pi, {3,1,4}

public class Code06 {
    public int[] makePi() {

        return new int[] { 3, 1, 4 };
    }

    public static void main(String[] args) {
        Code06 aobj = new Code06();
        int result[] = aobj.makePi();
        System.out.println(Arrays.toString(result));
    }
}
