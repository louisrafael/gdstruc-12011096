package com.gdstruc.module3;

import java.util.EmptyStackException;

public class ArrayStack {
    private Player[] stack;
    private int top;

    public ArrayStack(int capacity)
    {
        stack = new Player[capacity];
    }

    public int getTop() {
        return top;
    }

    public void push(Player player)
    {
        if (top == stack.length) // stack is full // resize the array
        {
            Player[] newStack = new Player[2 * stack.length];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            // srcPos: 0 (starts at this index from the old array)
            // destPos: 0 (copies from this index to the new array)
            // stack.length (from 0 to the last element of the stack)
            stack = newStack;
        }

        stack[top++] = player; // top element will now be the new player that we have added
    }

    public Player pop()
    {
        if (isEmpty())
        {
            throw new EmptyStackException(); // if stack is empty, rest of the pop() function won't run anymore
        }

        Player poppedPlayer = stack[--top]; // decrement top
        stack[top] = null;
        return poppedPlayer; // last element
    }

    public Player peek()
    {
        if (isEmpty())
        {
            throw new EmptyStackException(); // if stack is empty, rest of the pop() function won't run anymore
        }

        return stack[top - 1]; // top value is always empty, top value of the stack should always be the next available slot of our stack
    }

    public boolean isEmpty()
    {
        return top == 0;
    }

    public void printStack()
    {
        System.out.println("Printing stack: ");
        for (int i = top - 1; i >= 0; i--) // Printing the stack from top to bottom
        {
            System.out.println(stack[i]);
        }
    }
}
