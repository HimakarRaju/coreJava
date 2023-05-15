package mainday24;

public class ClassB {
    void meth1(int a, int b, int c) {
        if (a > b) {
            System.out.println(a + " a is greater value");
        } else if (b > c) {
            System.out.println(b + " b is greater value");
        } else {
            System.out.println(c + " c is greater value");
        }
    }

    public static void main(String[] args) {
        ClassB bobj = new ClassB();
        bobj.meth1(5, 50, 100);
    }
}

/*
 * Output
 * 
 * 100 c is greater value
 */