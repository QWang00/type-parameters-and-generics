package org.northcoders;


import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Box<String, Double> box1 = new Box<>("Str");
        Box<Number, Double> box2 = new Box<>("Num");
        Box<Integer, Float> box22 = new Box<>("Int");
        Box<Double, Short> box23 = new Box<>("Num");
        // whatever passed is the child of "this"
//        boolean result = box2.hasSameName(box22);
//        boolean result2 = box2.hasSameName(box23);


//        System.out.println("compare Number and Integer name is " +result);
//        System.out.println("compare Number and Double name is " +result2);


        //ArrayList<Integer> nums = {1,2,3};
        List<Float> someList = new ArrayList<>();
        someList.add(5.2f);
        someList.add(10.1f);
        box22.setLargestValueFromList(someList);




    }
}