/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app02.stackqueue.сh02.array2stacks;

/**
 *
 * @author asusadmin
 */
public class TwoStacks {
    private Object[] data = new Object[10];
    private int leftIndex;
    private int rightIndex = data.length-1;

    public void push1(Object value) {
        increaseArray();
        data[leftIndex++]= value;
    }
    
    private void increaseArray(){
        if(leftIndex==rightIndex){
            Object[] tmp = new Object[data.length+data.length];
            for(int i=0;i<leftIndex;i++){
                tmp[i] = data[i];
            }                        
            for(int i=data.length-1;i>rightIndex;i--){
                tmp[i] = data[i];
            }            
        }
    }

    public void push2(Object value) {
        increaseArray();
        data[rightIndex--] = value;
    }

    public Object pop1() {
       Object tmp = data[leftIndex-1];
       data[leftIndex-1] = null;
       return tmp;
    }

    public Object pop2() {
        Object tmp = data[rightIndex+1];
        data[rightIndex+1] = null;
        return tmp;
    }

}
