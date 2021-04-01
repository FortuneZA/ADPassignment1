package za.ac.cput;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest
{

    private Square squareA;
    private Square squareB;
    private Square squareD;
    private Square squareF;

    @Before
    public void setUp()
    {
        squareA = new Square(2,2);
        squareB = new Square(2,2);
        squareD = squareA;
        squareF = new Square();
    }

    @Test
    public void testObjectEquality()
    {
        assertEquals(squareA, squareD);
    }

    @Test(timeout = 1000)
    public void testObjectIdentity()
    {
        assertSame(squareA, squareD);
    }

    @Test
    public void testFail()
    {
        if(squareA != squareB)
        {
            fail("Square A is equal to Square B");
        }
    }

    @Ignore("Needs adjustments")
    @Test
    public void testIgnore()
    {
        assertNotEquals(squareA, squareF);
    }


    }

