package rocks.zipcode.io.quiz3.arrays.wavegenerator;

import org.junit.Test;
import rocks.zipcode.io.quiz3.utils.TestUtils;
import rocks.zipcode.io.quiz3.arrays.WaveGenerator;

/**
 * @author leon on 10/12/2018.
 */
public class WaveTest {
    @Test
    public void test0() {
        // given
        String input = "BBBB";
        String[] expected = {
                "Bbbb",
                "bBbb",
                "bbBb",
                "bbbB"};

        // when
        String[] actual = WaveGenerator.wave(input);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }

    @Test
    public void test1() {
        // given
        String input = "bbbb";
        String[] expected = {
                "Bbbb",
                "bBbb",
                "bbBb",
                "bbbB"};

        // when
        String[] actual = WaveGenerator.wave(input);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        String input = "B_B_B";
        String[] expected = {
                "B_b_b",
                "b_B_b",
                "b_b_B"};

        // when
        String[] actual = WaveGenerator.wave(input);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }


    @Test
    public void test4() {
        // given
        String input = "ZZ";
        String[] expected = {
                "Zz",
                "zZ"};

        // when
        String[] actual = WaveGenerator.wave(input);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }

    @Test
    public void test5() {
        // given
        String input = "Yerp!";
        String[] expected = {
                "Yerp",
                "yErp",
                "yeRp",
                "yerP"};

        // when
        String[] actual = WaveGenerator.wave(input);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }


    @Test
    public void test6() {
        // given
        String input = "HEY!";
        String[] expected = {
                "Hey!",
                "hEy!",
                "heY!"};

        // when
        String[] actual = WaveGenerator.wave(input);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }

    @Test
    public void test7() {
        String input = "juice";
        String[] expected = {
                "Juice",
                "jUice",
                "juIce",
                "juiCe",
                "juicE"};
        // when
        String[] actual = WaveGenerator.wave(input);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }

    @Test
    public void test8() {
        String input = "two_words";
        String[] expected = {
                "Two_words",
                "tWo_words",
                "twO_words",
                "two_Words",
                "two_wOrds",
                "two_woRds",
                "two_worDs",
                "two_wordS"};
        // when
        String[] actual = WaveGenerator.wave(input);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }

    @Test
    public void test9() {
        String input = " tag ";
        String[] expected = {
                " Tag ",
                " tAg ",
                " taG "};
        // when
        String[] actual = WaveGenerator.wave(input);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }

    @Test
    public void test10() {
        String input = "";
        String[] expected = {};

        // when
        String[] actual = WaveGenerator.wave(input);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }
}
