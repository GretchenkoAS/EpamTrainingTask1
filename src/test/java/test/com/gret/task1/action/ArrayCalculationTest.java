package test.com.gret.task1.action;

import com.gret.task1.action.ArrayCalculation;
import com.gret.task1.action.ArrayChanging;
import com.gret.task1.builder.ArrayBuilder;
import com.gret.task1.entity.Array;
import com.gret.task1.exeption.ArrayException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class ArrayCalculationTest {
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
        ArrayCalculation arrayCalculation = new ArrayCalculation();
        int actual = arrayCalculation.minElement(array);
        int expected = -4;
        assertEquals(actual, expected);
    }

    @Test
    public void minElementNegativeTest() throws ArrayException {
        ArrayCalculation arrayCalculation = new ArrayCalculation();
        int actual = arrayCalculation.minElement(array);
        int expected = -2;
        assertNotEquals(actual, expected);

    }

    @Test
    public void maxElementPositiveTest() throws ArrayException {
        ArrayCalculation arrayCalculation = new ArrayCalculation();
        int actual = arrayCalculation.maxElement(array);
        int expected = 3;
        assertEquals(actual, expected);
    }

    @Test
    public void maxElementNegativeTest() throws ArrayException {
        ArrayCalculation arrayCalculation = new ArrayCalculation();
        int actual = arrayCalculation.maxElement(array);
        int expected = -4;
        assertNotEquals(actual, expected);
    }

    @Test
    public void averageValuePositiveTest() throws ArrayException {
        ArrayCalculation arrayCalculation = new ArrayCalculation();
        double actual = arrayCalculation.averageValue(array);
        double expected = -0.5;
        assertEquals(actual, expected, 0.00001);
    }

    @Test
    public void averageValueNegativeTest() throws ArrayException {
        ArrayCalculation arrayCalculation = new ArrayCalculation();
        double actual = arrayCalculation.averageValue(array);
        double expected = -0.125;
        assertNotEquals(actual, expected, 0.00001);
    }

    @Test
    public void numberOfPositiveElementPositiveTest() throws ArrayException {
        ArrayCalculation arrayCalculation = new ArrayCalculation();
        int actual = arrayCalculation.numberOfPositiveElement(array);
        int expected = 2;
        assertEquals(actual, expected);
    }

    @Test
    public void numberOfPositiveElementNegativeTest() throws ArrayException {
        ArrayCalculation arrayCalculation = new ArrayCalculation();
        int actual = arrayCalculation.numberOfPositiveElement(array);
        int expected = 3;
        assertNotEquals(actual, expected);
    }

    @Test
    public void numberOfNegativeElementPositiveTest() throws ArrayException {
        ArrayCalculation arrayCalculation = new ArrayCalculation();
        int actual = arrayCalculation.numberOfNegativeElement(array);
        int expected = 2;
        assertEquals(actual, expected);
    }

    @Test
    public void numberOfNegativeElementNegativeTest() throws ArrayException {
        ArrayCalculation arrayCalculation = new ArrayCalculation();
        int actual = arrayCalculation.numberOfNegativeElement(array);
        int expected = 3;
        assertNotEquals(actual, expected);
    }

}
