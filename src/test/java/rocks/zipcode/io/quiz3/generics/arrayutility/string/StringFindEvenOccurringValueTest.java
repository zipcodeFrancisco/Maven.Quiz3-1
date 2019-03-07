package rocks.zipcode.io.quiz3.generics.arrayutility.string;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz3.generics.ArrayUtility;

/**
 * @author leon on 09/12/2018.
 */
public class StringFindEvenOccurringValueTest {
    @Test
    public void test1() {
        // given
        String expected = "adas";
        String[] array = {expected, expected, "Code", "Code", "Code", "Wilmington"};
        ArrayUtility<String> utility = new ArrayUtility<>(array);

        // when
        String actual = utility.findEvenOccurringValue();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        String expected = "(45 4h";
        String[] array = {expected, expected, "Code", "Code", "Code", expected, expected, "Wilmington"};
        ArrayUtility<String> utility = new ArrayUtility<>(array);

        // when
        String actual = utility.findEvenOccurringValue();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        // given
        String expected = ";lk";
        String[] array = {"Zip", "Zip", "Zip", expected, expected, expected, "Wilmington", expected, expected, expected};
        ArrayUtility<String> utility = new ArrayUtility<>(array);

        // when
        String actual = utility.findEvenOccurringValue();
        Assert.assertEquals(expected, actual);
    }

}
