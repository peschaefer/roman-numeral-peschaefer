public class NumeralConverter {

    public int convertToInteger(String romanNumeral) {
        int total = 0;
        for(int index = 0; index < romanNumeral.length();index++){
            char letter = romanNumeral.charAt(index);
            total+=convertSingleCharacter(letter);
        }
        return total;
    }

    private int convertSingleCharacter(char singleRomanNumeral) {
        return switch (singleRomanNumeral) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}