import org.junit.Test;

import static org.junit.Assert.*;

public class InsuranceCalculatorTest {

    @Test
    public void TenThousandBracket(){
        assertEquals(3650,insuranceFor(10000),0);
    }

    @Test
    public void ThirtyThousandBracket(){
        assertEquals(39600,insuranceFor(30000),0);
    }

    @Test
    public void SixtyThousandBracket(){
        assertEquals(79500,insuranceFor(60000),0);
    }

    private double insuranceFor(double income){
        return new InsuranceCalculator().calculateInsurance(income);
    }
}