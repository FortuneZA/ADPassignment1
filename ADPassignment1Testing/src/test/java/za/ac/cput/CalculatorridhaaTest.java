package za.ac.cput;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


import static org.junit.Assert.*;

//authour: Ridhaa Flanders - 218204191
public class CalculatorridhaaTest {

    private Calculatorridhaa cal1;
    private Calculatorridhaa cal2;
    private Calculatorridhaa cal3;

    @Before
    public void setUp() throws Exception {
        cal1 = new Calculatorridhaa();
        cal2 = cal1;
        cal3 = new Calculatorridhaa();
    }

    //test object identity
    @Test
    public void testIdentity()
    {
        assertSame(cal1, cal1);
    }

    //test object equality
    @Test
    public void  testEquality()
    {
        assertEquals(cal1,cal2);
    }

    //test for fail
    @Test
    public void testFail()
    {
        assertSame(cal1, cal1);
        fail("Demonstrate Failure");
    }

    //timeout test
    @Test(timeout = 6000)
    public void testTimeout()
    {
        cal3.countToFive();
    }

    //Disable Test
    @Ignore
    @Test
    public void testAddition()
    {
        int result = cal3.addition(5,5);
        assertEquals(result,result);
    }
}