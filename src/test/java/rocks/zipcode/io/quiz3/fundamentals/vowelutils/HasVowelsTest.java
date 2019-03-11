package rocks.zipcode.io.quiz3.fundamentals.vowelutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz3.fundamentals.VowelUtils;

/**
 * @author leon on 09/12/2018.
 */
public class HasVowelsTest {
    @Test
    public void test() {
        test1();
        test2();
        test3();
    }
    public void test1() {
        String input = "qwrtyps_dfghjklzxcvbnm";
        Assert.assertFalse(VowelUtils.hasVowels(input));
    }

    public void test2() {
        String input = "_a";
        Assert.assertTrue(VowelUtils.hasVowels(input));
    }

    public void test3() {
        String input = "!e";
        Assert.assertTrue(VowelUtils.hasVowels(input));
    }
}
