package linkedlist_implementation;

public interface OurList<E> extends Iterable<E> {
    void append(E o);

    E get(int index);

    void set(int index, E o);

    int size();

    boolean contains(E o);

    boolean remove(E o);

    E removeById(int index);
}
