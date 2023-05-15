package mainday31.com.pack2;

import mainday31.com.pack1.ClassA1; // 1st way ( Highly Recommended )
//import mainday31.com.pack1.ClassB;

//import mainday31.com.pack1.*; //2nd Way ( Highly discouraged )

public class ClassX1 {
    public static void main(String[] args) {
        new ClassA1().meth1();

        mainday31.com.pack1.ClassB1 bobj = new mainday31.com.pack1.ClassB1();
        bobj.meth2();
    }
}
