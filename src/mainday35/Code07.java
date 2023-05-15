package mainday35;

//Given 2 arrays of ints, a and b return true 
//if they have the same First element or they have same last element. 
//Both arrays will be length 1 or more

public class Code07 {
    public boolean commonEnd(int[] a, int[] b) {
        if (a.length >= 1 && b.length >= 1) {
            if (a[0] == b[0] && (a[a.length - 1] == b[b.length - 1])) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Code07 aobj = new Code07();
        int[] a = { 1, 2, 3, 4 };
        int[] b = { 1, 2, 3, 4 };
        boolean result = aobj.commonEnd(a, b);
        System.out.println(result);
    }
}
