package rocks.zipcode.io.quiz3.generics.arrayutility.string;

import org.junit.Test;
import rocks.zipcode.io.quiz3.utils.TestUtils;
import rocks.zipcode.io.quiz3.generics.ArrayUtility;

/**
 * @author leon on 09/12/2018.
 */
public class StringFilterTest {

    @Test
    public void test1() {
        // given
        String[] input = "The quick brown fox jumps over the lazy dog".split(" ");
        String[] expected = input;
        ArrayUtility<String> utility = new ArrayUtility<>(input);



        // when
        String[] actual = utility.filter(string -> string.length() > 2);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }


    @Test
    public void test2() {
        // given
        String[] expected = {"The", "fox", "over", "the", "lazy", "dog"};
        String[] input = "The quick brown fox jumps over the lazy dog".split(" ");
        ArrayUtility<String> utility = new ArrayUtility<>(input);

        // when
        String[] actual = utility.filter(string -> string.length() <= 4);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }


    @Test
    public void test3() {
        // given
        String[] expected = {"brown", "fox", "over", "dog"};
        String[] input = "The quick brown fox jumps over the lazy dog".split(" ");
        ArrayUtility<String> utility = new ArrayUtility<>(input);

        // when
        String[] actual = utility.filter(string -> string.contains("o"));

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }
}
