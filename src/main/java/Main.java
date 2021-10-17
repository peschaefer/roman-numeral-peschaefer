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
        int integer = numeralConverter.convertToInteger(input);
        if(isZero(integer)){
            System.out.println("Invalid Entry");
        }
        else{
            System.out.println(integer);
        }
    }

    private static boolean isZero(int integer){
        return integer == 0;
    }
}
