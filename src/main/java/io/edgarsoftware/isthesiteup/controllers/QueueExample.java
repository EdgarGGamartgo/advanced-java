package io.edgarsoftware.isthesiteup.controllers;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Anna");
        queue.add("Nick");

        String anna = queue.poll();
        String nick = queue.poll();

        System.out.println(anna);
        System.out.println(nick);

    } 
}
