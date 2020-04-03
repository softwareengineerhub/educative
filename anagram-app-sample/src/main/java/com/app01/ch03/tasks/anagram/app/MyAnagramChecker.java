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
public interface MyAnagramChecker {

    public boolean isValidAnagram(String source, String target);

    public static boolean hasSameSize(String source, String target) {
        return source.length() == target.length();
    }

}
