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
public class TrainingTest {
    
    public TrainingTest() {
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
     * Test of run method, of class Training.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        Training instance = new Training(1);
        instance.run();
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of trainPlayer method, of class Training.
     */
    @Test
    public void testTrainPlayer() {
        System.out.println("trainPlayer");
        Training instance = new Training(1);
        instance.trainPlayer();
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
