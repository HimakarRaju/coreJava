package mainday24;

public class ClassA {

    ClassA(int a, int b) {
        if (a > b) {
            System.out.println(a + " is greater value");
        } else {
            System.out.println(b + " is greater value");
        }
    }

    public static void main(String[] args) {
        new ClassA(2, 3);
    }
}

/*
 * output
 * 
 * 3 is greater value
 */