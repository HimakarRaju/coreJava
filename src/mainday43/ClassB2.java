package mainday43;

public class ClassB2 extends ClassA2 {
    void display() {
        System.out.println("hi");
        super.meth4();
    }

    static int show(int a) {
        System.out.println(a + a);
        return a + a++;
    }

    ClassB2() {
        this(show(50));
        for (int i;; i++) {
            super.meth4();
            break;
        }
        System.out.println("hi");
        System.out.println(show(50));
    }

    ClassB2(int a) {
        System.out.println("===>" + (a + show(50)));
    }

    public static void main(String[] args) {
        new ClassB2().display();
    }

}

/*
 * 
 * Output
 * 
 * 100
 * 59
 * 10
 * 75
 * 96
 * 74
 * 92
 * 38
 * 85
 * 100
 * ===>200
 * 56
 * hi
 * 100
 * 100
 * hi
 * 56
 */