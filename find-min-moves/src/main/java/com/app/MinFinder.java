package com.app;

import java.util.*;

public class MinFinder {

    public int findSteps(int[] data){
        int sum = sum(data);
        if(sum%data.length!=0){
            return -1;
        }
        Arrays.sort(data);
        //System.out.println("sorted="+Arrays.toString(data));
        int needed = sum/data.length;
        int step = 0;
        int j = data.length-1;
        for(int i=0;i<data.length;i++){

            System.out.println(Arrays.toString(data));
            if(data[0]==needed){
                continue;
            }

            int req = needed - data[0];
            while(data[j]==needed){
                j--;
            }
            if(data[j]>=req){
                step++;
                data[0] = needed;
                data[j] = data[j] - req;
            }


          //  System.out.println(Arrays.toString(data));
            System.out.println("step="+step);
            j = data.length-1;
            Arrays.sort(data);
        }
        return step;
    }

    private int sum(int[] data){
        int sum = 0;
        for(int i=0;i<data.length;i++){
            sum+=data[i];
        }
        return sum;
    }
}
