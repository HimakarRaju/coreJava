package mainday16;

public class ClassA {
    int i = 10;
    int x = 50;

    void meth1() {
        System.out.println("meth1() called");
        System.out.println(i);
        System.out.println(i++);
        System.out.println(i);

        System.out.println(++i);
        System.out.println(i);

        System.out.println(i--);
        System.out.println(i);
        System.out.println(--i);
    }

    void meth2() {
        System.out.println("meth2() called");
        
        System.out.println(x); // 50 x=50
        System.out.println(x++); // 50 x=51
        System.out.println(x++); // 51 x=52
        System.out.println(x++); // 52 x=53
        
        x++; // 54 x=54
        
        System.out.println(++x);  // 55 x=55
        System.out.println(x--);  //55 x=54
        System.out.println(x++); // 54 x=55

        --x; // x= 54
        
        System.out.println(--x); // 53 x=53
        System.out.println(x); // 53 x=53
        System.out.println(x++); // 53 x=54
        System.out.println(x); // 54 x=54
        System.out.println(--x); // 53 x=54
        System.out.println(x); // 53 x=53

    }

    public static void main(String[] args) {
        ClassA aobj = new ClassA();
        aobj.meth1();
        aobj.meth2();
    }
}