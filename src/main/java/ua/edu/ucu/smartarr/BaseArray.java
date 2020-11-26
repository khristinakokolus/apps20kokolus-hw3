package ua.edu.ucu.smartarr;

// Base array for decorators
public class BaseArray implements SmartArray {
    private Object[] smartArray;
    private int size;

    public BaseArray(Object[] newSmartArray) {
        this.smartArray = newSmartArray.clone();
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
