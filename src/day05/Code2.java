package day05;

public class Code2 {
    void display() {
        System.out.println("hi");

    }

    void show() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Code2 obj = new Code2();
        obj.display();
        obj.show();

        /*
         * new Code2().display();
         * new Code2().show();
         */
    }
}
