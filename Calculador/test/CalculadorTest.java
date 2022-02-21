/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Paqui Elena
 */
public class CalculadorTest {
    
    public CalculadorTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of suma method, of class Calculador.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        Calculador instance = null;
        int expResult = 0;
        int result = instance.suma();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resta method, of class Calculador.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        Calculador instance = null;
        int expResult = 0;
        int result = instance.resta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiplica method, of class Calculador.
     */
    @Test
    public void testMultiplica() {
        System.out.println("multiplica");
        Calculador instance = null;
        int expResult = 0;
        int result = instance.multiplica();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of divide method, of class Calculador.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        Calculador instance = null;
        int expResult = 0;
        int result = instance.divide();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of divide0 method, of class Calculador.
     */
    @Test
    public void testDivide0() {
        System.out.println("divide0");
        Calculador instance = null;
        int expResult = 0;
        int result = instance.divide0();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
