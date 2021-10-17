import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumeralConverterTest {
    @Test
    public void convert_I_ToOneTest(){
        NumeralConverter numeralConverter = new NumeralConverter();
        Assertions.assertEquals(1,numeralConverter.convertToInteger("I"));
    }
    @Test
    public void convert_II_ToTwoTest(){
        NumeralConverter numeralConverter = new NumeralConverter();
        Assertions.assertEquals(2,numeralConverter.convertToInteger("II"));
    }
    @Test
    public void convert_V_ToFiveTest(){
        NumeralConverter numeralConverter = new NumeralConverter();
        Assertions.assertEquals(5,numeralConverter.convertToInteger("V"));
    }
    @Test
    public void convert_X_ToTenTest(){
        NumeralConverter numeralConverter = new NumeralConverter();
        Assertions.assertEquals(10,numeralConverter.convertToInteger("X"));
    }
    @Test
    public void convert_L_ToFiftyTest(){
        NumeralConverter numeralConverter = new NumeralConverter();
        Assertions.assertEquals(50,numeralConverter.convertToInteger("L"));
    }
    @Test
    public void convert_C_To100Test(){
        NumeralConverter numeralConverter = new NumeralConverter();
        Assertions.assertEquals(100,numeralConverter.convertToInteger("C"));
    }
    @Test
    public void convert_D_To500Test(){
        NumeralConverter numeralConverter = new NumeralConverter();
        Assertions.assertEquals(500,numeralConverter.convertToInteger("D"));
    }
    @Test
    public void convert_M_To1000Test(){
        NumeralConverter numeralConverter = new NumeralConverter();
        Assertions.assertEquals(1000,numeralConverter.convertToInteger("M"));
    }
    @Test
    public void convert_MDCLXVI_To1666Test(){
        NumeralConverter numeralConverter = new NumeralConverter();
        Assertions.assertEquals(1666,numeralConverter.convertToInteger("MDCLXVI"));
    }
    @Test
    public void convert_IV_To4Test(){
        NumeralConverter numeralConverter = new NumeralConverter();
        Assertions.assertEquals(4,numeralConverter.convertToInteger("IV"));
    }
    @Test
    public void convert_XIV_To14Test(){
        NumeralConverter numeralConverter = new NumeralConverter();
        Assertions.assertEquals(14,numeralConverter.convertToInteger("XIV"));
    }
    @Test
    public void convert_MMCMXCIX_To2999Test(){
        NumeralConverter numeralConverter = new NumeralConverter();
        Assertions.assertEquals(2999,numeralConverter.convertToInteger("MMCMXCIX"));
    }
    @Test
    public void convert_IIV_To0Test(){
        NumeralConverter numeralConverter = new NumeralConverter();
        Assertions.assertEquals(0,numeralConverter.convertToInteger("IIV"));
    }
    @Test
    public void convert_MMMM_To0Test(){
        NumeralConverter numeralConverter = new NumeralConverter();
        Assertions.assertEquals(0,numeralConverter.convertToInteger("MMMM"));
    }
}