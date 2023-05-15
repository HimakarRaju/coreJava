package mainday28;

public class ClassG {
    void display() {
        int a = 10;
        for (int k = (a++ + (new ClassG().meth1(5)) + (++a + 3) + (++a + 3)); k > 10; /* k++ */) { // 10 + 35 + 14 + 14

            System.out.println(k + 6);
            break;
        }
    }

    int meth1(int a) { // a =5
        return (new ClassG().meth2(10 + 1, 15 - 3) + (a * 2)); // 23 + (6 * 2)
    }

    int meth2(int a, int b) { // 11 + 12
        return (a + b); // 23
    }

    public static void main(String[] args) {
        ClassG a = new ClassG();
        a.display();
    }
}

/*
 * OUTPUT
 * 
 * 80
 */
