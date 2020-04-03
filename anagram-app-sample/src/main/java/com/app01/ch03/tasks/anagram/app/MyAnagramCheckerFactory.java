/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app01.ch03.tasks.anagram.app;

import com.app01.ch03.tasks.anagram.v1.MyAnagramCheckerV1;
import com.app01.ch03.tasks.anagram.v2.MyAnagramCheckerV2;
import com.app01.ch03.tasks.anagram.v3.MyAnagramCheckerV3;

/**
 *
 * @author asusadmin
 */
public class MyAnagramCheckerFactory {
    
    public static MyAnagramChecker getChecker(int type){
        switch(type){
            case 1:
                return new MyAnagramCheckerV1();
            case 2:
                return new MyAnagramCheckerV2();
            case 3:
                return new MyAnagramCheckerV3();
            default:
                throw new RuntimeException(String.format("Incorrect type=%s", type));
        }
    }
    
}
