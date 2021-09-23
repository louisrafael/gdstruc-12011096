package com.gdstruc.module3;

public class Main {

    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(5);

        //LinkedStack stack = new LinkedStack();

        // LIFO (last in, first out)
        stack.push(new Player(1, "aceu", 100)); // last stack
        stack.push(new Player(2, "Sinatra", 100));
        stack.push(new Player(3, "Subroza", 95));
        stack.push(new Player(4, "ploo", 90)); // top stack / top element

        //stack.printStack();

        stack.printStack();
    }

}
