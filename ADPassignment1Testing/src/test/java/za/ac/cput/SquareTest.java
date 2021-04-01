package za.ac.cput;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest
{

    private Square squareA;
    private Square squareB;
    private Square squareD;

    @Before
    public void setUp()
    {
        squareA = new Square(2,2);
        squareB = new Square(2,2);
        squareD = squareA;
    }

    @Test
    public void testObjectEquality()
    {
        assertEquals(squareA, squareB);
        fail("Test failing deliberately");
    }

    @Test
    public void testObjectIdentity()
    {
        assertSame(squareA, squareD);
    }

    @Test
    public void testFail()
    {

    }
}