package mainday19;

// public class Task4 {

//     static int x = 10;

//     public static void main(String[] args) {
//         Task4 t1 = new Task4();
//         Task4 t2 = new Task4();

//         t1.x = 20;
//         System.out.print(x + " ");
//         System.out.println(t2.x);
//     }
// }

public class Task4 {

    int x = 10;

    public static void main(String[] args) {
        Task4 t1 = new Task4();
        Task4 t2 = new Task4();

        t1.x = 20;
        System.out.print(t1.x + " ");
        System.out.println(t2.x);
    }
}

/*
 * OUTPUT 1
 * -----------------
 * 20 20
 * 
 */

 