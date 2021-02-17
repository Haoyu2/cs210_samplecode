/**
 * This interface specifies the API for the queue data structure.
 */
public interface Queue<Item> extends Iterable<Item> {
    /**
     * Returns {@code true} if this queue is empty, and {@code false} otherwise.
     *
     * @return {@code true} if this queue is empty, and {@code false} otherwise.
     */
    public boolean isEmpty();

    /**
     * Returns the number of items in this queue.
     *
     * @return number of items in this queue.
     */
    public int size();

    /**
     * Adds {@code item} to the end of this queue.
     *
     * @param item the item.
     */
    public void enqueue(Item item);

    /**
     * Returns the item at the front of this queue.
     *
     * @return item at the front of this queue.
     */
    public Item peek();

    /**
     * Removes and returns the item at the front of this queue.
     *
     * @return item at the front of this queue.
     */
    public Item dequeue();
}
