/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app01.ch03.tasks.anagram.v1;

import com.app01.ch03.tasks.anagram.app.MyAnagramChecker;
import static com.app01.ch03.tasks.anagram.app.MyAnagramChecker.hasSameSize;
import java.util.Arrays;

/**
 *
 * @author asusadmin
 */
public class MyAnagramCheckerV1 implements MyAnagramChecker {

    @Override
    public boolean isValidAnagram(String source, String target) {
        if (hasSameSize(source, target)) {
            char[] dataSource = source.toCharArray();
            char[] dataTarget = target.toCharArray();
            Arrays.sort(dataSource);
            Arrays.sort(dataTarget);
            return Arrays.equals(dataSource, dataTarget);
        }
        return false;
    }

}
