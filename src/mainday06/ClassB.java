package mainday06;

public class ClassB {
    void meth1() {
        System.out.println("meth1() is called");
    }

    protected void finalize() { //It will be called internally by the garbage collector.
        System.out.println("Garbage has been Collected");
    }
    public static void main(String[] args) {
        ClassB bobj1 = new ClassB();
        //ClassB bobj2 = new ClassB();

        bobj1.meth1();
        bobj1 = null;

        System.gc(); // Calling Garbage Collector.
    }
}

