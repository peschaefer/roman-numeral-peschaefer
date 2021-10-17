import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        runConverter();
    }

    private static void runConverter() {
        NumeralConverter numeralConverter = new NumeralConverter();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Roman Numeral:");
        int integer = numeralConverter.convertToInteger(scanner.nextLine());
        System.out.println(checkValidity(integer));
    }

    private static String checkValidity(int integer){
        if(integer == 0){
            return "Invalid Entry";
        }
        return String.valueOf(integer);
    }
}
