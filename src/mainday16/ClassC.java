package mainday16;

public class ClassC {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c;
        int d;

        c = ++b; //c=3
        d = a++; //1
        c++;     //4

        System.out.println("a : " + a); //2
        System.out.println("b : " + b); //3
        System.out.println("c : " + c); //4
        System.out.println("d : " + d); //1
    }

}
