package com.coderscampus.arraylists;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
    private Object[] items = new Object[10];
    private int size = 0; // Track the current number of items in the array

    @Override
    public boolean add(T item) {
        if (size == items.length) {
            // If the array is full, double its size
            int newSize = items.length * 2;
            items = Arrays.copyOf(items, newSize);
        }

        items[size] = item;
        size++; // Increment the size

        return true;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public T get(int index) {
        if (index >= 0 && index < size) {
            return (T) items[index];
        }
        return null;
    }

    @Override
    public String toString() {
        return "CustomArrayList [items=" + Arrays.toString(items) + ", size=" + size + "]";
    }
}
