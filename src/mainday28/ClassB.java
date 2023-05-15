package mainday28;

//write a java program to print even numbers between 1-20
public class ClassB {
    void meth1(int n) {
        int i;
        for (i = 1; i <= n; i++) {
            System.out.println(++i);
        }
    }

    public static void main(String[] args) {
        new ClassB().meth1(20);
    }
}

/*
 * OUTPUT
 * 
 * 2
 * 4
 * 6
 * 8
 * 10
 * 12
 * 14
 * 16
 * 18
 * 20
 */