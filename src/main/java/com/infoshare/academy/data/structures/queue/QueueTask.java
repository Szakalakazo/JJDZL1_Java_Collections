package com.infoshare.academy.data.structures.queue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueTask {

    public static void main(String[] args) {


        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(3);
        priorityQueue.add(7);
        priorityQueue.add(3);
        priorityQueue.add(74);
        priorityQueue.add(1);
        priorityQueue.add(-5);
        priorityQueue.add(7785);
        System.out.println(priorityQueue);

        System.out.println("Peek");
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue);

        System.out.println("Poll");
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);

        Queue q1 = new ArrayBlockingQueue(3);
        q1.add(11);
        q1.add(2);
        q1.offer(3);
        System.out.println(q1.offer(5));
        System.out.println(q1.offer(66));
        System.out.println(q1);

    }
}
