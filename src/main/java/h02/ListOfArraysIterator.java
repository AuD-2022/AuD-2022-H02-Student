package h02;

import java.util.NoSuchElementException;

/**
 * Represents an iterator over a ListOfArrays object.
 *
 * @param <T> The generic type of the list that this iterator iterates on.
 */
public class ListOfArraysIterator<T> {

    /**
     * A constructor to construct a ListOfArraysIterator object.
     *
     * @param head The head of the list to iterate over.
     */
    public ListOfArraysIterator(ListOfArraysItem<T> head) {
    }

    /**
     * Returns whether there is another element to be iterated on.
     *
     * @return True iff there is another element.
     */
    public boolean hasNext() {
        return false;
    }

    /**
     * Returns the next element of this iterator and moves the iterator one element forward.
     *
     * @return The next element.
     * @throws NoSuchElementException If there is no next element.
     */
    public T next() throws NoSuchElementException {
        return null;
    }
}
