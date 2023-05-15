package mainday27;

public class ClassB {
    void display(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ClassB bobj = new ClassB();
        bobj.display(5);
    }
}

/*
 * OUTPUT => * * * * * * * * * *
 */