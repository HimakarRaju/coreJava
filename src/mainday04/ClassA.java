package mainday04;

public class ClassA {
    static int i;

    private static int increment(int i) {
        return i++;
    }

    public ClassA() {
        i = 1;
    }
    public static void main(String[] args) {
        System.out.println(i);
        System.out.println(i= increment(i)+increment(i++));
    }
}
