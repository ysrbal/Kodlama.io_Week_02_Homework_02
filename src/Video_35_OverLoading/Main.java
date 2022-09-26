package Video_35_OverLoading;

public class Main {
    public static void main(String[] args) {
        Transactions transactions = new Transactions();

        System.out.println(transactions.sum(4,11));
        System.out.println(transactions.sum(5,47,31));
    }
}
