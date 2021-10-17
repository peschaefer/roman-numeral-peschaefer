import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumeralConverterTest {
    @Test
    public void convertIToOneTest(){
        NumeralConverter numeralConverter = new NumeralConverter();
        Assertions.assertEquals(numeralConverter.convertToInteger("I"),1);
    }
}
