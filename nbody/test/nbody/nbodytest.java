/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbody;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author anjul_000
 */
public class nbodytest {

    protected static final double[] a = {1, 2}, b = {2, 3};
    protected static Vector va = new Vector(a), vb = new Vector(b);

    public nbodytest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // Test the vector class
    @Test
    public void testDot() {
        double r = va.dot(vb);
        assertEquals(8.0, r, 0.0);
    } //test dot

    @Test
    public void testMagnitude() {
        double r = va.magnitude();
        assertEquals(Math.sqrt(5), r, 0.0);
    }

    @Test
    public void testMinus() {
        Vector r = va.minus(vb);
        double[] e = {-1, -1};
        Vector ve = new Vector(e);
        assertEquals(ve.cartesian(0), r.cartesian(0), 0.0);
        assertEquals(ve.cartesian(1), r.cartesian(1), 0.0);
    }
}
