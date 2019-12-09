/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.app2;

/**
 *
 * @author DProkopiuk
 */
public class Main {
    private static int[][] data = new int[3][];

    public static void main(String[] args) {
        /*data[0] = new int[]{1,2,3};
        data[1] = new int[]{3,4,5};
        data[2] = new int[]{6,7,8};*/
        
        data[0] = new int[]{1,2,3};
        data[1] = new int[]{1,2,3};
        data[2] = new int[]{1,2,3};
        
        int res = calculate(0, 0, "");
        System.out.println(res);
    }
    
    
        
    private static int calculate(int i, int j, String str){
        if(i>=data.length){
            return 0;
        }
        if(j>=data[i].length){
            return 0;
        }        
        System.out.println(str+"-----------------"+i+" ; "+j);
        int a = calculate(i+1, j, str+"\t");
        int b = calculate(i, j+1, str+"\t");
        int max = Math.max(a, b);
        System.out.println(str+"q="+max);
        
        int res = max+data[i][j];
        System.out.println(str+"-----------------res="+res);
        return res;
    }
    
}
