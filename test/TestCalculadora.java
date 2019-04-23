/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import calculadora.Calculadora;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author PC04
 */
public class TestCalculadora {
   
    
    public TestCalculadora() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testSuma() {
     int sum = (int) Calculadora.suma(8,4);
      assertEquals(sum, 12);
    }
    @Test
    public void testRest() {
     int res = (int) Calculadora.resta(8,4);
      assertEquals(res, 4);
    }
    @Test
    public void testDiv() {
     int div = (int) Calculadora.multiplica(8,4);
      assertEquals(div, 32);
    }
    @Test
    public void testMultip() {
     int Mult = (int) Calculadora.divide(8,4);
      assertEquals(Mult, 2);
    }
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
