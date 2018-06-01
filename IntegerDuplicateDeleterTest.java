 

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by leon on 1/25/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying this class.
 */
public class IntegerDuplicateDeleterTest {

    @Test
    public void testRemoveDuplicatesExactly_whenThereIsOnlyOneElement() {
        Integer[] intArray = new Integer[]{0};
        DuplicateDeleter<Integer> deleter = new IntegerDuplicateDeleter(intArray);

        Integer[] expected = new Integer[]{0};
        Integer[] actual = deleter.removeDuplicatesExactly(2);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveDuplicatesExactly_whenThereIsOnlyOneElementAndRemoveDumplicationIs1() {
        Integer[] intArray = new Integer[]{9};
        DuplicateDeleter<Integer> deleter = new IntegerDuplicateDeleter(intArray);

        Integer[] expected = new Integer[]{};
        Integer[] actual = deleter.removeDuplicatesExactly(1);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveDuplicatesExactly_withNoElementsWithExactDumplication() {
        Integer[] intArray = new Integer[]{51, 4, 4, 4, 28, 38, 38, 38, 38, 38};
        DuplicateDeleter<Integer> deleter = new IntegerDuplicateDeleter(intArray);

        Integer[] expected = new Integer[]{51, 4, 4, 4, 28, 38, 38, 38, 38, 38};
        Integer[] actual = deleter.removeDuplicatesExactly(2);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveDuplicatesExactly_withMoreThanOneElement() {
        Integer[] intArray = new Integer[]{5, 5, 1, 2, 2, 3, 3, 3};
        DuplicateDeleter<Integer> deleter = new IntegerDuplicateDeleter(intArray);

        Integer[] expected = new Integer[]{1, 3, 3, 3};
        Integer[] actual = deleter.removeDuplicatesExactly(2);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveDuplicatesExactly_withOccuranceAtTheBeginningAndEnd() {
        Integer[] intArray = new Integer[]{0, 0, 0, 1, 2, 2, 4, 4, 5, 5, 5, 6, 9, 9, 9};
        DuplicateDeleter<Integer> deleter = new IntegerDuplicateDeleter(intArray);

        Integer[] expected = new Integer[]{1, 2, 2, 4, 4, 6};
        Integer[] actual = deleter.removeDuplicatesExactly(3);
        Assert.assertArrayEquals(expected, actual);
    }


    @Test
    public void testRemoveDuplicatesExactly_withOccuranceInTheMiddle() {
        Integer[] intArray = new Integer[]{0, 0, 0, 1, 2, 2, 4, 4, 5, 5, 5, 6, 9, 9, 9};
        DuplicateDeleter<Integer> deleter = new IntegerDuplicateDeleter(intArray);

        Integer[] expected = new Integer[]{0, 0, 0, 1, 5, 5, 5, 6, 9, 9, 9};
        Integer[] actual = deleter.removeDuplicatesExactly(2);
        Assert.assertArrayEquals(expected, actual);
    }










    @Test
    public void testRemoveDuplicates_whenThereIsOnlyOneElement() {
        Integer[] intArray = new Integer[]{5};
        DuplicateDeleter<Integer> deleter = new IntegerDuplicateDeleter(intArray);

        Integer[] expected = new Integer[]{5};
        Integer[] actual = deleter.removeDuplicates(2);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveDuplicates_whenThereIsOnlyOneElementAndRemoveDumplicationIs1() {
        Integer[] intArray = new Integer[]{3};
        DuplicateDeleter<Integer> deleter = new IntegerDuplicateDeleter(intArray);

        Integer[] expected = new Integer[]{};
        Integer[] actual = deleter.removeDuplicatesExactly(1);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveDuplicates_whenThereIsMoreThanOneElement() {
        Integer[] intArray = new Integer[]{4, 1, 2};
        DuplicateDeleter<Integer> deleter = new IntegerDuplicateDeleter(intArray);

        Integer[] expected = new Integer[]{4, 1, 2};
        Integer[] actual = deleter.removeDuplicates(2);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveDuplicates_whenThereIsMoreThanOneElementWithOccurance() {
        Integer[] intArray = new Integer[]{4, 4, 1, 2, 2, 2};
        DuplicateDeleter<Integer> deleter = new IntegerDuplicateDeleter(intArray);

        Integer[] expected = new Integer[]{1};
        Integer[] actual = deleter.removeDuplicates(2);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveDuplicates_removesNothing() {
        Integer[] array = new Integer[]{0, 0, 0, 1, 1, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5};
        DuplicateDeleter<Integer> deleter = new IntegerDuplicateDeleter(array);
        Integer[] expected = new Integer[]{};
        Integer[] actual = deleter.removeDuplicates(0);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveDuplicates_withOccuranceInTheMiddle() {
        Integer[] array = new Integer[]{0, 0, 0, 1, 1, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5};
        DuplicateDeleter<Integer> deleter = new IntegerDuplicateDeleter(array);
        Integer[] expected = new Integer[]{2};
        Integer[] actual = deleter.removeDuplicates(2);
        Assert.assertArrayEquals(expected, actual);
    }


    @Test
    public void testRemoveDuplicates_withOccuranceAtTheBeginningAndEnd() {
        Integer[] array = new Integer[]{0, 0, 0, 1, 1, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5};
        DuplicateDeleter<Integer> deleter = new IntegerDuplicateDeleter(array);
        Integer[] expected = new Integer[]{1, 1, 2, 4, 4};
        Integer[] actual = deleter.removeDuplicates(3);
        Assert.assertArrayEquals(expected, actual);
    }





    @Test
    public void testRemoveDuplicatesExactlyIdempotence() {
        Integer[] input = {11, 3, 3, 3, 4, 4, 4, 4};
        Integer[] expected = {11, 4, 4, 4, 4};

        DuplicateDeleter<Integer> deleter = new IntegerDuplicateDeleter(input);

        Integer[] actual1 = deleter.removeDuplicatesExactly(3);
        Integer[] actual2 = deleter.removeDuplicatesExactly(3);
        Integer[] actual3 = deleter.removeDuplicatesExactly(3);

        Assert.assertArrayEquals(expected, actual1);
        Assert.assertArrayEquals(expected, actual2);
        Assert.assertArrayEquals(expected, actual3);
    }


    @Test
    public void testRemoveDuplicatesIdempotence() {
        Integer[] input = {1, 2, 2, 2, 3, 4, 4};
        Integer[] expected = {1, 3};

        DuplicateDeleter<Integer> deleter = new IntegerDuplicateDeleter(input);

        Integer[] actual1 = deleter.removeDuplicates(2);
        Integer[] actual2 = deleter.removeDuplicates(2);
        Integer[] actual3 = deleter.removeDuplicates(2);

        Assert.assertArrayEquals(expected, actual1);
        Assert.assertArrayEquals(expected, actual2);
        Assert.assertArrayEquals(expected, actual3);
    }
}
