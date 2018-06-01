
# Delete Duplicates
* **Objective**
	* To write methods which remove duplicate elements from an array.
* **Purpose**
	* To demonstrate practical understanding of arrays, loops, and basic composition.
* **Instructions**
    * The `IntegerDuplicateDeleter` and `StringDuplicateDeleter` both inherit from the abstract class `DuplicateDeleter`. The `DuplicateDeleter` class has two required methods that the IntegerDuplicateDeleter and StringDuplicateDeleter need to implement. You need to add the two methods into the two classes and add a constructor to call the `DuplicateDeleter` method to make your code compile.
    * Given an object, `IntegerDuplicateDeleter`, with a composite `Integer[]` object, write a method
        * `removeDuplicatesExactly` which removes all values in the array which occur exactly the specified number of times.
        * `removeDuplicates` which removes all values in the array which occur at least the specified number of times.
	<br><br>
    * Given an object, `StringDuplicateDeleter`, with a composite `String[]` object, write a method
        * `removeDuplicatesExactly` which removes all values in the array which occur exactly the specified number of times.
        * `removeDuplicates` which removes all values in the array which occur at least the specified number of times.

* **Restrictions**
    * No use of any built-in data structures, (`Collection`, `List`, `Map`)
    * Operations should be [idempotent](https://stackoverflow.com/questions/1077412/what-is-an-idempotent-operation)
        * If the input is the same, then the outputs of the methods should **always** be the same, regardless of how many times the method is called.

















<br><br><br><br>
## `removeDuplicateExactly(n)`

### Example 1
* Sample Script

    ```
    // : Given
    Integer[] array = new Integer[]{1, 1, 1, 23, 23, 56, 57, 58};
    DuplicateDeleter<Integer> deleter = new IntegerDuplicateDeleter(array);

    // : When
    Integer[] actual = deleter.removeDuplicateExactly(3);

    // : Then
		Integer[] expected = new Integer[]{23, 23, 56, 57, 58};
    assertArrayEquals(expected, actual);
    ```



### Example 2
* Sample Script

    ```
    // : Given
    Integer[] array = new Integer[]{1, 1, 1, 23, 23, 56, 57, 58};
    DuplicateDeleter<Integer> deleter = new IntegerDuplicateDeleter(array);

    // : When
    Integer[] actual = deleter.removeDuplicateExactly(1);

    // : Then
		Integer[] expected = {1, 1, 1, 23, 23};
    assertArrayEquals(expected, actual);
    ```



### Example 3
* Sample Script

    ```
    // : Given
    Integer[] array = new Integer[]{0, 0, 0, 1, 1, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5};
    DuplicateDeleter<Integer> deleter = new IntegerDuplicateDeleter(array);

    // : When
    Integer[] actual = deleter.removeDuplicateExactly(3);

    // : Then
		Integer[] expected = {1, 1, 2, 4, 4, 5, 5, 5, 5};
    assertArrayEquals(expected, actual);
    ```



<br><br><br><br>
## `removeDuplicates(n)`

### Example 1
* Sample Script

    ```
    // : Given
    Integer[] array = new Integer[]{1,1,1,23,23,56,57,58};
    DuplicateDeleter<Integer> deleter = new IntegerDuplicateDeleter(array);

    // : When
    Integer[] actual = deleter.removeDuplicateExactly(1);

    // : Then
		Integer[] expected = {};
    assertArrayEquals(expected, actual);
    ```


### Example 2
* Sample Script

    ```
    // : Given
    Integer[] array = new Integer[]{0, 0, 0, 1, 1, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5};
    DuplicateDeleter<Integer> deleter = new IntegerDuplicateDeleter(array);

    // : When
    Integer[] actual = deleter.removeDuplicates(2);

    // : Then
		Integer[] expected = {2};
    assertArrayEquals(expected, actual);
    ```


### Example 3
* Sample Script

    ```
    // : Given
    Integer[] array = new Integer[]{0, 0, 0, 1, 1, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5};
    DuplicateDeleter<Integer> deleter = new IntegerDuplicateDeleter(array);

    // : When
    Integer[] actual = deleter.removeDuplicates(3);

    // : Then
		Integer[] expected = {1, 1, 2, 4, 4};
    assertArrayEquals(expected, actual);
    ```





<br><br><br><br>
## Idempotence

### Example 1
* Sample Script

    ```
    // : Given
    Integer[] array = new Integer[]{0, 0, 0, 1, 1, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5};
    DuplicateDeleter<Integer> deleter = new IntegerDuplicateDeleter(array);
    deleter.removeDuplicates(0);
    deleter.removeDuplicates(1);
    deleter.removeDuplicates(2);

    // : When
    Integer[] actual = deleter.removeDuplicates(3);

    // : Then
		Integer[] expected = {1, 1, 2, 4, 4};
    assertArrayEquals(expected, actual);
    ```


### Example 2
* Sample Script

    ```
    // : Given
    Integer[] array = new Integer[]{1, 1, 1, 23, 23, 56, 57, 58};
    DuplicateDeleter<Integer> deleter = new IntegerDuplicateDeleter(array);

		deleter.removeDuplicates(0);
    deleter.removeDuplicates(1);
    deleter.removeDuplicates(2);

    // : When
    Integer[] actual = deleter.removeDuplicatesExactly(3);

    // : Then
		Integer[] expected = {23, 23, 56, 57, 58};
    assertArrayEquals(expected, actual);
    ```
