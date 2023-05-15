package mainday17;

public class ClassA {
    int meth1() {
        int a = 10;
        a++; // a=>11
        System.out.println(a++); // ->11 a=>12
        a++; // a=>13
        System.out.println(++a); // ->14 a=>14
        System.out.println(a++); // ->14 a=>15
        System.out.println(a++); // ->15 a=>16
        a--; // a=>15
        System.out.println(--a); // ->14 a=>14
        a = a++ + 3; // a => 14+4=17
        System.out.println("a value===>" + a); // a value====>18

        System.out.println(a++); // ->18 a=>19
        --a; // 18 a=18
        System.out.println(--a); // 17
        System.out.println(a--); // 17 a=>16
        a = a-- + 3;//a=>15
        return (a++ + ++a);//a=>18
    }

    void meth2() {
        int a = 10;
        int x = new ClassA().meth1() + a++;//x->48a=>11
        System.out.println(x++ + a++);
        System.out.println(a++);
        System.out.println(a);
        System.out.println(x);

    }

    public static void main(String[] args) {
        System.out.println("Start");
        new ClassA().meth2();
        System.out.println("Java is awesome");
    }
}
