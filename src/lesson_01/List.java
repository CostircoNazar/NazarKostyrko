package lesson_01;

import com.sun.jdi.VMOutOfMemoryException;

import java.util.Arrays;


public class List {
    private int[] arrBox;
    private int current;
    private double multiplier;
    private int capacity;
    private int index;

    public List(int capacity, double multiplier) throws VMOutOfMemoryException {
        this.capacity = capacity;
        this.multiplier = multiplier;
        this.current = 0;

        arrBox = new int[capacity];

        if ( arrBox == null ) {
            throw new VMOutOfMemoryException();
        }
    }
    public List() {
        this(20, 1.05);
    }
    public int size() {
        return current;
    }
    public int max_size() {
        return capacity;
    }
    public void erase(int index) throws VMOutOfMemoryException {
        if ( index > capacity ) {
            throw new VMOutOfMemoryException();
        }
        for ( int i = index; i < capacity; ++i ) {
            arrBox[i] = arrBox[i+1];
        }
        capacity -= 1;
    }
    public void insert(int value, int index) {
        if ( index > current ) {
            current += 1;
        }
        arrBox[index] = value;
    }
    public int find(int value) {
        for ( int i = 0; i < size(); i++ ) {
            if ( arrBox[i] == value ) {
                System.out.println(arrBox[i]);
            }
        }
        return -1;
    }

    public void push_back(int value) throws VMOutOfMemoryException {
        int newCurrent = current + 1;

        if ( newCurrent > capacity ) {
            int newCapacity = (int) (capacity * multiplier);
                int[] newArray = new int[newCapacity];

            if ( newArray == null ) {
                throw new VMOutOfMemoryException();
            }
            arrBox = newArray;
            capacity = newCapacity;
        }
        current = newCurrent;
        arrBox[current] = value;
    }
    public int pop_back() {
        return arrBox[capacity-1];

    }
    public String toString() {
        return Arrays.toString(arrBox);
}
//Arrays.sort(arrBox);


}
