import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumeralConverterTest {
    @Test
    public void convert_I_ToOneTest(){
        NumeralConverter numeralConverter = new NumeralConverter();
        Assertions.assertEquals(numeralConverter.convertToInteger("I"),1);
    }
    @Test
    public void convert_II_ToTwoTest(){
        NumeralConverter numeralConverter = new NumeralConverter();
        Assertions.assertEquals(numeralConverter.convertToInteger("II"),2);
    }
    @Test
    public void convert_V_ToFiveTest(){
        NumeralConverter numeralConverter = new NumeralConverter();
        Assertions.assertEquals(numeralConverter.convertToInteger("V"),5);
    }
    @Test
    public void convert_X_ToTenTest(){
        NumeralConverter numeralConverter = new NumeralConverter();
        Assertions.assertEquals(numeralConverter.convertToInteger("X"),10);
    }
}