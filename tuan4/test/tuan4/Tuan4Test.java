/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Khac Ngoc
 */
public class Tuan4Test {
    
    public Tuan4Test() {
    }
    /**
     * Test of max method, of class Tuan4.
     */
    @Test
    public void testMax() {
        System.out.println("max");
        int a = 2;
        int b = 3;
        Tuan4 instance = new Tuan4();
        int expResult = 3;
        int result = instance.max(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of minArr method, of class Tuan4.
     */
    @Test
    public void testMinArr() {
        System.out.println("minArr");
        int[] s = {1, 2, 3};
        Tuan4 instance = new Tuan4();
        int expResult = 1;
        int result = instance.minArr(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of BMI method, of class Tuan4.
     */
    @Test
    public void testBMI() {
        System.out.println("BMI");
        float a = 54;
        float b = (float) 1.77;
        Tuan4 instance = new Tuan4();
        String expResult = "Thiếu cân.";
        String result = instance.BMI(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
}
