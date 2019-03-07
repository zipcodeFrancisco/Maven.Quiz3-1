package rocks.zipcode.io.quiz3.generics.arrayutility.integer;

import org.junit.Test;
import rocks.zipcode.io.quiz3.utils.TestUtils;
import rocks.zipcode.io.quiz3.generics.ArrayUtility;

import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class IntegerFilterTest {

    @Test
    public void test1() {
        // given
        Integer[] array = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12};
        Integer[] expected = new Integer[]{6, 7, 8, 9, 10, 12};
        ArrayUtility<Integer> utility = new ArrayUtility<>(array);
        Function<Integer, Boolean> predicate = val -> val > 5;

        // when
        Integer[] actual = utility.filter(predicate);

        // then
        compare(expected, actual);
    }


    @Test
    public void test2() {
        // given
        Integer[] array = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 51};
        Integer[] expected = new Integer[]{51};
        ArrayUtility<Integer> utility = new ArrayUtility<>(array);
        Function<Integer, Boolean> predicate = val -> val > 50;

        // when
        Integer[] actual = utility.filter(predicate);

        // then
        compare(expected, actual);
    }


    @Test
    public void test3() {
        // given
        Integer[] array = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 98};
        Integer[] expected = array;
        ArrayUtility<Integer> utility = new ArrayUtility<>(array);
        Function<Integer, Boolean> predicate = val -> val < 50;

        // when
        Integer[] actual = utility.filter(predicate);

        // then
        compare(expected, actual);
    }


    @Test
    public void test4() {
        // given
        Integer[] array = new Integer[]{10, 15, 20, 25, 55, 100, 150, 300, 900, 1000};
        Integer[] expected = {15, 150};
        ArrayUtility<Integer> utility = new ArrayUtility<>(array);
        Function<Integer, Boolean> predicate = val -> val.toString().startsWith("15");

        // when
        Integer[] actual = utility.filter(predicate);

        // then
        compare(expected, actual);
    }


    @Test
    public void test5() {
        // given
        Integer[] array = new Integer[]{10, 16, 20, 26, 56, 100, 150, 300, 900, 1000};
        Integer[] expected = {56, 16, 26};
        ArrayUtility<Integer> utility = new ArrayUtility<>(array);
        Function<Integer, Boolean> predicate = val -> val.toString().endsWith("6");

        // when
        Integer[] actual = utility.filter(predicate);

        // then
        compare(expected, actual);
    }

    private void compare(Integer[] expected, Integer[] actual) {
        TestUtils.assertArrayEquals(expected, actual);
    }
}
