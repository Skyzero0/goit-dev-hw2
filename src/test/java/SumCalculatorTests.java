import org.example.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTests {
    SumCalculator sumCalc;

    @BeforeEach
    public void beforeEach (){
        sumCalc = new SumCalculator();
    }

    @Test
    public void thatSumCalculatorWorksFor1(){
        int actual = sumCalc.sum(1);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void thatSumCalculatorWorksFor3(){
        int actual = sumCalc.sum(3);
        int expected = 6;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void thatSumCalculatorThrowsException(){
        int actual = 0;
        Assertions.assertThrows(IllegalArgumentException.class, ()->
                sumCalc.sum(actual));
    }
}
