package mainday36;

public class Code1 {
    void meth1() {
        System.out.println("Implementing String Handling");

        String s1 = "Java";
        String s2 = new String("Java");

        char arr[] = { 'J', 'a', 'v', 'a' };
        String s3 = new String(arr);

        String s4 = new String(arr, 1, 2);

        System.out.println("s1 : " + s1); // Java
        System.out.println("s2 : " + s2); // Java
        System.out.println("s3 : " + s3); // Java
        System.out.println("s4 : " + s4); // va

        System.out.println("--------length()---------");

        System.out.println("s1 length : " + s1.length());
        System.out.println("Java".length());
        System.out.println("Java is awesome".length() + "\n");

    }

    void meth2() {
        System.out.println("-------------meth2()-------------");

        String s = "Java";
        System.out.println("Before concat() : " + s);

        System.out.println(s.concat(" is awesome"));
        System.out.println("After concat() : " + s);

        s = s.concat(" is awesome"); // Assigning value to existing String Object
        System.out.println("After assigning concat() to s : " + s);
    }

    public static void main(String[] args) {
        Code1 aobj = new Code1();
        aobj.meth1();
        aobj.meth2();
    }
}
