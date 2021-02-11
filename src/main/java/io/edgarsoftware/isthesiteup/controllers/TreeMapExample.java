package io.edgarsoftware.isthesiteup.controllers;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> treemap = new TreeMap<>();
        treemap.put(3, "TreeMap");
        treemap.put(2, "vs");
        treemap.put(1, "HashMap");
        //treemap.put(null, "NullPointerException");
        System.out.println(treemap);
    } 
}
