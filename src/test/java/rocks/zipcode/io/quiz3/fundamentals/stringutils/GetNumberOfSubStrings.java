package rocks.zipcode.io.quiz3.fundamentals.stringutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz3.fundamentals.StringUtils;

/**
 * @author leon on 10/12/2018.
 */
public class GetNumberOfSubStrings {
    @Test
    public void test1() {
        // given
        String input = "Bracer";
        Integer expected = 24;

        // when
        Integer actual = StringUtils.getNumberOfSubStrings(input);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        String input = "Flame";
        Integer expected = 15;

        // when
        Integer actual = StringUtils.getNumberOfSubStrings(input);

        // then
        Assert.assertEquals(expected, actual);
    }
}
