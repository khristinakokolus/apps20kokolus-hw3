package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator {
    private MyFunction function;

    public MapDecorator(SmartArray smartArray, MyFunction function) {
        super(smartArray);
        this.function = function;
    }

    @Override
    public Object[] toArray() {
        return map();
    }

    @Override
    public String operationDescription() {
        String description = "Maps every element to another object "
                + "using MyFunction.";
        return description;
    }

    @Override
    public int size() {
        return smartArray.size();
    }

    public Object[] map() {
        Object[] tempArray = new Object[smartArray.size()];
        int i = 0;
        for (Object element : smartArray.toArray()) {
            tempArray[i] = function.apply(element);
            i++;
        }
        return tempArray;
    }

}
