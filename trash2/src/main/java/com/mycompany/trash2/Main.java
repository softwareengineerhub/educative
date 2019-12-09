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
public class Main {
    
    public static void main(String[] args) {
        MyBinaryTree myBinaryTree = new MyBinaryTree();
        myBinaryTree.add(0);
        myBinaryTree.add(10);
        myBinaryTree.add(-10);
        myBinaryTree.add(5);
        myBinaryTree.add(-15);
        myBinaryTree.add(-5);
        myBinaryTree.add(15);
        
        System.out.println("size="+myBinaryTree.size());
        
    }
    
}
