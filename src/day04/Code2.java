package day04;

public class Code2 {
    void add() {
        int a = 10;
        int b = 20;
        System.out.println("Addition :" + (a + b));
    }

    void sub() {
        int a = 100;
        int b = 99;
        System.out.println("Subtraction: " + (a - b));
    }

    void mul() {
        int a = 5;
        int b = 10;
        System.out.println("Multiplication: " + (a * b));
    }

    void div() {
        int a = 10;
        int b = 2;
        System.out.println("Division: " + (a / b));
    }

    public static void main(String[] args) {
        Code2 obj = new Code2();
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
    }
}
/*
 * Output
 * 
 * Addition: 30
 * Subtraction: 1
 * Multiplication: 50
 * Division: 12
 */