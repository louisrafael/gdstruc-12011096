package com.rafejingco;

import java.util.EmptyStackException;

public class CardStack {
    private Card[] stack;
    private int top;

    public CardStack(int capacity) { stack = new Card[capacity];}

    public void push(Card name)
    {
        if (top == stack.length)
        {
            Card[] newStack = new Card[2 * stack.length];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }

        stack[top++] = name;
    }

    public void pop()
    {
        if (toEmpty())
        {
            throw new EmptyStackException();
        }

        Card poppedElement = stack[--top]; // DOUBLE CHECK
        stack[top] = null;
        //return poppedElement;
    }

    public Card peek()
    {
        if (toEmpty())
        {
            throw new EmptyStackException();
        }

        return stack[top - 1];
    }

    public boolean toEmpty()
    {
        return top == 0;
    }

    public void printStack()
    {
        for(int i = top - 1; i >= 0; i--)
        {
            System.out.println(stack[i]);
        }
    }

    public void action(CardStack newStack, int xCards)
    {
        if (toEmpty())
        {
            throw new EmptyStackException();
        }

        for (int i = top - 1; i >= top - xCards; i--)
        {
            newStack.push(stack[i]);
        }

        for (int i = 0; i < xCards; i++)
        {
            pop();
        }

    }

    public int getTop() {
        return top;
    }

    public Card[] getStack() {
        return stack;
    }
}
