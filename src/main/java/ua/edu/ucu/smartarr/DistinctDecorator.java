package ua.edu.ucu.smartarr;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator {

    public DistinctDecorator(SmartArray smartArray) {
        super(smartArray);
    }

    @Override
    public Object[] toArray() {
        return removeDuplicates();
    }

    @Override
    public String operationDescription() {
        String description = "Removes duplicates from SmartArray.";
        return description;
    }

    @Override
    public int size() {
        return removeDuplicates().length;
    }

    public Object[] removeDuplicates() {
        Object[] tempArray = new Object[smartArray.size()];
        Object[] array =  new Object[smartArray.size()];
        System.arraycopy(smartArray.toArray(), 0, array,
                0, smartArray.size());
        int j = 0;
        int counter = 0;
        for (int i = 0; i < smartArray.size() - 1; i++) {
            if (array[i] != null) {
                for (int k = i + 1; k < smartArray.size() - 1; k++) {
                    if (array[i].equals(array[k])) {
                        array[k] = null;
                    }
                }
                tempArray[j] = array[i];
                counter++;
                j++;
            }
        }
        Object[] newTempArray = new Object[counter];
        System.arraycopy(tempArray, 0, newTempArray,
                0, counter);
        return newTempArray;
    }

}
