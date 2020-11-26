package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;

import java.util.Arrays;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator {
    private MyComparator comparator;

    public SortDecorator(SmartArray smartArray, MyComparator comparator) {
        super(smartArray);
        this.comparator = comparator;
    }

    @Override
    public Object[] toArray() {
        return sort();
    }

    @Override
    public String operationDescription() {
        String description = "Sorts elements using MyComparator"
                + " to compare them.";
        return description;
    }

    @Override
    public int size() {
        return smartArray.size();
    }

    public Object[] sort() {
        Object[] tempArray = new Object[smartArray.size()];
        System.arraycopy(smartArray.toArray(), 0, tempArray,
                0, smartArray.size());
        Arrays.sort(tempArray, comparator);
        return tempArray;
    }
}
