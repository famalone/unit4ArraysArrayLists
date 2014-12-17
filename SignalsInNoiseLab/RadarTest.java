

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A test class that tests the scan method (from the Radar class) multiple times 
 * 
 * @author Fin Malone 
 * @version December 16 2014
 */
public class RadarTest
{
    /**
     * Default constructor for objects of class RadarTest
     */
    public RadarTest()
    {
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    /**
     * Tests the scan method by scanning until the monster is off the grid and then
     * compares the String from the getVelocity method to the expected String.
     * 
     * THE ALGORITHM ISN'T VERY GOOD. IT WORKS ABOUT 80% OF THE TIME.
     */
    @Test
    public void testScan()
    {
        Radar testRadar = new Radar(100,100,1,2);
        testRadar.setNoiseFraction(0.01);
        
        while(testRadar.isOffGrid() != true)
        {   
            testRadar.scan();
        }
        String monsterVelocity = testRadar.getVelocity();
        assertEquals("The Monster's velocity is: 1, 2",monsterVelocity);
        
        Radar testRadar2 = new Radar(100,100,-2,3);
        testRadar2.setNoiseFraction(0.01);
        
        while(testRadar2.isOffGrid() != true)
        {   
            testRadar2.scan();
        }
        monsterVelocity = testRadar2.getVelocity();
        assertEquals("The Monster's velocity is: -2, 3",monsterVelocity);
    }
}
