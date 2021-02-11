package io.edgarsoftware.isthesiteup.controllers;

import java.util.ArrayList;

public class ArrayListExample {
    
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        ArrayList<String> myCars = new ArrayList<>();
        myCars.add(cars.get(0));
        System.out.println(cars);
        System.out.println(myCars);
        myCars.set(0, "BMW");
        System.out.println(myCars + " " + myCars.size());
    }

}
