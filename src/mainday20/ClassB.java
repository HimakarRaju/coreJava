package mainday20;

public class ClassB {
    static int a = 0;
    int b = 0;

    ClassB() {
        a++;
        b++;
        System.out.println("Static variable ===>" + a);
        System.out.println("Instance variable ===>" + b);
        System.out.println("--------------------------");
    }

    void display() {
        System.out.println("****** Accessing static Variable ******");
        System.out.println(ClassB.a);
        System.out.println(a);
        // System.out.println(new ClassB().a);
    }

    public static void main(String[] args) {
        new ClassB();
        new ClassB();
        new ClassB();
        System.out.println("#############################################");
        new ClassB().display();
    }
}

/*
 * my output
 * OUTPUT
 * 
 * 
 * Static variable ===>1
 * Instance variable ===>1
 * ------------------
 * Static variable ===>2
 * Instance variable ===>1
 * ------------------
 * Static variable ===>3
 * Instance variable ===>1
 * ------------------
 * #############################
 * Static variable ===>4
 * Instance variable ===>1
 * ------------------
 * ****** Accessing static Variable ******
 * 4
 * 4
 * 
 * Static variable ===>5
 * Instance variable ===>1
 * --------------------------
 * 5
 * 
 */

// vs output
/*
 * 
 * Static variable ===>1
 * Instance variable ===>1
 * --------------------------
 * Static variable ===>2
 * Instance variable ===>1
 * --------------------------
 * Static variable ===>3
 * Instance variable ===>1
 * --------------------------
 * #############################################
 * Static variable ===>4
 * Instance variable ===>1
 * --------------------------
 * ****** Accessing static Variable ******
 * 4
 * 4
 * Static variable ===>5
 * Instance variable ===>1
 * --------------------------
 * 5
 * 
 */