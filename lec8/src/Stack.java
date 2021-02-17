/**
 * This interface specifies the API for the stack data structure.
 */
public interface Stack<Item> extends Iterable<Item> {
    /**
     * Returns {@code true} if this stack is empty, and {@code false} otherwise.
     *
     * @return {@code true} if this stack is empty, and {@code false} otherwise.
     */
    public boolean isEmpty();

    /**
     * Returns the number of items in this stack.
     *
     * @return number of items in this stack.
     */
    public int size();

    /**
     * Adds {@code item} to the top of this stack.
     *
     * @param item the item.
     */
    public void push(Item item);

    /**
     * Returns the item at the top of this stack.
     *
     * @return item at the top of this stack.
     */
    public Item peek();

    /**
     * Removes and returns the item at the top of this stack.
     *
     * @return item at the top of this stack.
     */
    public Item pop();
}
