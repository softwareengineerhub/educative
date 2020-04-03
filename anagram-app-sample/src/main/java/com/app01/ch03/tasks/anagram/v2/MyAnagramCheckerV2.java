/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app01.ch03.tasks.anagram.v2;

import com.app01.ch03.tasks.anagram.app.MyAnagramChecker;
import static com.app01.ch03.tasks.anagram.app.MyAnagramChecker.hasSameSize;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author asusadmin
 */
public class MyAnagramCheckerV2 implements MyAnagramChecker {

    @Override
    public boolean isValidAnagram(String source, String target) {
        if (hasSameSize(source, target)) {
            Map<Character, Integer> mapSource = processContent(source);
            Map<Character, Integer> mapTarget = processContent(target);
            return mapSource.equals(mapTarget);
        }
        return false;
    }
    
    private Map<Character, Integer> processContent(String content){
        char[] data = content.toCharArray();
        Map<Character, Integer> map = new HashMap();
        for(char c: data){
            if(!map.containsKey(c)){
                map.put(c, 1);
            }else{
                map.put(c, map.get(c)+1);
            }
        }
        return map;
    }

}
