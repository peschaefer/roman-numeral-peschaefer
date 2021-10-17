import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        runConverter();
    }

    private static void runConverter() {
        NumeralConverter numeralConverter = new NumeralConverter();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Roman Numeral:");
        String input = scanner.nextLine();
        System.out.println(numeralConverter.convertToInteger(input));
    }
}
