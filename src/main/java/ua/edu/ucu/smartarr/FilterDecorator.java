package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator {
    private MyPredicate predicate;

    public FilterDecorator(SmartArray smartArray, MyPredicate predicate) {
        super(smartArray);
        this.predicate = predicate;
    }

    @Override
    public Object[] toArray() {
        return filter();
    }

    @Override
    public String operationDescription() {
        String description = "Tests every element and removes it " +
                "if it doesn't satisfy MyPredicate.";
        return description;
    }

    @Override
    public int size() {
        int size = 0;
        for (Object element : smartArray.toArray()) {
            if (predicate.test(element)) {
                size++;
            }
        }
        return size;
    }


    public Object[] filter () {
        Object[] tempArray = new Object[smartArray.size()];
        int i = 0;
        for (Object element : smartArray.toArray()) {
            if (predicate.test(element)) {
                tempArray[i] = element;
                i++;
            }
        }
        Object[] newTempArray = new Object[i];
        System.arraycopy(tempArray, 0, newTempArray,
                0, i);
        return newTempArray;
    }
}
