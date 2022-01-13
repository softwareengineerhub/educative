package com.app03.concurr.ch01;

public class WriterThread extends Thread {
    private MyData myData;

    public WriterThread(MyData myData) {
        this.myData = myData;
    }

    public void run() {
        int i=0;
        while (i <= 5) {
            myData.setValue(myData.getValue()+1);
            System.out.println("step " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            i++;
        }
        System.out.println("writer completed");
    }

}
