package org.northcoders;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Box<T, V extends Number & Comparable<V>> implements BoxOperations<V> {

    private T number;
    private String name;
    private V largestValue;

    @Override
    public void setLargestValueFromList(List<V> numbers) {
        largestValue = Collections.max(numbers);
        System.out.println(largestValue);
    }

    public Box(String name) {
        this.name = name;
    }

    @Override
    public V getLargestValue() {
        return largestValue;
    }
    

    @Override
    public void setLargestValue(V value1, V value2){
        if (value1.compareTo(value2) > 0) {
            largestValue = value1;
        } else {
            largestValue =  value2;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean hasSameName(Box <? extends T, V> box ){
        // check if box name is same as this
        if(this.getName().equals(box.getName())){
            return true;
        }
        return false;
    }

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }

    public <V extends Number> Number castValue(V value) {
        V anotherValue = null;
        try {
            anotherValue = value;
            System.out.println(anotherValue);
        } catch (ClassCastException ev) {
            System.out.println("Unsuccessfull " + ev);
        }
        return anotherValue;
    }
}
