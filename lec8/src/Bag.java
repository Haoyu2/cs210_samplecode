/**
 * This interface specifies the API for the bag data structure.
 */
public interface Bag<Item> extends Iterable<Item> {
    /**
     * Returns {@code true} if this bag is empty, and {@code false} otherwise.
     *
     * @return {@code true} if this bag is empty, and {@code false} otherwise.
     */
    public boolean isEmpty();

    /**
     * Returns the number of items in this bag.
     *
     * @return number of items in this bag.
     */
    public int size();

    /**
     * Adds {@code item} to this bag.
     *
     * @param item the item.
     */
    public void add(Item item);

}
