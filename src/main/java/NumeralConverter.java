public class NumeralConverter {

    public int convertToInteger(String romanNumeral) {
        int total = 0;
        for(int index = 0; index < romanNumeral.length();index++){
            char letter = romanNumeral.charAt(index);
            if (letter == 'I'){
                total+=1;
            }
        }
        return total;
    }
}
