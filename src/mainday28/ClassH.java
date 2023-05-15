package mainday28;

public class ClassH {
    void meth1() {
        int arr[] = { 10, 20, 30, 40, 50 };

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        System.out.println("Retrieving the data from an array by using for loop");

        for (int i = 0; i <= 4; i++) {
            System.out.println(arr[i] + " ");
        }

        System.out.println("Retrieving the data from an array in reverse order by using for loop");

        for (int i = 4; i >= 0; i--) {
            System.out.println(arr[i] + " ");
        }

        System.out.println("Retrieving the data from an array by using for-each loop");
        for (int x : arr) {
            System.out.println(x);
        }
    }

    /*
     * 
     * For loop will be working on index positions to retrieve data from an array.
     * So by using for loop we can retrieve data in both forward and reverse
     * directions
     * 
     * for-each loop which is known as ENHANCED for loop is introduced in java v1.5.
     * It will not works on index positions to retrieve the data from an array.
     * It works on "Streaming Data". So by using for-each we can't retrieve the data
     * in reverse order
     * 
     * 
     * for-each loop is used "only to" retrieve the data from and Array and
     * Collection classes
     * 
     */

    public static void main(String[] args) {
        new ClassH().meth1();
    }
}

/*
 * OUTPUT
 * 
 * 10
 * 20
 * 30
 * 40
 * 50
 * Retrieving the data from an array by using for loop
 * 10
 * 20
 * 30
 * 40
 * 50
 * Retrieving the data from an array in reverse order by using for loop
 * 50
 * 40
 * 30
 * 20
 * 10
 * Retrieving the data from an array by using for-each loop
 * 10
 * 20
 * 30
 * 40
 * 50
 * 
 */