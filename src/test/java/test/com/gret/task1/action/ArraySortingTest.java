package test.com.gret.task1.action;

import com.gret.task1.action.ArraySorting;
import com.gret.task1.entity.CustomArray;
import com.gret.task1.exeption.ArrayException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class ArraySortingTest {
    CustomArray customArray;

    @BeforeClass
    public void setUp() {
        int[] arr = {1, -2, 3, -4};
        customArray = new CustomArray(arr);
    }

    @AfterClass
    public void tearDown() {
        customArray = null;
    }

    @Test
    public void bubbleSortPositiveTest() throws ArrayException {
        ArraySorting arraySorting = new ArraySorting();
        arraySorting.bubbleSort(customArray);
        int[] actual = customArray.getArray();
        int[] expected = {-4, -2, 1, 3};
        assertTrue("Arrays are not equal", java.util.Arrays.equals(actual, expected));
    }

    @Test
    public void bubbleSortNegativeTest() throws ArrayException {
        ArraySorting arraySorting = new ArraySorting();
        arraySorting.bubbleSort(customArray);
        int[] actual = customArray.getArray();
        int[] expected = {1, -2, 3, -4};
        assertTrue("Arrays are equal", !java.util.Arrays.equals(actual, expected));
    }

    @Test
    public void hoareSortPositiveTest() throws ArrayException {
        ArraySorting arraySorting = new ArraySorting();
        arraySorting.hoareSort(customArray,0,customArray.size()-1);
        int[] actual = customArray.getArray();
        int[] expected = {-4, -2, 1, 3};
        assertTrue("Arrays are not equal", java.util.Arrays.equals(actual, expected));
    }

    @Test
    public void hoareSortNegativeTest() throws ArrayException {
        ArraySorting arraySorting = new ArraySorting();
        arraySorting.hoareSort(customArray,0,customArray.size()-1);
        int[] actual = customArray.getArray();
        int[] expected = {1, -2, 3, -4};
        assertTrue("Arrays are equal", !java.util.Arrays.equals(actual, expected));
    }

    @Test
    public void selectionSortPositiveTest() throws ArrayException {
        ArraySorting arraySorting = new ArraySorting();
        arraySorting.selectionSort(customArray);
        int[] actual = customArray.getArray();
        int[] expected = {-4, -2, 1, 3};
        assertTrue("Arrays are not equal", java.util.Arrays.equals(actual, expected));
    }

    @Test
    public void selectionSortNegativeTest() throws ArrayException {
        ArraySorting arraySorting = new ArraySorting();
        arraySorting.selectionSort(customArray);
        int[] actual = customArray.getArray();
        int[] expected = {1, -2, 3, -4};
        assertTrue("Arrays are equal", !java.util.Arrays.equals(actual, expected));
    }

}
