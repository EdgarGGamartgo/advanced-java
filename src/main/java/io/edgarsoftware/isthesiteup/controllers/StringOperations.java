package io.edgarsoftware.isthesiteup.controllers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.Arrays;

public class StringOperations {
    final static char myChar = 'A'; 
    final static String myPhrase = "This is very easy";
    static List<String> myCollection = new ArrayList<String>();

    public static void main(String[] args) {
        System.out.println(myChar);
        final String myString = String.valueOf(myChar) + "BC";
        System.out.println(myString);
        System.out.println(myString.charAt(0));
        System.out.println(myPhrase.replaceAll("\\s+", ""));
        myCollection.add("This");
        myCollection.add("is");
        myCollection.add("my");
        myCollection.add("collection!");
        String joinedCollection = fromCollection(myCollection);
        System.out.println(joinedCollection);
        String[] splittedString = joinedCollection.split(" ");
        System.out.println(Arrays.toString(splittedString));

    }

    static <T> String fromCollection(final Collection<T> collection) { 
        return collection.stream().map(Objects::toString).collect(Collectors.joining(" "));
     }
}
