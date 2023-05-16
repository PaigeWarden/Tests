import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Calculator {
    public int add(int num1, int num2){
        return num1+num2;
    }

    static class CalculatorTest {
        Calculator cal = new Calculator();
        @Test
    void TwoPlusTwoEqualsFour(){
            assertEquals(4,cal.add(2,2));
        }
        @Test
        void TwoPlusTwoEqualsFive(){
            assertEquals(5,cal.add(2,3));
        }
        @Test
        void FivePlusFiveEqualsTen(){
            assertEquals(10,cal.add(5,5));
        }
    }
}
