public class Main {
    public static void main(String[] args) {


        int balance = 100;
        int amount = 1100;
        long balanceSum;

        balanceSum = balance + amount;
        if (balanceSum < 1000) {
            System.out.println("Ваш баланс " + balanceSum);
        } else {
            System.out.println("Ваш баланс " + (amount / 100 + balanceSum));
        }
    }


}