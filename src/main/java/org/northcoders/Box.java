package org.northcoders;

public class Box<T, V> {

    private T number;
    private String name;
    private V largestValue;

    public Box(String name) {
        this.name = name;
    }

    public V getLargestValue() {
        return largestValue;
    }

    public void setLargestValue(V <? extends Number> firstValue, V <? extends Number>secondValue) {
        Number largest = (Number) firstValue;
        Number newSecond = (Number) secondValue;
        if(newSecond > largest){
            largest = (Number) secondValue;
        }
        this.largestValue = (V) largest;
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
