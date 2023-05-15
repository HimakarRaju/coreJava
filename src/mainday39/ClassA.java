package mainday39;

public class ClassA {
    void meth1() {
        System.out.println("String Vs StringBuffer Vs StringBuilder");

        String s1 = new String("Java");
        StringBuffer buffer1 = new StringBuffer("Java");
        StringBuilder builder1 = new StringBuilder("Java");

        System.out.println("-------Before---------");
        System.out.println("String : " + s1);
        System.out.println("StringBuffer : " + buffer1);
        System.out.println("StringBuilder : " + builder1 + "\n");

        s1.concat(" is awesome");
        buffer1.append(" is awesome");
        builder1.append(" is awesome");

        System.out.println("-------After---------");
        System.out.println("String : " + s1);
        System.out.println("StringBuffer : " + buffer1);
        System.out.println("StringBuilder : " + builder1);
    }

    void meth2() {
        String s1 = new String("Java");
        String s2 = new String("Java");

        StringBuffer buffer1 = new StringBuffer("Java");
        StringBuffer buffer2 = new StringBuffer("Java");

        StringBuilder builder1 = new StringBuilder("Java");
        StringBuilder builder2 = new StringBuilder("Java");

        System.out.println("------------equals()-----------");
        System.out.println("String Class : " + s1.equals(s2));
        System.out.println("StringBuffer Class : " + buffer1.equals(buffer2));
        System.out.println("StringBuilder Class : " + builder1.equals(builder2));
        System.out.println();

        System.out.println("----------- == ------------");
        System.out.println("String Class : " + (s1 == s2));
        System.out.println("StringBuffer Class : " + (buffer1 == buffer2));
        System.out.println("StringBuilder Class : " + (builder1 == builder2));
        System.out.println();

        System.out.println("Comparing the contents present in StringBuffer & StringBuilder Class");

        System.out.println(buffer1.toString().equals(buffer2.toString()));
        System.out.println(builder1.toString().equals(builder2.toString()));
    }

    void meth3() {
        System.out.println("-------------Methods()-------------");
        StringBuffer sb = new StringBuffer();
        System.out.println("Capacity() : " + sb.capacity());

        sb.append("abcdefghijklmno");

        System.out.println(sb);
        System.out.println("Capacity() : " + sb.capacity());
        System.out.println("length() : " + sb.length() + "\n");

        sb.append("pq");

        System.out.println(sb);
        System.out.println("Capacity() : " + sb.capacity()); // (currentCapacity+1)*2
        System.out.println("length() : " + sb.length() + "\n");

        System.out.println("charAt() : " + sb.charAt(sb.length() - 2));
        System.out.println("reverse() : " + sb.reverse());
        System.out.println("charAt() : " + sb.charAt(sb.length() - 1));

    }

    public static void main(String[] args) {
        ClassA aobj = new ClassA();
        // aobj.meth1();
        // System.out.println("-----------------------");
        // aobj.meth2();
        System.out.println("-----------------------");
        aobj.meth3();
    }
}