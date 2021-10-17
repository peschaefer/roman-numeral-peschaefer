public class NumeralConverter {

    public int convertToInteger(String romanNumeral) {
        int total = 0;
        int currentNumeral,previousNumeral;
        for(int index = romanNumeral.length()-1; index >= 0;index--){
            currentNumeral = convertSingleCharacter(romanNumeral.charAt(index));
            if (index == romanNumeral.length()-1){
                total+=currentNumeral;
            }else{
                previousNumeral = convertSingleCharacter(romanNumeral.charAt(index + 1));
                if (previousNumeral > currentNumeral){
                    total -= currentNumeral;
                } else{
                    total += currentNumeral;
                }
            }
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