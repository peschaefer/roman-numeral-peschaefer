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
    @Test
    public void convert_L_ToFiftyTest(){
        NumeralConverter numeralConverter = new NumeralConverter();
        Assertions.assertEquals(numeralConverter.convertToInteger("L"),50);
    }
    @Test
    public void convert_C_To100Test(){
        NumeralConverter numeralConverter = new NumeralConverter();
        Assertions.assertEquals(numeralConverter.convertToInteger("C"),100);
    }
    @Test
    public void convert_D_To500Test(){
        NumeralConverter numeralConverter = new NumeralConverter();
        Assertions.assertEquals(numeralConverter.convertToInteger("D"),500);
    }
    @Test
    public void convert_M_To1000Test(){
        NumeralConverter numeralConverter = new NumeralConverter();
        Assertions.assertEquals(numeralConverter.convertToInteger("M"),1000);
    }
    @Test
    public void convert_MDCLXVI_To1666Test(){
        NumeralConverter numeralConverter = new NumeralConverter();
        Assertions.assertEquals(numeralConverter.convertToInteger("MDCLXVI"),1666);
    }
    @Test
    public void convert_IV_To4Test(){
        NumeralConverter numeralConverter = new NumeralConverter();
        Assertions.assertEquals(numeralConverter.convertToInteger("IV"),4);
    }
    @Test
    public void convert_XIV_To14Test(){
        NumeralConverter numeralConverter = new NumeralConverter();
        Assertions.assertEquals(numeralConverter.convertToInteger("XIV"),14);
    }
    @Test
    public void convert_MMCMXCIX_To2999Test(){
        NumeralConverter numeralConverter = new NumeralConverter();
        Assertions.assertEquals(numeralConverter.convertToInteger("MMCMXCIX"),2999);
    }
    @Test
    public void convert_IIV_To0Test(){
        NumeralConverter numeralConverter = new NumeralConverter();
        Assertions.assertEquals(numeralConverter.convertToInteger("IIV"),0);
    }
}