public class NumeralConverter {

    public int convertToInteger(String romanNumeral) {
        if(checkForRepeatedCharacters(romanNumeral)){
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
                    if(checkSubtractionError(previousNumeral,currentNumeral)){
                        return 0;
                    }
                    //prevents multiple subtractions back to back
                    if(subtracted){
                        return 0;
                    }
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

    private boolean checkForRepeatedCharacters(String romanNumeral){
        if(romanNumeral.contains("IIII")){
            return true;
        }
        if(romanNumeral.contains("VV")){
            return true;
        }
        if(romanNumeral.contains("XXXX")){
            return true;
        }
        if(romanNumeral.contains("LL")){
            return true;
        }
        if(romanNumeral.contains("CCCC")){
            return true;
        }
        if(romanNumeral.contains("DD")){
            return true;
        }
        return romanNumeral.contains("MMMM");
    }

    private boolean checkSubtractionError(int previous, int current) {
        //This method makes sure only I,X, and C are able to be subtracted from certain other values
        //i.e. I cannot be subtracted from anything other than V and X
        if (current == 1) {
            return previous != 5 && previous != 10;
        }
        else if (current == 10) {
            return previous != 50 && previous != 100;
        }
        else if (current == 100) {
            return previous != 500 && previous != 1000;
        }
        else {
            return true;
        }
    }
}