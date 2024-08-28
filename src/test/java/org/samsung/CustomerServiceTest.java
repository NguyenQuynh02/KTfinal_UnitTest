package org.samsung;

import static org.junit.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void testCustomerName() {
        Customer customer = new Customer();
        customer.setName("Duke");
        assertEquals("Duke", customer.getName());
    }

    @Test
    public void testCustomerNumber() {
        Customer customer = new Customer();
        customer.setNumber("C042");
        assertEquals("C042", customer.getNumber());
    }

    @Test
    public void testCustomerEmail() {
        Customer customer = new Customer();
        customer.setEmail("duke@java.org");
        assertEquals("duke@java.org", customer.getEmail());
    }
}
