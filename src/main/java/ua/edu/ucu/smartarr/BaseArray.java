package ua.edu.ucu.smartarr;

import java.util.Arrays;

// Base array for decorators
public class BaseArray implements SmartArray {
    private Object[] smartArray;
    private int size;

    public BaseArray(Object[] newSmartArray) {
        this.smartArray = Arrays.copyOf(newSmartArray,
                newSmartArray.length);
        this.size = newSmartArray.length;
    }

    @Override
    public Object[] toArray() {
        return smartArray.clone();
    }

    @Override
    public String operationDescription() {
        return null;
    }

    @Override
    public int size() {
        return size;
    }
}
