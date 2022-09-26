package Video_24_Methods;

public class Main {
    public static void main(String[] args) {
        findingNumber();
    }

    public static void findingNumber() {
        int[] numbers = new int[]{1, 2, 5, 7, 9, 0,};
        int searchFor = 1;
        boolean isNumber = false;

        for (int number : numbers) {
            if (number == searchFor) {
                isNumber = true;
                break;
            }
        }
        if (isNumber) {
            sendMessage(searchFor);
        } else {
            System.out.println("Number is not available.");
        }
    }

    public static void sendMessage(int searchFor) {

        System.out.println("Number is available : " + searchFor);
    }
}