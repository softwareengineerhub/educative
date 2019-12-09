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
public class MyBinaryTree {

    private MyNode root;
    private int n;

    public void add(int value) {
        if (root == null) {
            root = new MyNode(value);
            n++;
            return;
        }
        insert(root, new MyNode(value));
        n++;
    }

    private void insert(MyNode node, MyNode candidate) {
        int nodeValue = node.getValue();
        MyNode nextItem = candidate.getValue() <= nodeValue ? node.getLeftChild() : node.getRightChild();
        if (nextItem != null) {
            insert(nextItem, candidate);
        } else {
            //MyNode tmp = new MyNode(value);
            if (candidate.getValue() <= nodeValue) {
                node.setLeftChild(candidate);
            } else {
                node.setRightChild(candidate);
            }
            candidate.setParent(node);
        }
    }

    public int size() {
        return n;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public void remove(MyNode node) {
        if (root == null) {
            return;
        }
        int value = node.getValue();
        MyNode tmp = root;
        while (!tmp.isLeaf()) {
            if (tmp.getValue() == value) {

                //remove from start
                if (tmp.isRoot()) {
                    if (tmp.isLeaf()) {
                        root = null;
                    } else {
                        MyNode leftChild = root.getLeftChild();
                        MyNode rightChild = root.getRightChild();
                        leftChild.setParent(null);
                        rightChild.setParent(null);
                        root = leftChild;
                        insert(root, rightChild);
                    }
                    n--;
                }

                //remove from middle
                if (!tmp.isRoot() && !tmp.isLeaf()) {
                    MyNode parent = tmp.getParent();

                    if (tmp.getValue() <= parent.getValue()) {
                        parent.setLeftChild(null);
                    } else {
                        parent.setRightChild(null);
                    }
                    n--;
                }

                //remove from end
                if (tmp.isLeaf()) {
                    MyNode tmpParent = tmp.getParent();
                    if (value <= tmpParent.getValue()) {
                        tmpParent.setLeftChild(null);
                    } else {
                        tmpParent.setRightChild(null);
                    }
                    n--;
                }

            } else if (value <= tmp.getValue()) {
                tmp = tmp.getLeftChild();
            } else {
                tmp = tmp.getRightChild();
            }
        }
    }

    public MyNode findByKey(int key) {
        return null;
    }

    public int getHeight() {
        return getHeight(root, 0);
    }

    private int getHeight(MyNode node, int cuurentHeight) {
        if (node == null) {
            return cuurentHeight;
        }
        if (node.isLeaf()) {
            return cuurentHeight;
        }
        int leftHeight = getHeight(node.getLeftChild(), cuurentHeight + 1);
        int rightHeight = getHeight(node.getRightChild(), cuurentHeight + 1);
        return Math.max(leftHeight, rightHeight);
    }

}
