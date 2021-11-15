/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package cuenta;

import junit.framework.TestCase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Aburo Senpai
 */
public class CuentaTest extends TestCase {

    Cuenta a;
    Cuenta b;

    public CuentaTest() {
        a = new Cuenta(12345, 50);
        b = new Cuenta(67890, 0);
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of retirar method, of class Cuenta.
     */
    @Test
    public void testRetirar() {

        assertEquals(-150, a.retirar(200));
        assertEquals(-350, b.retirar(350));

    }

    /**
     * Test of depositar method, of class Cuenta.
     */
    @Test
    public void testDepositar() {
        assertEquals(100, a.depositar(100));
        assertEquals(50, b.depositar(50));

    }

}
