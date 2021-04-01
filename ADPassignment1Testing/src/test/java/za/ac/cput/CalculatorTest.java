package za.ac.cput;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator cal1;
    private Calculator cal2;

    @BeforeEach
    public void setUp() throws Exception {
        cal1 = new Calculator();
        cal2 = new Calculator();
    }

    @Test
    void testIdentity()
    {
        assertSame(cal1, cal2);
    }

    @Test
    void  testEquality()
    {
        assertEquals(cal1,cal2);
    }
}