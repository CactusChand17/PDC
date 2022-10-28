/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package MVC;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author manu2
 */
public class playerDataTest {
    
    public playerDataTest() {
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
     * Test of getUsername method, of class playerData.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        playerData instance = new playerData();
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setUsername method, of class playerData.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "";
        playerData instance = new playerData();
        instance.setUsername(username);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getPassword method, of class playerData.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        playerData instance = new playerData();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setPassword method, of class playerData.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        playerData instance = new playerData();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getAge method, of class playerData.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        playerData instance = new playerData();
        String expResult = "";
        String result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setAge method, of class playerData.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        String age = "";
        playerData instance = new playerData();
        instance.setAge(age);

    }

    /**
     * Test of getWins method, of class playerData.
     */
    @Test
    public void testGetWins() {
        System.out.println("getWins");
        playerData instance = new playerData();
        int expResult = 0;
        int result = instance.getWins();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setWins method, of class playerData.
     */
    @Test
    public void testSetWins() {
        System.out.println("setWins");
        int wins = 0;
        playerData instance = new playerData();
        instance.setWins(wins);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
