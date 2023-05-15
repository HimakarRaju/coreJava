package mainday24;

//a shop will give discount of 10% if cost = >1000
//

public class ClassD {
    void bill(int units) {
        int finalBill = units * 100;
        if (finalBill >= 1000) {
            int discount = (finalBill * 10) / 100;
            System.out.println("Congratulations !!! You have saved " + discount);
            System.out.println("Final Bill : " + (finalBill - discount));
        } else {
            System.out.println("If You purchase more " + (1000 - finalBill) + "\n"
                    + "you will receive 10% discount on the final bill");
            System.out.println("Final Bill : " + finalBill);
        }
    }

    public static void main(String[] args) {
        new ClassD().bill(8);
    }
}

/*
 * OUTPUT
 * 
 * If You purchase more 200
 * you will receive 10% discount on the final bill
 * Final Bill : 800
 */