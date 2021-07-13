package com.DataStructure.main;

public class DynamicArray {
    private int[] arr;
    private int size = 0;
    private int capacity;

    public DynamicArray(int capacity) {
        arr = new int[capacity];
        this.capacity = capacity;
    }

    public int get(int index) {
        return arr[index];
    }

    public void add(int index, int value) {
        if (size >= capacity) {
            resizeArray(capacity * 2);
        }

        for (int i = 0; i < size - index; i++) {
            arr[size - i] = arr[size - i - 1];
        }
        arr[index] = value;
        size++;
    }

    public void set(int index, int value) {
        arr[index] = value;
    }

    public void remove(int index) {
        if (size <= capacity / 2) {
            //Shrink array cap
            resizeArray(capacity / 2);
        }

        for (int i = 0; i < size - index - 1; i++) {
            arr[index + i] = arr[index + i + 1];
        }
        size--;
    }

    public int popBack() {
        int retrieved = arr[size - 1];
        remove(size - 1);
        return retrieved;
    }

    public void pushBack(int value) {
        if (size >= capacity) {
            resizeArray(capacity * 2);
        }
        arr[size] = value;
        size++;
    }

    public void printAll() {
        System.out.println("size: " + size + ", capacity: " + capacity);
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }

    private void resizeArray(int newCap) {
        capacity = newCap;
        int[] temp = new int[capacity];
        for (int i = 0; i < size; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }
}
