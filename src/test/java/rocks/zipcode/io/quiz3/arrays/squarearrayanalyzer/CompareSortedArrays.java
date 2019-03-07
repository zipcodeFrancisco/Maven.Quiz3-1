package rocks.zipcode.io.quiz3.arrays.squarearrayanalyzer;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz3.arrays.SquareArrayAnalyzer;

/**
 * @author leon on 10/12/2018.
 */
public class CompareSortedArrays {

    @Test
    public void test0() {
        Integer[] array = {5};
        Integer[] arraySquared = {25};
        Assert.assertTrue(SquareArrayAnalyzer.compare(array, arraySquared));
    }

    @Test
    public void test1() {
        Integer[] array = {3};
        Integer[] arraySquared = {9};
        Assert.assertTrue(SquareArrayAnalyzer.compare(array, arraySquared));
    }

    @Test
    public void test2() {
        Integer[] array = {6};
        Integer[] arraySquared = {36};
        Assert.assertTrue(SquareArrayAnalyzer.compare(array, arraySquared));
    }

    @Test
    public void test3() {
        Integer[] array = {3,2,1,0};
        Integer[] arraySquared = {9,4,1,0};
        Assert.assertTrue(SquareArrayAnalyzer.compare(array, arraySquared));
    }

    @Test
    public void test4() {
        Integer[] array = {10,9,8};
        Integer[] arraySquared = {100, 81, 64};
        Assert.assertTrue(SquareArrayAnalyzer.compare(array, arraySquared));
    }

    @Test
    public void test5() {
        Integer[] array = {0, 1, 0};
        Integer[] arraySquared = {0, 1, 0};
        Assert.assertTrue(SquareArrayAnalyzer.compare(array, arraySquared));
    }
}
