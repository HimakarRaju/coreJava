package mainday38;

/*
 * 
 * Return the number of times that the string"hi"appears anywhere in the given string.
 * countHi("abc hi ho") ? 1
 * countHi("ABChi hi") ? 2 
 * countHi("hihi") ? 2
 */

public class Code10 {
    public int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi"))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Code10 code = new Code10();
        System.out.println(code.countHi("abc hi ho"));
        System.out.println(code.countHi("ABChi hi"));
        System.out.println(code.countHi("hihi"));

    }
}

/*
 * Output
 * 
 * 1
 * 2
 * 2
 */