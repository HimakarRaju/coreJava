package mainday15;

/*
 * use 2 instance vars
 * use 1 static
 */

public class ClassB {
    String Hero;
    String Description;

    static String movie = "Thupakki";

    ClassB(String hero, String desc) {
        Hero = hero;
        Description = desc;
    }

    public static void main(String[] args) {
        ClassB bobj = new ClassB("Thalapathi Vijay", "Action");
        System.out.println("bobj : " + bobj.Hero + " " + bobj.Description + " " + ClassB.movie);

        System.out.println("---------------------------------------------");

        bobj.Hero = "Prabhas";
        bobj.Description = "Darling";
        ClassB.movie = "Adipurush";

        System.out.println("bobj : " + bobj.Hero + " " + bobj.Description + " " + ClassB.movie);// bobj.movie ==>
                                                                                                // ClassB.movie
    }
}

/*
 * 
 * output
 * bobj : Thalapathi vijay Action Thupakki
 * bobj : Prabhas Darling Adipurush
 * 
 * ============================================
 * 
 * bobj : Thalapathi Vijay Action Thupakki
 * ---------------------------------------------
 * bobj : Prabhas Darling Adipurush
 */