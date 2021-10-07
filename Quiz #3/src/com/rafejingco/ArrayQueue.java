package com.rafejingco;

import java.util.NoSuchElementException;

public class ArrayQueue {
    private Player[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity)
    {
        queue = new Player[capacity];
    }

    public void add(Player player)
    {
        if(back == queue.length)
        {
            Player[] newArray = new Player[queue.length * 2];
            System.arraycopy(queue,0, newArray, 0, queue.length);
            queue = newArray;
        }

        queue[back] = player;
        back++;
    }

    public void remove()
    {
        if(empty() == 0)
        {
            throw new NoSuchElementException();
        }
        
        //Player removedPlayer =  queue[front];
        queue[front] = null;
        front++;

        if(empty() == 0)
        {
            front = 0;
            back = 0;
        }
        
        //return removedPlayer;
    }
    
    public Player peek()
    {
        if(empty() == 0)
        {
            throw new NoSuchElementException();
        }
        
        return queue[front];
    }

    public int empty()
    {
        return back - front;
    }
    
    public void print()
    {
        for(int i = front; i < back; i++)
        {
            System.out.println(queue[i]);
        }
    }
}
