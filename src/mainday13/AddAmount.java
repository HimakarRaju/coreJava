package mainday13;

public class AddAmount {
    int amount = 500;

    AddAmount() {
        System.out.println("Balance Amount in your Account is " + amount);
    }

    AddAmount(int addAmount) {
        int amount = this.amount;
        amount = amount + addAmount;
        System.out.println("The final balance in your account is " + (amount + addAmount));
    }

    public static void main(String[] args) {
        new AddAmount();
        new AddAmount(500);
    }
}
