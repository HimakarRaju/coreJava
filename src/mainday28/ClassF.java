package mainday28;

public class ClassF {
    void display() {
        int a = 10;
        for (int k = (a++) + (++a) + (++a); k > 10; /* k++ */) { // 10 + 12 + 13 = 35
            System.out.println(k);
            break;
        }
    }

    public static void main(String[] args) {
        ClassF fobj = new ClassF();
        fobj.display();
    }
}

/*
 * OUTPUT
 * 
 * 
 * 35
 */