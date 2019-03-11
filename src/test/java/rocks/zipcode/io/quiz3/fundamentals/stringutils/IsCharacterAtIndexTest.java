package rocks.zipcode.io.quiz3.fundamentals.stringutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz3.fundamentals.StringUtils;

/**
 * @author leon on 09/12/2018.
 */
public class IsCharacterAtIndexTest {
    @Test
    public void test1() {
        // given
        String string = "Shenanigan";
        Character character = 'S';
        Integer index = 0;

        // then
        Assert.assertTrue(StringUtils.isCharacterAtIndex(string, character, index));
    }

    @Test
    public void test2() {
        String string = "Shenanigan";
        Character character = 's';

        Integer index = 0;

        // then
        Assert.assertFalse(StringUtils.isCharacterAtIndex(string, character, index));
    }


    @Test
    public void test3() {
        // given
        String string = "Shenanigan";
        Character character = 'n';
        Integer index = 9;

        // then
        Assert.assertTrue(StringUtils.isCharacterAtIndex(string, character, index));
    }

    @Test
    public void test4() {
        // given
        String string = "Shenanigan";
        Character character = 'h';
        Integer index = 1;

        // then
        Assert.assertTrue(StringUtils.isCharacterAtIndex(string, character, index));
    }

}
