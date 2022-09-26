package Video_25_26_Methods_02;

public class Main {
    public static void main(String[] args) {
        String message = "The weather is very nice today.";
        String newMessage = cities();
        System.out.println(newMessage);
        int number = sum(15, 7);
        System.out.println(number);
        int number2 = sum2(2, 3, 4, 5, 6);
        System.out.println(number2);
    }

    public static void add() {
        System.out.println("Added.");
    }

    public static void remove() {
        System.out.println("Removed.");
    }

    public static void update() {
        System.out.println("Updated.");
    }

    public static int sum(int number1, int number2) {

        return number1 + number2;
    }

    public static int sum2(int... numbers) {
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum;
    }

    public static String cities() {
        return "Ankara";
    }
}
