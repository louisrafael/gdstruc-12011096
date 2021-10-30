package com.rafejingco;

public class Node {
    private int data;
    private Node leftChild;
    private Node rightChild;

    public Node getMin()
    {
        if (leftChild != null)
        {
            if (leftChild.getMin() == null)
            {
                System.out.println(leftChild);
            }
            return this;
        }

        return null;
    }

    public Node getMax()
    {
        if (rightChild != null)
        {
            if (rightChild.getMax() == null)
            {
                System.out.println(rightChild);
            }
            return this;
        }

        return null;
    }

    public void traverseInOrderDescending()
    {
        if (rightChild != null)
        {
            rightChild.traverseInOrderDescending();
        }
        System.out.println("Data: " + data);

        if (leftChild != null)
        {
            leftChild.traverseInOrderDescending();
        }
    }


    public void insert(int value)
    {
        if(value == data) // duplicate value, return
        {
            return;
        }

        if (value < data)
        {
            if (leftChild == null)
            {
                leftChild = new Node(value);
            }
            else
            {
                leftChild.insert(value);
            }
        }
        else
        {
            if (rightChild == null)
            {
                rightChild = new Node(value);
            }
            else
            {
                rightChild.insert(value);
            }
        }
    }

    public Node get(int value)
    {
        if (value == data)
        {
            return this;
        }

        if (value < data)
        {
            if (leftChild != null)
            {
                return leftChild.get(value);
            }
        }
        else
        {
            if(rightChild != null)
            {
                return rightChild.get(value);
            }
        }

        return null;
    }

    public void traverseInOrder()
    {
        if (leftChild != null)
        {
            leftChild.traverseInOrder();
        }
        System.out.println("Data: " + data);

        if (rightChild != null)
        {
            rightChild.traverseInOrder();
        }
    }


    public Node(int _data) {
        this.data = _data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
