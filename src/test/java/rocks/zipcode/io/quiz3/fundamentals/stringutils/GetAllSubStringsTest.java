package rocks.zipcode.io.quiz3.fundamentals.stringutils;

import org.junit.Test;
import rocks.zipcode.io.quiz3.utils.TestUtils;
import rocks.zipcode.io.quiz3.fundamentals.StringUtils;

import java.util.Arrays;

/**
 * @author leon on 10/12/2018.
 */
public class GetAllSubStringsTest {
    @Test
    public void test1() {
        // given
        String input = "bracer";
        String[] expected = {
                "a",
                "ac",
                "ace",
                "acer",
                "b",
                "br",
                "bra",
                "brac",
                "brace",
                "bracer",
                "c",
                "ce",
                "cer",
                "e",
                "er",
                "r",
                "ra",
                "rac",
                "race",
                "racer"};

        // when
        String[] actual = StringUtils.getAllSubStrings(input);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }

    @Test
    public void test5() {
        // given
        String input = "Flame";
        String[] expected = {
                "F",
                "Fl",
                "Fla",
                "Flam",
                "Flame",
                "a",
                "am",
                "ame",
                "e",
                "l",
                "la",
                "lam",
                "lame",
                "m",
                "me"};

        // when
        String[] actual = StringUtils.getAllSubStrings(input);
        Arrays.sort(actual);
        System.out.println("String[] expected = {");
        for (String s : actual) {
            System.out.println("\"" + s + "\",");
        }

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }

}
