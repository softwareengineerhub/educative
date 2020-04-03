/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app01.ch03.tasks.anagram.app;

/**
 *
 * @author asusadmin
 */
public class Main {

    public static void main(String[] args) {
        MyAnagramChecker mac = MyAnagramCheckerFactory.getChecker(1);
        boolean res = mac.isValidAnagram("abc", "cba");
        System.out.println("res="+res);
        
    }
    
}
