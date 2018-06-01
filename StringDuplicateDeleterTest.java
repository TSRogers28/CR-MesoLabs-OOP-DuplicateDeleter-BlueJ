 


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying this class.
 */
public class StringDuplicateDeleterTest {
    @Test
    public void testRemoveDuplicatesExactly_whenThereIsOnlyOneElement() {
        String[] array = new String[]{"a"};
        DuplicateDeleter<String> deleter = new StringDuplicateDeleter(array);

        String[] expected = new String[]{"a"};
        String[] actual = deleter.removeDuplicatesExactly(2);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveDuplicatesExactly_whenThereIsOnlyOneElementAndRemoveDumplicationIs1() {
        String[] array = new String[]{"b"};
        DuplicateDeleter<String> deleter = new StringDuplicateDeleter(array);

        String[] expected = new String[]{};
        String[] actual = deleter.removeDuplicatesExactly(1);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveDuplicatesExactly_withNoElementsToRemove() {
        String[] array = new String[]{"aa", "b", "d"};
        DuplicateDeleter<String> deleter = new StringDuplicateDeleter(array);

        String[] expected = new String[]{"aa", "b", "d"};
        String[] actual = deleter.removeDuplicatesExactly(2);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveDuplicatesExactly_withMoreThanOneElementToRemove() {
        String[] array = new String[]{"cat", "cat", "dog", "dog", "fox"};
        DuplicateDeleter<String> deleter = new StringDuplicateDeleter(array);

        String[] expected = new String[]{"fox"};
        String[] actual = deleter.removeDuplicatesExactly(2);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveDuplicatesExactly_withOccuranceAtTheBeginningAndEnd() {
        String[] array = new String[]{"cat", "cat", "cat", "deer", "deer", "dog", "fox", "fox", "goat", "goat", "goat"};
        DuplicateDeleter<String> deleter = new StringDuplicateDeleter(array);

        String[] expected = new String[]{"deer", "deer", "dog", "fox", "fox"};
        String[] actual = deleter.removeDuplicatesExactly(3);
        Assert.assertArrayEquals(expected, actual);
    }


    @Test
    public void testRemoveDuplicatesExactly_withOccuranceInTheMiddle() {
        String[] array = new String[]{"cat", "cat", "cat", "deer", "deer", "dog", "fox", "fox", "goat", "goat", "goat"};
        DuplicateDeleter<String> deleter = new StringDuplicateDeleter(array);

        String[] expected = new String[]{"cat", "cat", "cat", "dog", "goat", "goat", "goat"};
        String[] actual = deleter.removeDuplicatesExactly(2);
        Assert.assertArrayEquals(expected, actual);
    }










    @Test
    public void testRemoveDuplicates_withOneElement() {
        String[] array = new String[]{"Droolius Caesar"};
        DuplicateDeleter<String> deleter = new StringDuplicateDeleter(array);

        String[] expected = new String[]{"Droolius Caesar"};
        String[] actual = deleter.removeDuplicates(2);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveDuplicates_withOneElementToRemove() {
        String[] array = new String[]{"Chewbarka"};
        DuplicateDeleter<String> deleter = new StringDuplicateDeleter(array);

        String[] expected = new String[]{};
        String[] actual = deleter.removeDuplicatesExactly(1);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveDuplicates_withNoElementToRemove() {
        String[] array = new String[]{"a", "a", "b", "c", "c", "c", "d"};
        DuplicateDeleter<String> deleter = new StringDuplicateDeleter(array);

        String[] expected = new String[]{"a", "a", "b", "c", "c", "c", "d"};
        String[] actual = deleter.removeDuplicates(4);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveDuplicates_whenThereIsMoreThanOneElementWithOccurance() {
        String[] array = new String[]{"a", "a", "b", "c", "c", "c", "d"};
        DuplicateDeleter<String> deleter = new StringDuplicateDeleter(array);

        String[] expected = new String[]{"b", "d"};
        String[] actual = deleter.removeDuplicates(2);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveDuplicates_withOccuranceInTheMiddle() {
        String[] array = new String[]{"aba", "baa", "baa", "bbb", "bbb", "bbb", "cat", "cat", "dog"};
        DuplicateDeleter<String> deleter = new StringDuplicateDeleter(array);
        String[] expected = new String[]{"aba", "dog"};
        String[] actual = deleter.removeDuplicates(2);
        Assert.assertArrayEquals(expected, actual);
    }


    @Test
    public void testRemoveDuplicates_withOccuranceAtTheBeginningAndEnd() {
        String[] array = new String[]{"aba", "aba", "aba", "bab", "aaa", "bba", "bba", "bbb", "bbb", "bbb"};
        DuplicateDeleter<String> deleter = new StringDuplicateDeleter(array);
        String[] expected = new String[]{"bab", "aaa", "bba", "bba"};
        String[] actual = deleter.removeDuplicates(3);
        Assert.assertArrayEquals(expected, actual);
    }





    @Test
    public void testRemoveDuplicatesExactlyIdempotence() {
        String[] input = {"aa", "b", "b", "b", "c", "c", "t", "t", "t"};
        String[] expected = {"aa", "c", "c"};

        DuplicateDeleter<String> deleter = new StringDuplicateDeleter(input);

        String[] actual1 = deleter.removeDuplicatesExactly(3);
        String[] actual2 = deleter.removeDuplicatesExactly(3);
        String[] actual3 = deleter.removeDuplicatesExactly(3);

        Assert.assertArrayEquals(expected, actual1);
        Assert.assertArrayEquals(expected, actual2);
        Assert.assertArrayEquals(expected, actual3);
    }


    @Test
    public void testRemoveDuplicatesIdempotence() {
        String[] input = {"aa", "b", "b", "b", "c", "c", "t", "t"};
        String[] expected = {"aa"};

        DuplicateDeleter<String> deleter = new StringDuplicateDeleter(input);

        String[] actual1 = deleter.removeDuplicates(2);
        String[] actual2 = deleter.removeDuplicates(2);
        String[] actual3 = deleter.removeDuplicates(2);

        Assert.assertArrayEquals(expected, actual1);
        Assert.assertArrayEquals(expected, actual2);
        Assert.assertArrayEquals(expected, actual3);
    }
}
