 

/**
 * Created by leon on 1/25/18.
 */
public abstract class DuplicateDeleter<T> {
    protected T[] array;

    public DuplicateDeleter(T[] array) {
        this.array = array;
    }

    /**
     *  Removes all values in the array which occur n or more times
     *
     *  DuplicateDeleter<Integer> deleter = new IntegerDuplicateDeleter();
     *  Integer[] array = new Integer[]{1,1,1,23,23,56,57,58};
     *  deleter.removeDuplicateExactly(array, 2); // => {56, 57, 58}
     *
     * @param maxNumberOfDuplications
     * @return
     */
    abstract public T[] removeDuplicates(int maxNumberOfDuplications);

    /**
     *  Removes all the values in the array which occurs exactly n times
     *
     *  DuplicateDeleter<Integer> = new IntegerDuplicateDeleter();
     *  Integer[] array = new Integer[]{1,1,1,23,23,56,57,58};
     *  deleter.removeDuplicateExactly(array, 2); // => {1, 1, 1, 56, 57, 58}
     *
     * @param exactNumberOfDuplications
     * @return
     */
    abstract public T[] removeDuplicatesExactly(int exactNumberOfDuplications);
}
