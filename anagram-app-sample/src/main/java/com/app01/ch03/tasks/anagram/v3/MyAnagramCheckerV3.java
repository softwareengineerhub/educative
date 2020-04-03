/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app01.ch03.tasks.anagram.v3;

import com.app01.ch03.tasks.anagram.app.MyAnagramChecker;
import static com.app01.ch03.tasks.anagram.app.MyAnagramChecker.hasSameSize;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 * @author asusadmin
 */
public class MyAnagramCheckerV3 implements MyAnagramChecker {

    @Override
    public boolean isValidAnagram(String source, String target) {
        if (hasSameSize(source, target)) {
            Map<Character, Long> mapSource = processContent(source);
            Map<Character, Long> mapTarget = processContent(target);
            return mapSource.equals(mapTarget);
        }
        return false;
    }

    private Map<Character, Long> processContent(String content) {
        return content.chars().mapToObj(i -> new Character((char) i)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

}
