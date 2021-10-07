package com.gdstruc.module4;

public class Main {

    public static void main(String[] args) {

	/* Queue Behaviours and Operations

    Abstract data type
    FIFO - First In, First Out

    Functions:
    enqueue() - adds an item to the end of the queue
    dequeue() - removes the item(front element) at the front of the queue
    * next element will be front and other element will be disregarded
    peek() - gets the item in front of the queue

    Ideal backing data structure: linked list */

        ArrayQueue queue = new ArrayQueue(5);

        queue.add(new Player(1, "aceu", 100));
        queue.add(new Player(2, "Sinatraa", 100));
        queue.add(new Player(3, "Subroza", 95));
        queue.add(new Player(4, "ploo", 90));

        queue.printQueue();
        //queue.remove();

        System.out.println("After popping:" + queue.remove());
        queue.printQueue();
    }
}
