package com.app00.ch03;

public class MyBinaryTree {
    private MyBinaryNode root;
    private int size;

    public void add(int value){
        if(root==null){
            root = new MyBinaryNode(value);
        }else{
            insert(root, value);
        }
        size++;
    }

    private void insert(MyBinaryNode node, int value){
        if(value<=node.getValue()){
            if(node.getLeftChild()!=null){
                insert(node.getLeftChild(), value);
            }else{
                MyBinaryNode tmp = new MyBinaryNode(value);
                tmp.setParent(node);
                node.setLeftChild(tmp);
            }
        } else {
            if(node.getRightChild()!=null){
                insert(node.getRightChild(), value);
            }else{
                MyBinaryNode tmp = new MyBinaryNode(value);
                tmp.setParent(node);
                node.setRightChild(tmp);
            }
        }
    }


}
