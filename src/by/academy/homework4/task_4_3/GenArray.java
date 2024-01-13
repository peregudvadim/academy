//created by Vadim Peregud
package by.academy.homework4.task_4_3;

import java.util.Arrays;

public class GenArray<T> {
    private T[] array;
    private int index;

    public T[] getArray() {
        return array;
    }

    public GenArray() {
        this.array = (T[]) new Object[16];
    }

    public GenArray(int n) {
        this.array = (T[]) new Object[n];
    }

    public void add(T obj) {
        if (index >= array.length) {
            grow();
        }
        array[index++] = obj;
    }

    public void removeByIndex(int i) {
        if (i < 0 || i >= index) {
            System.out.println("Wrong index");
            return;
        }
        if (i != array.length - 1) {
            System.arraycopy(array, i + 1, array, i, array.length - i - 1);
        }
        array[index-- - 1] = null;
    }

    public void removeByValue(T obj) {
        int i = -1;
        for (int j = 0; j < array.length; j++) {
            if (obj.equals(array[j])) {
                i = j;
                break;
            }
        }
        if (i < 0) {
            System.out.println("Element not found ");
            return;
        }
        if (i != array.length - 1) {
            System.arraycopy(array, i + 1, array, i, array.length - i - 1);
        }
        array[index-- - 1] = null;
    }


    void grow() {
        array = Arrays.copyOf(array,(array.length * 2 + 1));
    }

    public T get(int i) {
        return array[i];
    }

    public T getLast() {
        return array[array.length - 1];

    }

    public T getFirst() {
        return array[0];
    }

    public void showSize() {
        System.out.println("Size is " + array.length);
    }

    public void showIndexLastElement() {
        System.out.println("Index of the last element is " + (index - 1));
    }

}
