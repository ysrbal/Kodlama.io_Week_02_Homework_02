package Video_30_ReCapDemo_Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = calculator.sum(3, 4);
        int subtraction = calculator.subtraction(12, 8);
        int multiplication = calculator.multiplication(7, 9);
        int division = calculator.division(56, 4);

        System.out.println(sum);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);
    }
}
