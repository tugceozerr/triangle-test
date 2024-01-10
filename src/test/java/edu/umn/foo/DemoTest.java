/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both 
 * {@link Demo#main(String[])} and 
 * {@link Demo#isTriangle(double, double, double)}).
 */
package edu.umn.foo;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class DemoTest {

 @Test
    public void test_is_triangle_1() {
        assertTrue(Demo.isTriangle (3,4,5));
        assertTrue(Demo.isTriangle(5,12,13));
        assertTrue(Demo.isTriangle(5,13,12));        
        assertTrue(Demo.isTriangle(12,13,5));
        assertTrue(Demo.isTriangle(12,5,13));
    
    }

    @Test
    public void test_is_Not_Triangle() {
        assertFalse(Demo.isTriangle(13, 7, 5));
        assertFalse(Demo.isTriangle(5, 7, 13));
        assertFalse(Demo.isTriangle(5, 13, 7));
        assertFalse(Demo.isTriangle(13, 5, 7));
        assertFalse(Demo.isTriangle(5, 9, 3));
        assertFalse(Demo.isTriangle(1, 2, -1));
    }

    
