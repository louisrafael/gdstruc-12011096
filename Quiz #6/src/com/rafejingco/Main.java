package com.rafejingco;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Tree tree = new Tree();

        tree.insert(25);
        tree.insert(17);
        tree.insert(29);
        tree.insert(10);
        tree.insert(16);
        tree.insert(-5);
        tree.insert(60);
        tree.insert(55);

        //tree.traverseInOrder();
        //System.out.println(tree.get(25));

        //tree.getMin();
        //tree.getMax();
        //tree.traverseInOrderDescending();

    }
}
