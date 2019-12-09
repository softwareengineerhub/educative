/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trash2;

/**
 *
 * @author DProkopiuk
 */
public class MyNode {

    private int value;
    private MyNode parent;
    private MyNode leftChild;
    private MyNode rightChild;

    public MyNode() {
    }

    public MyNode(int value) {
        this.value = value;
    }

    public boolean isLeaf() {
        return leftChild == null && rightChild == null;
    }

    public boolean isRoot() {
        return parent == null;
    }

    public MyNode getParent() {
        return parent;
    }

    public void setParent(MyNode parent) {
        this.parent = parent;
    }

    public MyNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(MyNode leftChild) {
        this.leftChild = leftChild;
    }

    public MyNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(MyNode rightChild) {
        this.rightChild = rightChild;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
