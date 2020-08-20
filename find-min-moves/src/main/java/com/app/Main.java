package com.app;

public class Main {

    public static void main(String[] args) {
        int[] data = {1,1,1,1,6};
        MinFinder minFinder = new MinFinder();
        int steps = minFinder.findSteps(data);
        System.out.println("min="+steps);

        System.out.println("---------------------");
        data = new int[]{4,6,3,7,5};
        minFinder = new MinFinder();
        steps = minFinder.findSteps(data);
        System.out.println("min="+steps);


        System.out.println("---------------------");
        data = new int[]{9,5,2,7,6,1};
        minFinder = new MinFinder();
        steps = minFinder.findSteps(data);
        System.out.println("min="+steps);
    }

}
