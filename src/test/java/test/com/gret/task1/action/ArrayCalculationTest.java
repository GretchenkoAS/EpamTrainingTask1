package test.com.gret.task1.action;

import com.gret.task1.action.ArrayCalculation;
import com.gret.task1.action.ArrayChanging;
import com.gret.task1.builder.ArrayBuilder;
import com.gret.task1.entity.Array;
import com.gret.task1.exeption.ArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class ArrayCalculationTest {
    static Logger logger = LogManager.getLogger();
    ArrayBuilder arrayBuilder;
    Array array;

    @BeforeClass
    public void setUp() throws ArrayException {
        arrayBuilder = new ArrayBuilder(4);
        int[] arr = { 1, -2, 3, -4 };
        arrayBuilder.setArray(arr);
        array = arrayBuilder.build();
    }

    @AfterClass
    public void tearDown() {
        arrayBuilder = null;
        array = null;
    }

    @Test
    public void minElementPositiveTest() throws ArrayException {
        logger.info("minElementPositiveTest");
        ArrayCalculation arrayCalculation = new ArrayCalculation();
        int actual = arrayCalculation.minElement(array);
        logger.debug("actual: " + actual);
        int expected = -4;
        assertEquals(actual, expected);
    }

    @Test
    public void minElementNegativeTest() throws ArrayException {
        logger.info("minElementNegativeTest");
        ArrayCalculation arrayCalculation = new ArrayCalculation();
        int actual = arrayCalculation.minElement(array);
        logger.debug("actual: " + actual);
        int expected = -2;
        assertNotEquals(actual, expected);

    }

    @Test
    public void maxElementPositiveTest() throws ArrayException {
        logger.info("maxElementPositiveTest");
        ArrayCalculation arrayCalculation = new ArrayCalculation();
        int actual = arrayCalculation.maxElement(array);
        logger.debug("actual: " + actual);
        int expected = 3;
        assertEquals(actual, expected);
    }

    @Test
    public void maxElementNegativeTest() throws ArrayException {
        logger.info("maxElementNegativeTest");
        ArrayCalculation arrayCalculation = new ArrayCalculation();
        int actual = arrayCalculation.maxElement(array);
        logger.debug("actual: " + actual);
        int expected = -4;
        assertNotEquals(actual, expected);
    }

    @Test
    public void averageValuePositiveTest() throws ArrayException {
        logger.info("averageValuePositiveTest");
        ArrayCalculation arrayCalculation = new ArrayCalculation();
        double actual = arrayCalculation.averageValue(array);
        logger.debug("actual: " + actual);
        double expected = -0.5;
        assertEquals(actual, expected, 0.00001);
    }

    @Test
    public void averageValueNegativeTest() throws ArrayException {
        logger.info("averageValueNegativeTest");
        ArrayCalculation arrayCalculation = new ArrayCalculation();
        double actual = arrayCalculation.averageValue(array);
        logger.debug("actual: " + actual);
        double expected = -0.125;
        assertNotEquals(actual, expected, 0.00001);
    }

    @Test
    public void numberOfPositiveElementPositiveTest() throws ArrayException {
        logger.info("numberOfPositiveElementPositiveTest");
        ArrayCalculation arrayCalculation = new ArrayCalculation();
        int actual = arrayCalculation.numberOfPositiveElement(array);
        logger.debug("actual: " + actual);
        int expected = 2;
        assertEquals(actual, expected);
    }

    @Test
    public void numberOfPositiveElementNegativeTest() throws ArrayException {
        logger.info("numberOfPositiveElementNegativeTest");
        ArrayCalculation arrayCalculation = new ArrayCalculation();
        int actual = arrayCalculation.numberOfPositiveElement(array);
        logger.debug("actual: " + actual);
        int expected = 3;
        assertNotEquals(actual, expected);
    }

    @Test
    public void numberOfNegativeElementPositiveTest() throws ArrayException {
        logger.info("numberOfNegativeElementPositiveTest");
        ArrayCalculation arrayCalculation = new ArrayCalculation();
        int actual = arrayCalculation.numberOfNegativeElement(array);
        logger.debug("actual: " + actual);
        int expected = 2;
        assertEquals(actual, expected);
    }

    @Test
    public void numberOfNegativeElementNegativeTest() throws ArrayException {
        logger.info("numberOfNegativeElementNegativeTest");
        ArrayCalculation arrayCalculation = new ArrayCalculation();
        int actual = arrayCalculation.numberOfNegativeElement(array);
        logger.debug("actual: " + actual);
        int expected = 3;
        assertNotEquals(actual, expected);
    }
}
