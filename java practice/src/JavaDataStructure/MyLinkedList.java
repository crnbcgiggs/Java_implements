package JavaDataStructure;

public class MyLinkedList<E> implements MyList<E>{

    private ListNode<E> head;
    private ListNode<E> tail;
    private int size;
    @Override
    public int size() {
        return this.size;
    }
    @Override
    public boolean add(E e) {
        if (this.size == 0) {
            this.head = new ListNode(e);
            size ++;
            return true;
        }
        return true;
    }
    @Override
    public boolean add(E e, int pos) {
        return true;
    }
    @Override
    public boolean delete() {
        return true;
    }
    @Override
    public boolean delete(int pos) {
        return true;
    }
}
