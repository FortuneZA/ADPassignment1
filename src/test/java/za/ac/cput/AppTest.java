package za.ac.cput;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**Author:@MathewFortuin
 * Test class using JUnit
 */
public class AppTest 
{
   private App person1;
   private App person2;
   private App person3;

   @Before
    public void setUp()
   {
       person1 = new App();
       person2 = new App();
       person3 = person1;
   }

    //1) ObjectEquality

   @Test


    public void testObjectEquality()  // == Shallow Comparison
   {
       assertSame(person1,person3);
   }

   //2) ObjectIdentity

   @Test
    public void testObjectIdentity()
   {
       assertEquals(person1,person3); // .equals Deep comparison
   }

   //3) FailingTest
   @Test
    public void failingTest()
   {
      assertSame(person1,person2);
   }

   //4)Timeout

   @Test(timeout = 1000)
    public void timeOut()
   {
       while(person1 == person3);

   }

   //5 Disabling Test
//(JUnit 4 uses @Ignore class)
    @Ignore
    @Test
    public void failingTest2()
    {
        assertSame(person2,person3);
    }


}
