package com.gdstruc.module7;

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
        System.out.println(tree.get(255));


        /*
        Trees:
        Hierarchical data structure
        * Nodes
        * Edges
        * Root
        * Leaf
        * Example: Computer Directory

        Trees (Theory)
        * Every item in the tree is a node
        * The node at the top of the tree is the root
        * Every non-root node has one and only one parent
        * A leaf node has no children
        * A singleton tree has only one node - the root

        Binary Trees
        * Every node has 0, 1, or 2 children
        * Children are referred to as left child and right child.

        Complete Binary Tree
        * Every level except the last level has two children
        * In the last level, the leaves are at the left-most position

        Full Binary Tree (By definition: a full binary tree is a complete binary tree)
        Every node other than the leaves has two children

        Binary Search Trees (BST)
        * Can perform insertions, deletions, and retrievals in O(logn) time
        * left child always has the smaller value than its parent
        * right child always has a larger value than its parent
        * Everything to the left of the root is less than the value of the root, and everything to the right of the root is greater than the value if the root.
        * Binary search works best

        TREE TRAVERSAL
        Level- visit nodes on each level
        Pre-order - visit the root of every subtree first
        Post-Order - visit the root of every subtree last
        In-Order - visit left child, then root, then right child
        */
    }
}
