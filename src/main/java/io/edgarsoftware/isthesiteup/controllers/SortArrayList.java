package io.edgarsoftware.isthesiteup.controllers;

import java.util.ArrayList;
import java.util.Collections;


public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        numbers.add(45);
        numbers.add(2);
        numbers.add(145);
        System.out.println(cars);
        System.out.println(numbers);
        Collections.sort(cars);
        Collections.sort(numbers);
        System.out.println(cars);
        System.out.println(numbers);
    }
}
