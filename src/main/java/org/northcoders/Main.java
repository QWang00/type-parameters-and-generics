package org.northcoders;




//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Box<String, Number> box1 = new Box<>("Str");
        Box<Number, String> box2 = new Box<>("Num");
        Box<Integer, String> box22 = new Box<>("Int");
        Box<Double, String> box23 = new Box<>("Num");
        // whatever passed is the child of "this"
        boolean result = box2.hasSameName(box22);
        boolean result2 = box2.hasSameName(box23);


        System.out.println("compare Number and Integer name is " +result);
        System.out.println("compare Number and Double name is " +result2);


        //ArrayList<Integer> nums = {1,2,3};
        box1.castValue(5);



    }
}