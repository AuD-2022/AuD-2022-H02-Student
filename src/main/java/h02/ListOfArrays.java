package h02;

import java.util.Collection;
import java.util.Iterator;

/**
 * A list of ListOfArraysItem objects.
 * Contains the length of the arrays of this list and a reference to the first and last item (or null as an empty list).
 *
 * @param <T> The generic type of this list
 */
public class ListOfArrays<T> {
    /**
     * The length of the arrays of the items of this list.
     */
    private static final int ARRAY_LENGTH = 0;

    /**
     * The head of this list.
     */
    private ListOfArraysItem<T> head;

    /**
     * The tail of this list.
     */
    private ListOfArraysItem<T> tail;

    /**
     * Constructs a list of ListOfArrayItem objects that represents the elements given in sequence.
     *
     * @param sequence The elements to be added to the list.
     */
    public ListOfArrays(T[] sequence) {
        throw new RuntimeException("H1 - not implemented"); // TODO: H1 - remove if implemented
    }

    /**
     * Returns an iterator over this list.
     *
     * @return The iterator of type ListOfArraysIterator.
     */
    public ListOfArraysIterator<T> iterator() {
        throw new RuntimeException("H2 - not implemented"); // TODO: H2 - remove if implemented
    }

    /**
     * Inserts a given collection into this list at index i
     * (elements in front of index i will stay and elements at index i and after will be pushed behind the added collection).
     *
     * @param collection                    The collection to add.
     * @param i                             The index at which the collection should be inserted.
     * @throws IndexOutOfBoundsException    If the given index is not within the bounds of this list.
     */
    public void insert(Collection<T> collection, int i) throws IndexOutOfBoundsException {
        throw new RuntimeException("H3 - not implemented"); // TODO: H3 - remove if implemented
    }

    /**
     * Inserts the elements of given Iterator each with their given offset from the last inserted element (or the first element) into this list.
     *
     * @param iterator                      The Iterator over the elements (and their offsets) that should be added.
     * @throws IndexOutOfBoundsException    If an offset is negative.
     */
    public void insert(Iterator<ElementWithIndex<T>> iterator) throws IndexOutOfBoundsException {
        throw new RuntimeException("H6 - not implemented"); // TODO: H6 - remove if implemented
    }

    /**
     * Extracts a block of elements of this list. The block is defined by the boundary indices i and j (both included in the block that will be extracted) as a ListOfArrays object.
     * This will delete the extracted elements from the list.
     *
     * @param i                     The lower boundary index.
     * @param j                     The higher boundary index.
     * @return                      The extracted elements as a ListOfArrays object.
     */
    public ListOfArrays<T> extract(int i, int j) {
        throw new RuntimeException("H5 - not implemented"); // TODO: H5 - remove if implemented
    }
}
