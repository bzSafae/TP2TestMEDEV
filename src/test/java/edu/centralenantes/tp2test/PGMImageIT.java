/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package edu.centralenantes.tp2test;

import java.awt.image.BufferedImage;
import java.nio.file.Path;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dodi
 */
public class PGMImageIT {
    
    public PGMImageIT() {
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

    /**
     * Test of getWidth method, of class PGMImage.
     */
    @Test
    public void testGetWidth() {
        System.out.println("getWidth");
        PGMImage instance = null;
        int expResult = 0;
        int result = instance.getWidth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHeight method, of class PGMImage.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        PGMImage instance = null;
        int expResult = 0;
        int result = instance.getHeight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class PGMImage.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int x = 0;
        int y = 0;
        PGMImage instance = null;
        int expResult = 0;
        int result = instance.get(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set method, of class PGMImage.
     */
    @Test
    public void testSet() {
        System.out.println("set");
        int x = 0;
        int y = 0;
        int value = 0;
        PGMImage instance = null;
        instance.set(x, y, value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class PGMImage.
     */
    @Test
    public void testRead() throws Exception {
        System.out.println("read");
        Path path = null;
        PGMImage expResult = null;
        PGMImage result = PGMImage.read(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of write method, of class PGMImage.
     */
    @Test
    public void testWrite() throws Exception {
        System.out.println("write");
        Path path = null;
        PGMImage instance = null;
        instance.write(path);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toBufferedImage method, of class PGMImage.
     */
    @Test
    public void testToBufferedImage() {
        System.out.println("toBufferedImage");
        PGMImage instance = null;
        BufferedImage expResult = null;
        BufferedImage result = instance.toBufferedImage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of threshold method, of class PGMImage.
     */
    @Test
    public void testThreshold() {
        System.out.println("threshold");
        int t = 0;
        PGMImage instance = null;
        PGMImage expResult = null;
        PGMImage result = instance.threshold(t);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of histogram method, of class PGMImage.
     */
    @Test
    public void testHistogram() {
        System.out.println("histogram");
        PGMImage instance = null;
        int[] expResult = null;
        int[] result = instance.histogram();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of histogramAsImage method, of class PGMImage.
     */
    @Test
    public void testHistogramAsImage() {
        System.out.println("histogramAsImage");
        PGMImage instance = null;
        PGMImage expResult = null;
        PGMImage result = instance.histogramAsImage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
