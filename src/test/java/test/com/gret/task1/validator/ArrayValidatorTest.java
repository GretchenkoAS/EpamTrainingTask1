package test.com.gret.task1.validator;

import com.gret.task1.validator.ArrayValidator;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class ArrayValidatorTest {
    ArrayValidator validator;

    @Test
    public void parseLineToIntArrayPositiveTest() {
        String line = "1, 2, 3, 4, 5";
        String delimiter = ", ";
        assertTrue(validator.isStringArray(line, delimiter));
    }

    @Test
    public void parseLineToIntArrayNegativeTest() {
        String line = "1  2 3   d";
        String delimiter = " ";
        assertFalse(validator.isStringArray(line, delimiter));
    }

}
