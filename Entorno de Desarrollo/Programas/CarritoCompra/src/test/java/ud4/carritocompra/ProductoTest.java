/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ud4.carritocompra;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author DAM114
 */
public class ProductoTest {
    private Producto prod1;
    public ProductoTest() {
    }

   
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        prod1 = new Producto("P001", "Plasma TV LG32", "Plasma TV with TDT Decod. and high resolution Screen",699.99);
        
        
    }
    
    @AfterEach
    public void tearDown() {
        prod1 = null;
        
    }

    /**
     * Test of getCodigo method, of class Producto.
     */
    @org.junit.jupiter.api.Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Producto instance = prod1;
        String expResult = "P001";
        String result = instance.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Producto.
     */
    @org.junit.jupiter.api.Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Producto instance = prod1;
        String expResult = "Plasma TV LG32";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripcion method, of class Producto.
     */
    @org.junit.jupiter.api.Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Producto instance = prod1;
        String expResult = "Plasma TV with TDT Decod. and high resolution Screen";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecio method, of class Producto.
     */
    @org.junit.jupiter.api.Test
    public void testGetPrecio() {
        System.out.println("getPrecio");
        Producto instance = prod1;
        double expResult = 699.99;
        double result = instance.getPrecio();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecio method, of class Producto.
     */
    @org.junit.jupiter.api.Test
    public void testSetPrecio() {
        System.out.println("setPrecio");
        double precio = 599.99;
        Producto instance = prod1;
        instance.setPrecio(precio);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Producto.
     */
    @org.junit.jupiter.api.Test
    public void testToString() {
        System.out.println("toString");
        Producto instance = prod1;
        String expResult = "Producto{codigo=P001, nombre=Plasma TV LG32, descripcion=Plasma TV with TDT Decod. and high resolution Screen, precio=699.99}";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
