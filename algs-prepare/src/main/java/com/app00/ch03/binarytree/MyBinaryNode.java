package com.app00.ch03.binarytree;

public class MyBinaryNode {
    private MyBinaryNode parent;
    private int value;
    private MyBinaryNode leftChild;
    private MyBinaryNode rightChild;

    public MyBinaryNode(int value) {
        this.value = value;
    }

    public MyBinaryNode() {
    }

    public MyBinaryNode getParent() {
        return parent;
    }

    public void setParent(MyBinaryNode parent) {
        this.parent = parent;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public MyBinaryNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(MyBinaryNode leftChild) {
        this.leftChild = leftChild;
    }

    public MyBinaryNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(MyBinaryNode rightChild) {
        this.rightChild = rightChild;
    }
}
