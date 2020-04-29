/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;
import static data.MyToys.*;
public class MyToysTest {
    
    @Test
    public void testSucceccfull(){
        assertEquals(3, computeFibonaci(2));
        assertEquals(9, computeFibonaci(3));
        assertEquals(7, computeFibonaci(4));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testException(){
        computeFibonaci(-3);
    }
    
}
