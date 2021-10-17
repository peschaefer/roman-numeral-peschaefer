public class NumeralConverter {

    public int convertToInteger(String romanNumeral) {
        int total = 0;
        for(int index = 0; index < romanNumeral.length();index++){
            char letter = romanNumeral.charAt(index);
            if (letter == 'I'){
                total+=1;
            }
            else if (letter == 'V'){
                total+=5;
            }
            else if (letter == 'X'){
                total+=10;
            }
            else if (letter == 'L'){
                total+=50;
            }
            else if (letter == 'C'){
                total+=100;
            }
            else if (letter == 'D'){
                total+=500;
            }
        }
        return total;
    }
}