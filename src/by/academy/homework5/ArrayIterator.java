//created by Vadim Peregud
package by.academy.homework5;


import java.util.Iterator;

class ArrayIterator<T> implements Iterator<T> {

    private final T[][] array;
    private int i, j;


    public ArrayIterator(T[][] array) {
        this.array = array;
    }


    @Override
    public boolean hasNext() {
        return i < array.length && j < array[i].length;
    }

    @Override
    public T next() {
        T current = array[i][j++];
        if (j >= array[i].length) {
            i++;
            j = 0;
        }
        if (j == 1 && i > 0) {
            System.out.println();
        }
        return current;
    }
}
