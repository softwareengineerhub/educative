package com.app03.concurr.ch01;

public class ReaderThread extends Thread {
    private MyData myData;

    public ReaderThread(MyData myData) {
        this.myData = myData;
    }

    public void run(){
        int tmp = myData.getValue();
        while(tmp<5){
            if(tmp!=myData.getValue()){
                System.out.println("Changes detected!!!");
                tmp=myData.getValue();
            }
        }
        System.out.println("Reader. Finish "+myData);
    }

}
