package mainday42.pack2;

import mainday42.pack1.ClassB;

public class ClassY extends ClassB {

    public static void main(String[] args) {

        ClassY xobj = new ClassY(); // multi-level inheritance

        xobj.meth1();
        xobj.meth2();
        xobj.meth3();
    }

    void meth3() {
        System.out.println("Class X Method");
    }
}
