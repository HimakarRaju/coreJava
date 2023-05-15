package mainday20;

public class ClassE {
    void meth1() {
        int x = 10;
        int y = 20;

        x = x + 90;
        System.out.println("x : " + x);

        y += 80;
        System.out.println("y : " + y);
    }

    public static void main(String[] args) {
        new ClassE().meth1();
    }
}

/*
 * 
 * x : 100
 * y : 100
 * 
 */