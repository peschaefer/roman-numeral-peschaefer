public class NumeralConverter {

    public int convertToInteger(String romanNumeral) {
        if(!checkValidity(romanNumeral)){
            return 0;
        }
        int total = 0;
        int currentNumeral,previousNumeral;
        boolean subtracted = false;
        for(int index = romanNumeral.length()-1; index >= 0;index--){
            currentNumeral = convertSingleCharacter(romanNumeral.charAt(index));
            if (index == romanNumeral.length()-1){
                total+=currentNumeral;
            }
            else{
                previousNumeral = convertSingleCharacter(romanNumeral.charAt(index + 1));
                if (previousNumeral > currentNumeral){
                    total -= currentNumeral;
                    subtracted = true;
                }
                else if(previousNumeral == currentNumeral){
                    if(subtracted){
                        return 0;
                    }
                    total+=currentNumeral;
                }
                else{
                    total += currentNumeral;
                    subtracted = false;
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

    private boolean checkValidity(String romanNumeral){
        if(romanNumeral.contains("IIII")){
            return false;
        }
        if(romanNumeral.contains("VV")){
            return false;
        }
        if(romanNumeral.contains("XXXX")){
            return false;
        }
        if(romanNumeral.contains("LL")){
            return false;
        }
        if(romanNumeral.contains("CCCC")){
            return false;
        }
        if(romanNumeral.contains("DD")){
            return false;
        }
        return !romanNumeral.contains("MMMM");
    }
}