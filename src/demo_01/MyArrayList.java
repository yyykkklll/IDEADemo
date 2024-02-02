package demo_01;

import java.util.Arrays;

/**
 * @author yklsfzy
 * @date 2024/1/31/0031 20:37:45
 */
public class MyArrayList<E> {
    Object[] obj = new Object[10];
    int size;
    public boolean add(E e) {
        obj[size] = e;
        size++;
        return true;
    }

    public E get(int index) {
        return (E)obj[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(obj);
    }
}
