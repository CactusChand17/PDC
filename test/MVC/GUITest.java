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
public class GUITest {
    
    public GUITest() {
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
     * Test of loginInit method, of class GUI.
     */
    @Test
    public void testLoginInit() {
        System.out.println("loginInit");
        GUI instance = new GUI();
        instance.loginInit();
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of classSelectionInit method, of class GUI.
     */
    @Test
    public void testClassSelectionInit() {
        System.out.println("classSelectionInit");
        GUI instance = new GUI();
        instance.classSelectionInit();
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of mainMenuInit method, of class GUI.
     */
    @Test
    public void testMainMenuInit() {
        System.out.println("mainMenuInit");
        GUI instance = new GUI();
        instance.mainMenuInit();

    }

    /**
     * Test of statsMenuInit method, of class GUI.
     */
    @Test
    public void testStatsMenuInit() {
        System.out.println("statsMenuInit");
        GUI instance = new GUI();
        instance.statsMenuInit();

    }

    /**
     * Test of trainingMenuInit method, of class GUI.
     */
    @Test
    public void testTrainingMenuInit() {
        System.out.println("trainingMenuInit");
        GUI instance = new GUI();
        instance.trainingMenuInit();
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of selectionMenuInit method, of class GUI.
     */
    @Test
    public void testSelectionMenuInit() {
        System.out.println("selectionMenuInit");
        GUI instance = new GUI();
        instance.selectionMenuInit();
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of FightingMenuInit method, of class GUI.
     */
    @Test
    public void testFightingMenuInit() {
        System.out.println("FightingMenuInit");
        GUI instance = new GUI();
        instance.FightingMenuInit();
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of main method, of class GUI.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        GUI.main(args);

    }

    /**
     * Test of getCharacter method, of class GUI.
     */
    @Test
    public void testGetCharacter() {
        System.out.println("getCharacter");
        GUI instance = new GUI();
        Character expResult = null;
        Character result = null;
        assertEquals(expResult, result);

    }

    /**
     * Test of setCharacter method, of class GUI.
     */
    @Test
    public void testSetCharacter() {
        System.out.println("setCharacter");
        Character character = null;
        GUI instance = new GUI();
        instance.setCharacter(character);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of isReset method, of class GUI.
     */
    @Test
    public void testIsReset() {
        System.out.println("isReset");
        GUI instance = new GUI();
        boolean expResult = false;
        boolean result = instance.isReset();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setReset method, of class GUI.
     */
    @Test
    public void testSetReset() {
        System.out.println("setReset");
        boolean reset = false;
        GUI instance = new GUI();
        instance.setReset(reset);
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
