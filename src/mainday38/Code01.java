package mainday38;

//Given a string name e.g. "Bob", return a greeting of the form "Hello Bob!".

public class Code01 {
    public String helloName(String name) {
        return ("Hello " + name + '!');
    }

    public static void main(String[] args) {
        Code01 c = new Code01();
        System.out.println(c.helloName("Bob"));
        System.out.println(c.helloName("Alice"));
        System.out.println(c.helloName("X"));
    }
}

/*
 * Output
 * 
 * Hello Bob!
 * Hello Alice!
 * Hello X!
 * 
 */