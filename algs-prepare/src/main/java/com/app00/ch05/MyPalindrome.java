package com.app00.ch05;

public class MyPalindrome {

    public static void main(String[] args) {
        boolean res = isPalindrome("Able was I ere I saw Elba");
        System.out.println("res="+res);
    }

    public static boolean isPalindrome(String s){
        char[] data = s.toLowerCase().toCharArray();
        for(int i=0;i<data.length;i++){
            if(data[i]!=data[data.length-1-i]){
                return false;
            }
        }
        return true;
    }

}
