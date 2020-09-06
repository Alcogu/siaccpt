/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package siacppt;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class hiloTest {
    
    public hiloTest() {
    }

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
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
     * Test of combo method, of class hilo.
     */
    @org.junit.Test
    public void testCombo() {
        System.out.println("combo");
        hilo instance = new hilo();
        instance.combo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of liscombo method, of class hilo.
     */
    @org.junit.Test
    public void testLiscombo() {
        System.out.println("liscombo");
        hilo instance = new hilo();
        instance.liscombo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertHilo method, of class hilo.
     */
    @org.junit.Test
    public void testInsertHilo() {
        System.out.println("insertHilo");
        hilo instance = new hilo();
        instance.insertHilo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class hilo.
     */
    @org.junit.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        hilo.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
