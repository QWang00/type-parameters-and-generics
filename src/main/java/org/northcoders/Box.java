package org.northcoders;

import com.sun.jdi.event.ExceptionEvent;

public class Box<T> {

    private T number;

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
