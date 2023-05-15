package mainday20;

public class ClassD {
    int c; //0 -> 1
    static int e;//e=0 -> 1 ->2 ->3

    ClassD() {
        System.out.println(++c);//
        System.out.println(++e);
    }

    public static void main(String[] args) {
        int a = 34;
        int b = 21;
        new ClassD().c -= a++ + ++b;// 34+22=56 a=35 b=22
        int d = --a + --b + new ClassD().c--;//a=34 b=21
        e = a + +b + +new ClassD().c + d--;//a=34 b=21 d=56 e=>3
        int f = -a + b-- + -new ClassD().c - d++;
        int sum = a + b + new ClassD().c + d + e + f;
        System.out.println("sum = " + sum);
    }
}

/*
 * OUTPUT
 * --------------
 * 1
 * 1
 * 1
 * 2
 * 1
 * 3
 * 1
 * 113
 * 1
 * 114
 * sum = 156
 * 
 * 
 */