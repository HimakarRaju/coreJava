package mainday16;

public class ClassB {
    int i = 10;

    void meth1() {
        int x = i++;
        System.out.println("x : " + x);
        System.out.println("i : " + i + "\n");

        int y = ++i;
        System.out.println("y : " + y);
        System.out.println("i : " + i + "\n");

        int z = i++ + ++i;
        System.out.println("Z : " + z);
        System.out.println("i : " + i + "\n");

        i = i++ + ++i;
        System.out.println("i : " + i + "\n");

    }
    
    int meth2(int x, int y) { //x=1 y=2
        return (x++ + ++x + y-- + --y); //1+3 + 2+0
    }
    
    public static void main(String[] args) {
        ClassB bobj = new ClassB();
        bobj.meth1();
        int result = (new ClassB().meth2(1, 2)); //6
        System.out.println(result++ + ++result); //6+8=14
    }
}
