public class Main {
    public static void main(String[] args) {


        int balance = 100;
        int amountV1 = 100;
        int amountV2 = 1100;
        long balanceSum;

        balanceSum = balance + amountV1;
        if (balanceSum < 1000) {
            System.out.println("Ваш баланс " + balanceSum);
            }
        balanceSum = balance + amountV2;
        if (balanceSum > 1000) {
            System.out.println("Ваш баланс " + (amountV2/100 + balanceSum));
        }
    }


}