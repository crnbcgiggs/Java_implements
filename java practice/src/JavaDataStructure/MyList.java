package JavaDataStructure;

public interface MyList<E> {
    public abstract int size();
    boolean add(E e);
    public boolean add(E e, int pos);
    public boolean delete();
    public boolean delete(int pos);


}
